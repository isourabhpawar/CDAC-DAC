package com.taster;

import com.code.Product;

public class TestEqualityPrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product(101, "Pen", 40);// get stored on memory diif

	  Product p2=new Product(101, "Pen", 140);//diff memory loca

	 System.out.println("p1="+p1.hashCode()+"  p2="+p2.hashCode());

		if (p1 == p2)// hashcode is diff
		{
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		//p1=null;
	
	System.out.println(p2.getProdDetails());//YES
	//p1.getProdDetails();//nullpointer exception
		 
	    if(  p1.isSame(p2))
	    	System.out.println("Prds Are same");
	    else
	    	System.out.println("Not Same");
	
	
	
	
	
	
	
	
	
		
		
	}

}
