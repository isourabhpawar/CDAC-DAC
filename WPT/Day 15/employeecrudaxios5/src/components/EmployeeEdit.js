import { useLocation, useParams ,useNavigate} from "react-router-dom";
import {useState,useEffect} from 'react';
import EmployeeService from '../service/EmployeeService'

const EmployeeEdit=(props)=>{
    // this helps to retrieve parameters
    const params=useParams();
    let navigate=useNavigate();
    //it helps to retrieve state object coming via Link
    const location=useLocation()
    let [formdetails,setformdetails]=useState({empid:"",ename:"",sal:""});
    //initialize the data in form component
    useEffect(()=>{
        EmployeeService.getById(params.eid)
        .then((result)=>{
            setformdetails({...result.data})
        })
        .catch(()=>{})
    },[])
    let upadateEmp=()=>{
        console.log("in update emp")
        EmployeeService.updateemp(formdetails)
        .then(()=>{
            navigate("/table")
        })
        .catch((err)=>{
        console.log("error occured",err);
        })
    }
    console.log("in employee edit");
    console.log(location.state.emp)
    return(
        <div>
            <form>
                    <div className="form-group">
                        <label htmlFor="empid">Employee id</label>
                        <input type="text" className="form-control" id="empid" name="empid" 
                         value={formdetails.empid}
                         onChange={(event)=>{setformdetails({...formdetails,empid:event.target.value})}}   
                         readOnly
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
                    <button type="button" className="btn btn-primary" onClick={upadateEmp}>Update Employee</button>
           </form>
        </div>
      )
}

export default EmployeeEdit;