import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Task1_Counter from "./components/Task1_Counter";
import Task2_ShowHide from "./components/Task2_ShowHide";
import Task3_ColorChanger from "./components/Task3_ColorChanger";
import Task4_TodoList from "./components/Task4_TodoList";
import Task5_FormTracker from "./components/Task5_FormTracker";
import Task6_DigitalClock from "./components/Task6_DigitalClock";
import Task7_FetchUsers from "./components/Task7_FetchUsers";
import Task8_ConditionalMessage from "./components/Task8_ConditionalMessage";
import Task9_UserSearch from "./components/Task9_UserSearch";
import Task10_Portfolio from "./components/Task10_Portfolio";
import PortfolioHome from "./components/portfolio/PortfolioHome";
import PortfolioAbout from "./components/portfolio/PortfolioAbout";
import PortfolioProjects from "./components/portfolio/PortfolioProjects";
import Task11_TemperatureConverter from "./components/Task11_TemperatureConverter";
import Task12_TabSwitcher from "./components/Task12_TabSwitcher";
import Task13_LikeButton from "./components/Task13_LikeButton";
import Task14_Accordion from "./components/Task14_Accordion";
import Task15_QuizApp from "./components/Task15_QuizApp";
import Task16_ThemeSwitcher from "./components/Task16_ThemeSwitcher";
import Task17_Stopwatch from "./components/Task17_Stopwatch";
import Task18_BlogFeed from "./components/Task18_BlogFeed";
import Task19_WeatherSearch from "./components/Task19_WeatherSearch";
import Task20_PropsPortfolio from "./components/Task20_PropsPortfolio";
import "./App.css";

function App() {
  return (
    <Router>
      <nav className="navbar">
        <h1>React Task Hub</h1>
        <select onChange={(e) => (window.location.href = e.target.value)}>
          <option value="">-- Select Task --</option>
          <option value="/task/1">Task 1: Counter</option>
          <option value="/task/2">Task 2: Show/Hide</option>
          <option value="/task/3">Task 3: Color Changer</option>
          <option value="/task/4">Task 4: To-Do List</option>
          <option value="/task/5">Task 5: Form Tracker</option>
          <option value="/task/6">Task 6: Digital Clock</option>
          <option value="/task/7">Task 7: Fetch Users</option>
          <option value="/task/8">Task 8: Conditional Message</option>
          <option value="/task/9">Task 9: User Search</option>
          <option value="/task/10">Task 10: Portfolio</option>
          <option value="/task/11">Task 11: Temperature Converter</option>
          <option value="/task/12">Task 12: Tab Switcher</option>
          <option value="/task/13">Task 13: Like Button</option>
          <option value="/task/14">Task 14: Accordion</option>
          <option value="/task/15">Task 15: Quiz App</option>
          <option value="/task/16">Task 16: Theme Switcher</option>
          <option value="/task/17">Task 17: Stopwatch</option>
          <option value="/task/18">Task 18: Blog Feed</option>
          <option value="/task/19">Task 19: Weather Search</option>
          <option value="/task/20">Task 20: Props Portfolio</option>
        </select>
      </nav>

      <Routes>
        <Route path="/task/1" element={<Task1_Counter />} />
        <Route path="/task/2" element={<Task2_ShowHide />} />
        <Route path="/task/3" element={<Task3_ColorChanger />} />
        <Route path="/task/4" element={<Task4_TodoList />} />
        <Route path="/task/5" element={<Task5_FormTracker />} />
        <Route path="/task/6" element={<Task6_DigitalClock />} />
        <Route path="/task/7" element={<Task7_FetchUsers />} />
        <Route path="/task/8" element={<Task8_ConditionalMessage />} />
        <Route path="/task/9" element={<Task9_UserSearch />} />
        <Route path="/task/10" element={<Task10_Portfolio />}>
          <Route path="home" element={<PortfolioHome />} />
          <Route path="about" element={<PortfolioAbout />} />
          <Route path="projects" element={<PortfolioProjects />} />
        </Route>
        <Route path="/task/11" element={<Task11_TemperatureConverter />} />
        <Route path="/task/12" element={<Task12_TabSwitcher />} />
        <Route path="/task/13" element={<Task13_LikeButton />} />
        <Route path="/task/14" element={<Task14_Accordion />} />
        <Route path="/task/15" element={<Task15_QuizApp />} />
        <Route path="/task/16" element={<Task16_ThemeSwitcher />} />
        <Route path="/task/17" element={<Task17_Stopwatch />} />
        <Route path="/task/18" element={<Task18_BlogFeed />} />
        <Route path="/task/19" element={<Task19_WeatherSearch />} />
        <Route path="/task/20" element={<Task20_PropsPortfolio />} />
      </Routes>
    </Router>
  );
}

export default App;
