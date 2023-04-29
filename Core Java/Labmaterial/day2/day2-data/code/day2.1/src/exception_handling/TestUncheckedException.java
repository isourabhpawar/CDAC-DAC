package exception_handling;

import java.util.Scanner;

public class TestUncheckedException {
/*
 * Compiler forces handling of checked excs only!
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value");
		System.out.println("You entered "+sc.nextInt());
		sc.close();
		System.out.println("main over...");

	}

}
