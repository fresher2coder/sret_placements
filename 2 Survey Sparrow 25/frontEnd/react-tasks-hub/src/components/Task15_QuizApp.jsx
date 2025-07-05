// components/Task15_QuizApp.jsx
import { useState } from "react";

const questions = [
  {
    q: "What does HTML stand for?",
    options: [
      "Hyper Text Markup Language",
      "High Tech Modern Language",
      "Home Tool Markup Language",
    ],
    answer: "Hyper Text Markup Language",
  },
  {
    q: "Which hook is used for state?",
    options: ["useState", "useEffect", "useContext"],
    answer: "useState",
  },
];

export default function Task15_QuizApp() {
  const [step, setStep] = useState(0);
  const [score, setScore] = useState(0);
  const [finished, setFinished] = useState(false);

  const handleAnswer = (option) => {
    if (option === questions[step].answer) setScore(score + 1);
    if (step + 1 === questions.length) setFinished(true);
    else setStep(step + 1);
  };

  return (
    <div className="task">
      <h2>Simple Quiz</h2>
      {finished ? (
        <h3>
          You scored {score} out of {questions.length}
        </h3>
      ) : (
        <>
          <h4>{questions[step].q}</h4>
          {questions[step].options.map((opt, idx) => (
            <button
              key={idx}
              onClick={() => handleAnswer(opt)}
              style={{ display: "block", margin: "10px auto" }}
            >
              {opt}
            </button>
          ))}
        </>
      )}
    </div>
  );
}
