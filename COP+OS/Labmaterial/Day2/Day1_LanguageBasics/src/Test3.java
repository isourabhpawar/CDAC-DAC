import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter No");
		Scanner sc = new Scanner(System.in);

		int no1 = sc.nextInt();

		switch (no1) {
		case 1:// if(no1==1)
			System.out.println("Jan");
			break;
		case 2:// if(no1==1)
			System.out.println("Feb");
			break;
		case 3:// if(no1==1)
			System.out.println("March");
			break;
		default:
			System.out.println("invalid month ");
			break;

		}// switch

	}

}
