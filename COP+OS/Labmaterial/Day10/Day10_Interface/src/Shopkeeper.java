
public class Shopkeeper  implements Taxable,Printable{

	@Override
	public void payTax() {
	System.out.println("---Shopkeeper paying Tax----");
		
	}

	@Override
	public void print() {
		System.out.println("Shopkeeper Print details");
		
	}
	

}
