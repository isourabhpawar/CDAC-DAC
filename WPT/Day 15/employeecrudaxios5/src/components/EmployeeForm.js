import { Fragment,useState } from "react"
import {useNavigate} from 'react-router-dom'
import EmployeeService from "../service/EmployeeService";
const EmployeeForm=(props)=>{
    //its a hook which gives access to navigate object used for changing the url
let navigate=useNavigate()
let [formdetails,setformdetails]=useState({empid:"",ename:"",sal:""});
let addemp=()=>{

    if(formdetails.empid==="" || formdetails.ename==="" || formdetails.sal===""){
        alert("fields cannnot be blank");
        return;
    }
    EmployeeService.addEmp(formdetails)
    .then((result)=>{
        //it will change the url to /table
        console.log(result);
        setformdetails({empid:"",ename:"",sal:""});
        navigate("/table")
    })
    .catch();
   
    
    
}
return(
  <div>
      <form>
              <div className="form-group">
                  <label htmlFor="empid">Employee id</label>
                  <input type="text" className="form-control" id="empid" name="empid" 
                   value={formdetails.empid}
                   onChange={(event)=>{setformdetails({...formdetails,empid:event.target.value})}}   
                  />
                  
              </div>
              <div className="form-group">
                  <label htmlFor="ename">Employee Name</label>
                  <input type="text" className="form-control" id="ename" name="ename"
                  value={formdetails.ename}
                   onChange={(event)=>{setformdetails({...formdetails,ename:event.target.value})}}
                  />
              </div>
              <div className="form-group">
                  <label htmlFor="sal">Employee Sal</label>
                  <input type="text" className="form-control" id="sal" name="sal"
                  value={formdetails.sal}
                   onChange={(event)=>{setformdetails({...formdetails,sal:event.target.value})}}
                  />
              </div>
              <button type="button" className="btn btn-primary" onClick={addemp}>Add Employee</button>
     </form>
  </div>
)
}

export default EmployeeForm;