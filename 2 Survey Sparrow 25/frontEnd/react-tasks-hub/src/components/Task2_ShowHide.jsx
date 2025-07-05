// components/Task2_ShowHide.jsx
import { useState } from 'react';

export default function Task2_ShowHide() {
  const [show, setShow] = useState(true);

  return (
    <div className="task">
      <h2>Show / Hide Text</h2>
      <button onClick={() => setShow(!show)}>
        {show ? "Hide Quote" : "Show Quote"}
      </button>
      {show && <p style={{ marginTop: '20px' }}>“The only way to do great work is to love what you do.”</p>}
    </div>
  );
}
