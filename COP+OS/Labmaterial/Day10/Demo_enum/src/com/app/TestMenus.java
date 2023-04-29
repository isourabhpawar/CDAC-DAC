package com.app;

import java.util.Scanner;

public class TestMenus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----Menus-----");
		Menus[] menuList = Menus.values();
		// display menus from menuList

		for (Menus m : menuList) {
			System.out.println(m);
		}

		System.out.println("Enter Menu");

		Scanner sc = new Scanner(System.in);
		// how to read enum from console
		// accept in string and convert it into enum type
		Menus m = Menus.valueOf(sc.next().toLowerCase()); // "tea"

		System.out.println("You Have Selected:" + m);

		switch (m) {
		case tea:
			System.out.println("Cost=20");
			break;
		case coffee:
			System.out.println("Cost=40");
			break;
		}

	}

}
