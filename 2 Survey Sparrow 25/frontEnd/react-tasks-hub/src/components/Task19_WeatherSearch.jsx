import { useEffect, useState } from "react";

const countryStateMap = {
  India: ["Delhi", "Mumbai", "Chennai", "Bangalore"],
  USA: ["New York", "Los Angeles", "Chicago", "San Francisco"],
  UK: ["London", "Manchester", "Liverpool"],
  Australia: ["Sydney", "Melbourne", "Brisbane"],
};

export default function Task19_WeatherSearch() {
  const [country, setCountry] = useState("");
  const [state, setState] = useState("");
  const [weather, setWeather] = useState(null);

  const fetchWeather = () => {
    if (!country || !state) return;

    const apiKey = "5743aa3b69150b05795f2cb862de6742"; // Replace with real key
    const url = `https://api.openweathermap.org/data/2.5/weather?q=${state},${country}&appid=${apiKey}&units=metric`;

    fetch(url)
      .then((res) => {
        if (!res.ok) throw new Error("City not found");
        return res.json();
      })
      .then((data) => {
        setWeather({
          temp: data.main.temp,
          desc: data.weather[0].description,
        });
      })
      .catch(() =>
        setWeather({ error: "Weather not available for this city." })
      );
  };

  const handleKeyPress = (e) => {
    if (e.key === "Enter") fetchWeather();
  };

  return (
    <div className="task">
      <h2>Weather Search (Dropdown Version)</h2>

      <label>Country:</label>
      <select
        value={country}
        onChange={(e) => {
          setCountry(e.target.value);
          setState("");
          setWeather(null);
        }}
      >
        <option value="">-- Select Country --</option>
        {Object.keys(countryStateMap).map((c) => (
          <option key={c} value={c}>
            {c}
          </option>
        ))}
      </select>

      <br />
      <br />

      <label>City / State:</label>
      <select
        value={state}
        onChange={(e) => setState(e.target.value)}
        onKeyDown={handleKeyPress}
        disabled={!country}
      >
        <option value="">-- Select City --</option>
        {country &&
          countryStateMap[country].map((s) => (
            <option key={s} value={s}>
              {s}
            </option>
          ))}
      </select>

      <br />
      <br />
      <button onClick={fetchWeather} disabled={!state}>
        Get Weather
      </button>

      {weather && (
        <div style={{ marginTop: "20px" }}>
          {weather.error ? (
            <p style={{ color: "red" }}>{weather.error}</p>
          ) : (
            <>
              <p>
                <strong>Temperature:</strong> {weather.temp}°C
              </p>
              <p>
                <strong>Condition:</strong> {weather.desc}
              </p>
            </>
          )}
        </div>
      )}
    </div>
  );
}
