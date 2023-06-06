import React,{Component, Fragment} from 'react';
import EmployeeService from '../service/EmployeeService';
import {Link} from 'react-router-dom'
class EmployeeTable extends React.Component{
    constructor(props){
        super(props);
        this.state={
             earr:[],
             searcharr:[],
             searchtext:""
        }
    }
    componentDidMount(){
        console.log("in componentdidmount")
        EmployeeService.getEmployees()
        .then((result)=>{
          console.log(result.data);
          this.setState({...this.state,earr:result.data,searcharr:result.data})
        })
        .catch(()=>{})
    }
    componentDidUpdate(prevProps,prevState){
      if(prevState.searchtext!==this.state.searchtext){
        console.log("en searchtextstate change "+prevState.searchtext+"-----"+this.state.searchtext)
        if(this.state.searchtext!==""){
          let newarr=this.state.earr.filter(emp=>emp.ename.includes(this.state.searchtext))
           this.setState({...this.state,searcharr:[...newarr]})
        }else{
            this.setState({...this.state,searcharr:this.state.earr})  
        }
      }

    }
    /*getData=()=>{
      this.setState({...this.state,earr:EmployeeService.getEmployees(),searcharr:EmployeeService.getEmployees()})
      EmployeeService.getEmployees();
    }*/
    render(){
  return (
  <div className="container">
      <div className="row">
         <div className="col-sm-12 col-md-6">
         <Link to='/form'>
            <button type="button" name="btn" id="btn" className="btn btn-success">Add new Employee</button>
         </Link>
         <br/><br/>
         <input type="text" name="nm" id="nm" 
         value={this.state.searchtext}
         onChange={(event)=>{this.setState({...this.state,searchtext:event.target.value})}}
         />
         <br/><br/>
  <table className="table table-striped">
    <thead>
      <tr>
        <th scope="col">Employee id</th>
        <th scope="col">Employee name</th>
        <th scope="col">Employee Sal</th>
        <th scope="col">Actions</th>
      </tr>
    </thead>
    <tbody>
      {this.state.searcharr.map((emp)=><tr key={emp.empid}>
        <td>{emp.empid}</td>
        <td>{emp.ename}</td>
        <td>{emp.sal}</td>
        <td>
           <button type="button" id="btn" name="btn" className="btn btn-danger">
                   <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" className="bi bi-trash3" viewBox="0 0 16 16">
                <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
                </svg> </button>
                        &nbsp;&nbsp;&nbsp;
                        <Link to={`/edit/${emp.empid}`} state={{emp:emp}}>
                        <button type="button" id="btn" name="btn" className="btn btn-primary">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" className="bi bi-pen-fill" viewBox="0 0 16 16">
                <path d="m13.498.795.149-.149a1.207 1.207 0 1 1 1.707 1.708l-.149.148a1.5 1.5 0 0 1-.059 2.059L4.854 14.854a.5.5 0 0 1-.233.131l-4 1a.5.5 0 0 1-.606-.606l1-4a.5.5 0 0 1 .131-.232l9.642-9.642a.5.5 0 0 0-.642.056L6.854 4.854a.5.5 0 1 1-.708-.708L9.44.854A1.5 1.5 0 0 1 11.5.796a1.5 1.5 0 0 1 1.998-.001z"/>
                
                </svg></button>
                </Link>
                </td>
      </tr>)}
    </tbody>
  </table>
         </div>
         
       </div>
  </div>
  
  )


    }
}
export default EmployeeTable;