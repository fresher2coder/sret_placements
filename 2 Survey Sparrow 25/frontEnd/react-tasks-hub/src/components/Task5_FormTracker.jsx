// components/Task5_FormTracker.jsx
import { useState } from "react";

export default function Task5_FormTracker() {
  const [name, setName] = useState("");

  return (
    <div className="task">
      <h2>Form Input Tracker</h2>
      <input
        type="text"
        placeholder="Type your name..."
        value={name}
        onChange={(e) => setName(e.target.value)}
      />
      <p style={{ marginTop: "20px" }}>
        Live Preview: <strong>{name}</strong>
      </p>
    </div>
  );
}
