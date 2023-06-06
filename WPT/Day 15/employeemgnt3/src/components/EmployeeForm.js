import { Fragment,useState } from "react"
import EmployeeService from "../service/EmployeeService";
const EmployeeForm=(props)=>{
let [formdetails,setformdetails]=useState({empid:"",ename:"",sal:""});
let addemp=()=>{
    if(formdetails.empid==="" || formdetails.ename==="" || formdetails.sal===""){
        alert("fields cannnot be blank");
        return;
    }
    EmployeeService.addEmp(formdetails);
    setformdetails({empid:"",ename:"",sal:""});
    props.addData();
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