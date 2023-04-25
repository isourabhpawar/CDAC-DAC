package enums;

import java.util.*;
public class testcoffee {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose the coffee from options");
		coffee[] c=coffee.values();
		int j=1;
		for(coffee i:c) {
			System.out.println(j+"."+i);j++;
		}
		System.out.println();

		System.out.println("Enter your choice: ");
		
		coffee s=coffee.valueOf(sc.next().toLowerCase());
		System.out.println("You have the coffee type: "+s);
		
		switch(s) {
		case hot:System.out.println("Price is Rs.20");break;
		case vanilla:System.out.println("Price is Rs.30");break;
		case chocolate:System.out.println("Price is Rs.40");break;
		case black:System.out.println("Price is Rs.15");break;
		}
	}

}
