package com.taster;

import com.code.Product;

public class TestRefType {

	// inside tester class method to change prd price
	public static void changePrdPrice(double prdPrice, double priceToChange) {
		prdPrice = priceToChange + prdPrice;
		System.out.println("Prdouct Changed price=" + prdPrice);

	}

	public static void incrementPrdPrice(Product p, double priceToChange) {
		p.setPrice(priceToChange + p.getPrice());
		System.out.println("Prdouct Changed price=" + p.getPrice());

	}

	public static void main(String[] args) {

		Product p = new Product(12, "Xyz", 90);

		changePrdPrice(p.getPrice(), 100);
		System.out.println("----after update ----" + p.getPrice());
		System.out.println(p.getProdDetails());

	System.out.println("-----------------------------");
	
	incrementPrdPrice(p, 100);
	System.out.println("----after update ----" + p.getPrice());
	System.out.println(p.getProdDetails());

	
	
	
	
	
	
	
	
	
	}

}
