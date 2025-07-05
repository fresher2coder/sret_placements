import { Link, Outlet } from "react-router-dom";

export default function Task10_Portfolio() {
  return (
    <div className="task">
      <h2>React Portfolio</h2>
      <nav style={{ marginBottom: "20px" }}>
        <Link to="/task/10/home">Home</Link> |{" "}
        <Link to="/task/10/about">About</Link> |{" "}
        <Link to="/task/10/projects">Projects</Link>
      </nav>
      <Outlet />
    </div>
  );
}
