package pkgTester;
import  pkgPayroll.Employee;
public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//access Employee class define inside package pkgPayroll
		//import pkgPayroll.Employee
		Employee emp;//emp is a reference variable:emp wil lhold ref from heap memory
		
		//allocate memory on heap to store values for Employee data members
		//empid name city salary
		
		emp=new Employee();//Employee class get loaded in method area....memory get allocated on heap
		
	//	System.out.println(emp);//F Q path of obj:pkgName.ClassName@id
		
		
		emp.display();
		//emp.acceptInfo(22, "Manoj", "Mumbai", 45000);//methods need to be called explicitly
		emp.display();
		
	String str=	emp.getEmployeeDetails();
	System.out.println(str);
	
	
	System.out.println(emp.getEmployeeDetails());
	
	
	Employee e=new  Employee();
	//e.age=56;//error:default not accessible outside package
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
