//interface wil provide contract(rules) that must be implemented
//in class which implements interface
public interface Taxable {
	//by default fields are public static final
	int iRate=10;
	
	//till java 8 contains all abstract methos
	//abst methods are methods with no implementation
	//by default methods are public abstract
	//contract
	void payTax();//public abstract void payTax();
	
	
	//java 8 added new features
	//1:inteface can have implemented method must be default

	default void linkDetails() {
		
		System.out.println("---link details-----");
		
	}
	
	
	
	
	
	
}
