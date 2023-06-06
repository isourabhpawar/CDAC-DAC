class EmployeeService{
    constructor(){
        this.earr=[{empid:1,ename:"Kishori",sal:3456},
        {empid:2,ename:"Rajan",sal:5555},
        {empid:3,ename:"Revati",sal:44444}]
    }

    getEmployees(){
        return this.earr;
    }
    addEmp(emp){
        let pos=this.earr.findIndex(a=>a.empid===emp.empid);
        if(pos===-1){
           this.earr.push(emp);
        }
    }
}

export default new EmployeeService();