// components/Task6_DigitalClock.jsx
import { useEffect, useState } from "react";

export default function Task6_DigitalClock() {
  const [time, setTime] = useState(new Date());

  useEffect(() => {
    const timer = setInterval(() => setTime(new Date()), 1000);
    return () => clearInterval(timer); // Cleanup
  }, []);

  return (
    <div className="task">
      <h2>Digital Clock</h2>
      <h1>{time.toLocaleTimeString()}</h1>
    </div>
  );
}
