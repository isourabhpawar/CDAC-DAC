package com.app.fruits;

import java.util.Scanner;

public class Testfruit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to fruit basket. Enter the size of fruit basket");
		Fruit[] basket=new Fruit[sc.nextInt()];
		int ch=0;
		int counter=0;
		
		
		do {
			System.out.println("Select the option\n1.Add mango\n2.Add apple\n3.Add orange\n4.Display all the fruit types"
					+ "\n5.Display name,color,weight,taste of all fresh fruits.\n6.Mark a fruit in a basket as stale"
					+ "\n7.Mark all sour fruits stale. \n8.Invoke fruit specific functionality"
					+ "\n0.To Exit");
			ch=sc.nextInt();
			
			switch(ch) {
				case 1:
					System.out.println("Enter the type, color of mango, weight");
					if(counter<basket.length) {
					basket[counter++]=new Mango(sc.next(),sc.next(),sc.nextDouble());
					System.out.println("Mango added to basket");
					}
					else {
						System.out.println("Basket Full!!");
					}
					
					break;
				case 2:
					System.out.println("Enter the type, color of mango, weight");
					if(counter<basket.length) {
					basket[counter++]=new Apple(sc.next(),sc.next(),sc.nextDouble());
					System.out.println("Mango added to basket");
					}
					else {
						System.out.println("Basket Full!!");
					}
					break;
				case 3:
					
					System.out.println("Enter the type, color of mango, weight");
					if(counter<basket.length) {
					basket[counter++]=new Orange(sc.next(),sc.next(),sc.nextDouble());
					System.out.println("Mango added to basket");
					}
					else {
						System.out.println("Basket Full!!");
					}
					break;
				case 4:
					
					System.out.println("List of all fruits types: ");
					
					for(Fruit f:basket) {
						if(f!=null) {System.out.println(f.getName());}
					}
					
					
					break;
				case 5:
					System.out.println("List of all fresh fruits: ");
					int i=1;
					for(Fruit f:basket) {
						if(f!=null==true && f.isFreshness())
						{
							System.out.println((i++)+"."+f+ "taste: "+f.taste());
						}
						
					}
					
					
					
					
					break;
					
					
				case 6:
					System.out.println("Enter the fruit number");
					int k=sc.nextInt();
					if(k<counter) {
					basket[k-1].setFreshness(false);
					System.out.println("Fruit number "+k+"set stale.");}
					else {
						System.out.println("No such fruit.");
					}
					break;
				
					
				case 7:
					
					
					for(Fruit f:basket) {
						if(f.taste()!="sweet")
						{
							f.setFreshness(false);;
						}
						
					}
					System.out.println("Marked all sour as stale");
					break;	
					
				case 8:
					System.out.println("Enter the fruit number");
					int l=sc.nextInt();
					Fruit f=basket[l-1];
					{
						if(f instanceof Mango && f!=null){
						
							System.out.println(((Mango)f).pulp());
						}
						else if(f instanceof Apple && f!=null){
							System.out.println(((Apple)f).jam());
							
						}
						else if(f instanceof Orange && f!=null){
							
							System.out.println(((Orange)f).juice());
						}
						
					}
					
					
					
					break;
						
			}
			
		}
		while(ch!=0);
		
		
		
		
		
			
	}

}
