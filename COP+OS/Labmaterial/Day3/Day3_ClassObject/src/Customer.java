
public class Customer {

	//private:inside class only
	
	private int custid;
	private String name,city,email;
	//assign customer details
	public void acceptDetails(int id,String nm,String ct,String em)
	{
		 custid=id;
		name=nm;
		city=ct;
		email=em;		
		
	}
	
	//
	public void display()
	{
		System.out.println("---_Customer Info--------");
		System.out.println("CustId="+custid);
		System.out.println("Name="+name);
		System.out.println("City="+city);
		System.out.println("email="+email);
	}
	
	//write a funtion for editing/updating email
	//setters are used to assign values to indivisual data members
	//syntax:  public  void setXXX(Datatype args)
	public void setEmail(String newEmail)
	{
		email=newEmail;
	}
	
	//getters are used to get/read/return individual data members
	
	public  String getEmail()
	{
		return email;
	}
	
	
	//setter for City
	public void setCity(String newCity)
	{
		city=newCity;
	}
	//getter for city
	public String getCity()
	{
		return city;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
