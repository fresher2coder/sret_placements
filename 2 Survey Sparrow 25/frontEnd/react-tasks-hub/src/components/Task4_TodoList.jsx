// components/Task4_TodoList.jsx
import { useState } from "react";

export default function Task4_TodoList() {
  const [task, setTask] = useState("");
  const [todos, setTodos] = useState([]);

  const addTask = () => {
    if (task.trim() !== "") {
      setTodos([...todos, task]);
      setTask("");
    }
  };

  const deleteTask = (index) => {
    const newTodos = [...todos];
    newTodos.splice(index, 1);
    setTodos(newTodos);
  };

  return (
    <div className="task">
      <h2>To-Do List</h2>
      <input
        type="text"
        placeholder="Enter a task"
        value={task}
        onChange={(e) => setTask(e.target.value)}
      />
      <button onClick={addTask}>Add</button>
      <ul style={{ marginTop: "20px" }}>
        {todos.map((item, idx) => (
          <li key={idx}>
            {item}
            <button
              onClick={() => deleteTask(idx)}
              style={{ marginLeft: "10px", color: "red" }}
            >
              ✖
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}
