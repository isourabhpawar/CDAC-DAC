package com.app;

import java.util.Scanner;

public class TestCarArray {

	public void startRace(Car c) {
		c.speed();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create collection of Cars

		// create array of Car type:
		Car[] shop = new Car[5];// null null null null null

		System.out.println("1:Add BMW  2:Add Ferrari  3:Display 4 :start");

		Scanner sc = new Scanner(System.in);

		int ch = 0;
		int index = 0;
		do {
			System.out.println("Enter Choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < shop.length) {
					System.out.println("Enter BMW Details:modelno Color AirBags");
					BMW b = new BMW(sc.nextInt(), sc.next(), sc.nextInt());
					shop[index] = b;
					index++;
				} else {
					System.out.println("Array Is Full");
				}
				break;

			case 2:
				if (index < shop.length) {
					System.out.println("Enter Ferrari Details:modelno Color NOS");
					shop[index] = new Ferrari(sc.nextInt(), sc.next(), sc.nextInt());
					index++;
				} else {
					System.out.println("Array Is Full");
				}
				break;
			case 3:
				for (Car c : shop) {
					if (c != null) {

						c.speed();
						System.out.println(c.getCarDetails());// Car class

						// child class specific behaviour
						// Instance of

						if (c instanceof Ferrari) {
							((Ferrari) c).startNOS();
						}
						if (c instanceof BMW) {
							// downcast Car to BMW

							((BMW) c).bmwFunction();
						}
					}
				}
				break;
			}
		} while (ch != 10);
	}

}
