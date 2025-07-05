import ProfileCard from "./portfolio/ProfileCard";

export default function Task20_PropsPortfolio() {
  const devProfiles = [
    {
      name: "Alice",
      skills: ["HTML", "CSS", "React"],
      links: [
        { label: "GitHub", url: "https://github.com/fresher2coder" },
        {
          label: "LinkedIn",
          url: "https://linkedin.com/in/dineshkumar-thangavel",
        },
      ],
    },
    {
      name: "Bob",
      skills: ["JavaScript", "Tailwind", "Next.js"],
      links: [
        { label: "Portfolio", url: "https://bob.dev" },
        { label: "Twitter", url: "https://twitter.com" },
      ],
    },
  ];

  return (
    <div className="task">
      <h2>Props Practice: Developer Cards</h2>
      {devProfiles.map((dev, index) => (
        <ProfileCard
          key={index}
          name={dev.name}
          skills={dev.skills}
          links={dev.links}
        />
      ))}
    </div>
  );
}
