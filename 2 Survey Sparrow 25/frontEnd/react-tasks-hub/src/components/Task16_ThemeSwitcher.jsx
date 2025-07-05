// components/Task16_ThemeSwitcher.jsx
import { useState, useEffect } from "react";

export default function Task16_ThemeSwitcher() {
  const [darkMode, setDarkMode] = useState(false);

  useEffect(() => {
    document.body.className = darkMode ? "dark" : "";
    return () => (document.body.className = "");
  }, [darkMode]);

  return (
    <div className="task">
      <h2>Theme Switcher</h2>
      <button onClick={() => setDarkMode(!darkMode)}>
        Switch to {darkMode ? "Light" : "Dark"} Mode
      </button>
    </div>
  );
}
