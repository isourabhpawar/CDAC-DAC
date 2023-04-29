package pkgPayroll;


public class Employee {
	//data members:describe employee
	
	private int empid;
	private String name;
	private String city;
	private double salary;
	int age;//default
	//assign data members using method
	public  void acceptInfo(int id,String nm,String ct,double sal)
	{
		
		empid=id;
		name=nm;
		city=ct;
		salary=sal;
	}
	public void display()
	{
		System.out.println("-----Employee Info------");
		System.out.println("EmpId="+empid+" Name="+name+" City="+city+" Salary="+salary);
	}
	
	
	public void setName(String nm)
	{
		name=nm;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCity(String ct)
	{
		city=ct;
	}
	public String getCity()
	{
		return city;
	}
	
	 
	public double getSalary()
	{
		return salary;
	}
	
	 
	
	public String getEmployeeDetails()
	{   
		return  "EmpId="+empid+" Name="+name+" City="+city+" Salary="+salary;

		
	}
	
	
	
	
	

}
