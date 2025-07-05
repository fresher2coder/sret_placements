// components/Task18_BlogFeed.jsx
import { useEffect, useState } from "react";

export default function Task18_BlogFeed() {
  const [posts, setPosts] = useState([]);

  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts?_limit=5")
      .then((res) => res.json())
      .then((data) => setPosts(data))
      .catch((err) => console.error("Failed to fetch:", err));
  }, []);

  return (
    <div className="task">
      <h2>Fake Blog Feed</h2>
      {posts.map((post) => (
        <div
          key={post.id}
          style={{
            borderBottom: "1px solid #ccc",
            paddingBottom: 10,
            marginBottom: 10,
          }}
        >
          <h4>{post.title}</h4>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
}
