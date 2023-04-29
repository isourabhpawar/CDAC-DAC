package app.payroll;

public class TestPayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.calSalary();// emp class method
		emp.calIncomeTax();
		
		Manager mgr = new Manager();
		mgr.calSalary();// parent class employee class method
		mgr.calIncentives();// manager class method
		mgr.calIncomeTax();

		SalesPerson sp = new SalesPerson();
		sp.calSalary();// employee class
		sp.calAllounces();// salesperson method
		sp.calIncomeTax();
		
		Devloper dev=new Devloper();
		dev.calIncomeTax();
		dev.calSalary();
		
		
		
	}

}
