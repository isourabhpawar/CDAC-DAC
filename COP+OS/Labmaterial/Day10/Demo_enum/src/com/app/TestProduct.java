package com.app;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Category[] cate=Category.values();
		for(Category c:cate )
		{
			System.out.println(c);
		}
		
		System.out.println("Enter PrdId Name Price Cate");
		Scanner sc=new Scanner(System.in);
		 Product p=new Product(sc.nextInt(), sc.next(), sc.nextDouble(), Category.valueOf(sc.next().toUpperCase()));
		
	//	Product p=new Product(0, null, 0,Category.valueOf(sc.next().toUpperCase()))
		
		System.out.println(p);
		
		//lab:create array to store 10 prds and display  specific category prd
		
	}

}
