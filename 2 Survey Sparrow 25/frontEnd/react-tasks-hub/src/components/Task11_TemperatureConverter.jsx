// components/Task11_TemperatureConverter.jsx
import { useState } from "react";

export default function Task11_TemperatureConverter() {
  const [celsius, setCelsius] = useState("");
  const [fahrenheit, setFahrenheit] = useState("");

  const convertCtoF = (e) => {
    const c = e.target.value;
    setCelsius(c);
    setFahrenheit(c === "" ? "" : ((c * 9) / 5 + 32).toFixed(2));
  };

  const convertFtoC = (e) => {
    const f = e.target.value;
    setFahrenheit(f);
    setCelsius(f === "" ? "" : (((f - 32) * 5) / 9).toFixed(2));
  };

  return (
    <div className="task">
      <h2>Temperature Converter</h2>
      <input
        type="number"
        value={celsius}
        onChange={convertCtoF}
        placeholder="Celsius"
      />
      <span style={{ margin: "0 10px" }}>↔</span>
      <input
        type="number"
        value={fahrenheit}
        onChange={convertFtoC}
        placeholder="Fahrenheit"
      />
    </div>
  );
}
