
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m=new Manager();
		m.payTax();
		m.print();
		m.linkDetails();//default method
		
		BuissnessMan b=new BuissnessMan();
		b.payTax();
		b.linkDetails();//default method
		
		Shopkeeper s=new Shopkeeper();
		s.payTax();
		s.print();
		s.linkDetails();//default
		
		Taxable t=new Shopkeeper();//i/f can hold ref of class which implements i/f
		
		//Lab Task:
		//Create array to store all taxable persons
		//add in array and invoke methods
		
		
		
		
		
		
		
		
		
		
		
	}

}
