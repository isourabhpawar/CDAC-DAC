package p1;

import java.util.Scanner;
//import ALL static members of the System class
import static java.lang.System.*;
import static java.lang.Math.sqrt;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(in);
		out.println("Enter complete name");
		out.println("Hello "+sc.nextLine());
		sc.close();
		System.out.println(sqrt(25));
		//how will you terminate JVM ?
		exit(0);
	}

}
