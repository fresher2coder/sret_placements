// components/Task1_Counter.jsx
import { useState } from 'react';

export default function Task1_Counter() {
  const [count, setCount] = useState(0);

  return (
    <div className="task">
      <h2>Counter App</h2>
      <button onClick={() => setCount(count - 1)}>-</button>
      <span style={{ margin: '0 20px' }}>{count}</span>
      <button onClick={() => setCount(count + 1)}>+</button>
    </div>
  );
}
