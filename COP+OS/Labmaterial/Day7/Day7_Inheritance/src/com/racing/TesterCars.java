package com.racing;

public class TesterCars {
int id;
	public static void main(String[] args) {
		
		int id=10;
//		Nano n=new Nano();//child class  parent constr--->child constr
//		n.speed();
//		n.carDetails();
//		
//		System.out.println("\n\n\n\n");
//		
//		
//		BMW bmw=new BMW();//carclass contr----->BMW constr
//		bmw.speed();
//		bmw.carDetails();
//		
//		System.out.println("\n\n\n\n");
//		
//		Ferrari fr=new Ferrari();//car--->ferrari
//		fr.speed();
//		fr.carDetails();
		
		//create child class with data members :parameter constr
		System.out.println("-----------using parameter constr-------------");
		Nano n1=new  Nano(909, "Yellow", "Petrol");
		n1.carDetails();
		n1.speed();
		System.out.println(n1);//
		
		System.out.println("\n\n");
		BMW bmw1=new BMW(808, "Black", "Disel", 4);//
		bmw1.carDetails();
		bmw1.speed();
		System.out.println(bmw1);//bmw---toString()-->car toString
		
		System.out.println("\n\n");
		
		Ferrari fr1=new Ferrari(707, "Red", "Petrol", 5);
		fr1.carDetails();
		fr1.speed();
		System.out.println(fr1);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
