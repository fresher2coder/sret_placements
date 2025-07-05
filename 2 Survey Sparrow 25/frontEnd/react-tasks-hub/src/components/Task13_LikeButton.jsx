// components/Task13_LikeButton.jsx
import { useState } from "react";

export default function Task13_LikeButton() {
  const [liked, setLiked] = useState(false);
  const [count, setCount] = useState(0);

  const toggleLike = () => {
    setLiked(!liked);
    setCount((prev) => prev + (liked ? -1 : 1));
  };

  return (
    <div className="task">
      <h2>Post Card</h2>
      <p>This is a simple post description...</p>
      <button
        onClick={toggleLike}
        style={{
          color: liked ? "red" : "black",
          fontWeight: "bold",
          fontSize: "18px",
        }}
      >
        ❤️ {count} Like{count !== 1 ? "s" : ""}
      </button>
    </div>
  );
}
