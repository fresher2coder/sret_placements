// components/Task8_ConditionalMessage.jsx
import { useState } from "react";

export default function Task8_ConditionalMessage() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
    <div className="task">
      <h2>Conditional Message</h2>
      <p>{loggedIn ? "Welcome!" : "Please login."}</p>
      <button onClick={() => setLoggedIn(!loggedIn)}>
        {loggedIn ? "Logout" : "Login"}
      </button>
    </div>
  );
}
