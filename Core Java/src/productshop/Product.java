package productshop;

public class Product {
	private int pid;
	private String pname;
	private double pprice;
	private Category category;
	
	
	public Product(int pid,String pname,double pprice,Category category) {
		this.pid=pid;
		this.category=category;
		this.pprice=pprice;
		this.pname=pname;
	}
	
	
	public int getPid() {
		return pid;
	}


	public double getPprice() {
		return pprice;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public void setPprice(double pprice) {
		this.pprice = pprice;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String toString() {
		return "prodid: "+pid+" product name: "+pname+" product category: "+category+" price: "
				+pprice;
	}
	

}
