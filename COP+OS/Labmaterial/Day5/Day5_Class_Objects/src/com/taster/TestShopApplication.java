package com.taster;

import java.util.Scanner;

import com.code.Product;

public class TestShopApplication {

	public static void main(String[] args) {

		System.out.println("1:Add Prod  2:all Prds 3: Search Prd 4: update Price 5: get prd > price  6:exit");

		Scanner sc = new Scanner(System.in);

		// create an array of ref type
		Product[] shop = new Product[10];
		for (int i = 0; i < shop.length; i++) {
			System.out.println(shop[i]);
		}
		int[] arr=new int [4];
     
		  int a=19;
		  arr[0]=a;
		
		   arr[1]=sc.nextInt();
		
		int ch = 0, index = 0;
		do {
			System.out.println("Enter choice=");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < shop.length) {
					System.out.println("PrdId Name Price");
//			Product prd=new Product(sc.nextInt(), sc.next(), sc.nextDouble());//contr invoked ...ref to memory stored in ref var prd
//			shop[index]=prd;

	shop[index] = new Product(sc.nextInt(), sc.next(), sc.nextDouble());
					index++;
				} else {
					System.out.println("Array is Full");
				}
				break;
			case 2:
				for (int i = 0; i < index; i++) {
					System.out.println(shop[i].hashCode());
					System.out.println(shop[i].getProdDetails());
				}
				break;
			case 3:
				System.out.println("Enter PrdId:");
				int prdid = sc.nextInt();
				for (int i = 0; i < index; i++) {
					int p1 = 24;
					if (shop[i].getPrdid() == prdid) {
						System.out.println(shop[i].getProdDetails());
					}
				}

				break;
			case 4:
				System.out.println("Enter PrdId:");
				prdid = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (shop[i].getPrdid() == prdid) {
						System.out.println("Enter Price To Update");

						shop[i].setPrice(sc.nextDouble());
						System.out.println("Update Price:" + shop[i].getPrice());
					}
				}
				break;

			case 5:
				System.out.println("Enter Price:");
				double p = sc.nextDouble();
				for (int i = 0; i < index; i++) {
					if (shop[i].getPrice() > p) {
						System.out.println(shop[i].getProdDetails());
					}

				}

				break;

			}// switch

		} while (ch != 6);

		System.out.println("--------main ends-----------");

	}

}
