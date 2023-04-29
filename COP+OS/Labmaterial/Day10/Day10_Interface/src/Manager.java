
public class Manager extends Employee implements Taxable ,Printable{

	//manager implements contract 
	@Override
	public void payTax() {
	System.out.println("Manager Income Tax ");
		
	}
	
	
	public void getDetails()
	{
		System.out.println("Manager Details");
	}


	@Override
	public void print() {
		System.out.println("Print Manager details");
		
	}

	
}
