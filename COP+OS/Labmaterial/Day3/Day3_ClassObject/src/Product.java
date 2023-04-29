
public class Product {

	
	//private:inside class
	private int prdid;
	private String name;
	private double price;
	//accept all details
	public void accpetDetails(int id,String nm,double pr)
	{
		prdid=id;
		name=nm;
		price=pr;
		
	}
	public void display()
	{
		System.out.println("----details-------");
		System.out.println("PrdId="+prdid);
		System.out.println("Name="+name);
		System.out.println("Price="+price);
		}
	
	//setters
	public void setPrice(double p)
	{
		price=p;
	}
	//getters
	
	public double getPrice()
	{
		return price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
