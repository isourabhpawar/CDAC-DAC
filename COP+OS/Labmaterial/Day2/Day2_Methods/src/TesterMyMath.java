import java.util.Scanner;

public class TesterMyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// client

		// to use methods given by class
		// create an object of the class

		MyMath obj = new MyMath();

		obj.sayHello();// not accepting and not return

		int score = obj.getScore();
		System.out.println("Score=" + score);

		obj.display("IACSD");// name=IACSD

		String name = "Mitesh Joshi";
		obj.display(name);// name=Mitesh Joshi

		obj.display("This is COP");// name=
		obj.display("Thsi is Method Introductsion");

		String str = obj.getCapital("Maharashtra");
		System.out.println("Capital Is:" + str);

		obj.add();

		// numbers will be given by client/user

		Scanner sc = new Scanner(System.in);
		System.out.println("---no1 no2---");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();

		obj.sum(no1, no2);
		int m=obj.max(no1, no2);
		System.out.println("Max="+m);
		
		System.out.println("---no1 no2---");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		obj.sum(no1, no2);
		m=obj.max(no1, no2 );
		System.out.println("Max="+m);
		
		
		
		
		
		
		//obj.sum(12);//compile error
		
		//obj.sum(12, 3,4,56,7);//error
		
		//obj.sum("abc", "Abc");//error
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
