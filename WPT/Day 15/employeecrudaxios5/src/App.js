import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
//import Header from './components/Header';
import EmployeeTable from './components/EmployeeTable';
import EmployeeForm from './components/EmployeeForm';
import MainHeaderNavBar from './components/MainHeaderNavBar';
import HomeComponent from './components/HomeComponent';
import EmployeeEdit from './components/EmployeeEdit';
import {Routes,Route,Navigate} from 'react-router-dom' 
function App() {
  return (
    <div className="App">
      <MainHeaderNavBar/>
      <Routes>
        <Route path="/" element={<Navigate replace to="/home"></Navigate>}></Route>
         <Route path="/home" element={<HomeComponent/>}></Route>
         <Route path="/table" element={<EmployeeTable/>}></Route>
         <Route path="/form" element={<EmployeeForm/>}></Route>
         <Route path="/edit/:eid" element={<EmployeeEdit/>}></Route>
      </Routes>
    </div>
  );
}

export default App;
