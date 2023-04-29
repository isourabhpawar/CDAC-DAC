package com.fruitbaskate;

public class TestFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit f = new Fruit(340, "Red");
		System.out.println(f);

		Fruit fObj = f.fruitDetails();
		System.out.println(fObj);

		System.out.println("\n");

		Mango m = new Mango(500, "Yellow", "Hapus");
		System.out.println(m);

		System.out.println("\n");

		Mango fObj1 = m.fruitDetails();// upCasting
		System.out.println(fObj1);
		fObj1.pulp();

		Orange o = new Orange(345, "Orange");
		o.juice();

		Orange f1 = o.fruitDetails();
		f1.juice();
		
		
		
		

	}

}
