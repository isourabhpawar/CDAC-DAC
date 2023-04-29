package com.taster;

import java.util.Scanner;

import com.code.Account;

public class TesterAccount {

	static
	{
		System.out.println("-----b4 main method----------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------main--------------");
		Scanner sc=new Scanner(System.in);

		Account act1 = new Account("Meenal", 45000);//

		act1.display();

		Account act2 = new Account("Sonal", 53000);//

		act2.display();

		Account act3 = new Account("Monal", 13000);//
		act3.display();

	}

}
