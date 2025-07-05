// components/Task14_Accordion.jsx
import { useEffect, useRef, useState } from "react";

const faqs = [
  {
    question: "What is React?",
    answer: "A JavaScript library for building UIs.",
  },
  { question: "What is JSX?", answer: "JSX stands for JavaScript XML." },
  {
    question: "What is a component?",
    answer: "Reusable UI building block in React.",
  },
];

export default function Task14_Accordion() {
  const [openIndex, setOpenIndex] = useState(null);
  const containerRef = useRef(null);

  useEffect(() => {
    function handleClickOutside(event) {
      if (
        containerRef.current &&
        !containerRef.current.contains(event.target)
      ) {
        setOpenIndex(null); // Close all
      }
    }

    document.addEventListener("mousedown", handleClickOutside);
    return () => document.removeEventListener("mousedown", handleClickOutside);
  }, []);

  return (
    <div className="task" ref={containerRef}>
      <h2>FAQ Accordion</h2>
      {faqs.map((faq, idx) => (
        <div key={idx}>
          <h4
            onClick={() => setOpenIndex(openIndex === idx ? null : idx)}
            style={{ cursor: "pointer", marginBottom: 0 }}
          >
            {faq.question}
          </h4>
          {openIndex === idx && <p>{faq.answer}</p>}
        </div>
      ))}
    </div>
  );
}
