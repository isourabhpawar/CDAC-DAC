import logo from './logo.svg';
import './App.css';

import { Route, Routes } from 'react-router-dom';
import VehicleForm from './Components/VehicleForm';
import VehicleTable from "./Components/VehicleTable"
function App() {
  return (
    <div >
      <Routes>
        <Route path="/" element={<VehicleTable></VehicleTable>}></Route>
        <Route path="/edit/:vid" element={<VehicleForm></VehicleForm>}></Route>
        <Route path="/form" element={<VehicleForm></VehicleForm>}></Route>
      </Routes>




     
    </div>
  );
}

export default App;
