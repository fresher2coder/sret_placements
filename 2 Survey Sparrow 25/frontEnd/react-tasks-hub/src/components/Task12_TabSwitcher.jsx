// components/Task12_TabSwitcher.jsx
import { useState } from "react";

export default function Task12_TabSwitcher() {
  const [tab, setTab] = useState("About");

  const tabs = {
    About: "I am learning React to build awesome UI.",
    Skills: "HTML, CSS, JavaScript, React, Git",
    Contact: "Email: me@example.com",
  };

  return (
    <div className="task">
      <h2>Tab Switcher</h2>
      <div>
        {Object.keys(tabs).map((key) => (
          <button
            key={key}
            onClick={() => setTab(key)}
            style={{ margin: "0 5px" }}
          >
            {key}
          </button>
        ))}
      </div>
      <p style={{ marginTop: "20px" }}>{tabs[tab]}</p>
    </div>
  );
}
