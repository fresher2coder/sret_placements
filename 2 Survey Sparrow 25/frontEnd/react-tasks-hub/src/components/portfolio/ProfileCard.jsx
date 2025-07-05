export default function ProfileCard({ name, skills, links }) {
  return (
    <div
      style={{
        border: "1px solid #aaa",
        padding: "10px",
        marginBottom: "10px",
      }}
    >
      <h3>{name}</h3>
      <p>
        <strong>Skills:</strong> {skills.join(", ")}
      </p>
      <p>
        <strong>Links:</strong>
      </p>
      <ul>
        {links.map((l, i) => (
          <li key={i}>
            <a href={l.url} target="_blank" rel="noreferrer">
              {l.label}
            </a>
          </li>
        ))}
      </ul>
    </div>
  );
}
