import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Header from './components/Header';
import EmployeeTable from './components/EmployeeTable';
function App() {
  return (
    <div className="App">
      <Header></Header>
      <EmployeeTable></EmployeeTable>
    </div>
  );
}

export default App;
