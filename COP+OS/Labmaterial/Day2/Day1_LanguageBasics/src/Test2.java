import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		// read numbers from users

		// in c:scanf()
		// in cpp: cin>>

		// in java
		// use Scanner Class ;import java.util

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1");
		int no1;
		no1 = sc.nextInt();
		System.out.println("Enter No2");
		int no2;
		no2 = sc.nextInt();
		int c = no1 + no2;
		System.out.println("add=" + c);

		// System.out.println(no1);

		// if
		if (no1 > no2)
			System.out.println("no1>no2");// condition is true

		System.out.println("------------");
		//
		if (no1 > no2)
			System.out.println("no1>no2");// condition is true
		else
			System.out.println("no1<no2");

		//

		if (no1 > no2)
			System.out.println("no1>no2");// condition is true
		else if (no1 < no2)
			System.out.println("no1<no2");
		else
			System.out.println("no1==no2");

	}

}
