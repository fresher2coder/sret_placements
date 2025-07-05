// components/Task3_ColorChanger.jsx
import { useState } from 'react';

export default function Task3_ColorChanger() {
  const [color, setColor] = useState("white");

  return (
    <div className="task" style={{ backgroundColor: color, padding: '40px' }}>
      <h2>Color Changer</h2>
      <button onClick={() => setColor("red")}>Red</button>
      <button onClick={() => setColor("blue")} style={{ margin: '0 10px' }}>Blue</button>
      <button onClick={() => setColor("green")}>Green</button>
    </div>
  );
}
