import java.util.Scanner;

public class TestMenuDriven {

	public static void main(String[] args) {

		// menu driven

		System.out.println("1 : NoteBooks   50Rs   2: Pen  20Rs   3:ColourBox  40Rs   4:Total Bill 5 :Exit ");
		Scanner sc = new Scanner(System.in);
		double amount = 0;
		int qty;int choice;
		do {
		System.out.println("Enter Choice");
		choice = sc.nextInt();
		switch (choice) {
		case 1:// notebook
			System.out.println("Enter Qty for notebook:");
			qty = sc.nextInt();// accept qty from user
			amount += qty * 50;
             System.out.println("Total amount="+amount);
			break;
		case 2:
			System.out.println("Enter Qty for pen:");
			qty = sc.nextInt();// accept qty from user
			amount += qty * 20;
			  System.out.println("Total amount="+amount);
			break;
		case 3:
			System.out.println("Enter Qty for ColorBox:");
			qty = sc.nextInt();// accept qty from user
			amount += qty * 40;
			  System.out.println("Total amount="+amount);
			break;
		case 4:
			System.out.println("Total Amount:" + amount);
			break;
		case 5:System.out.println("------Thank You------");
			break;
		default:System.out.println("Invalid Choice");
			break;

		}// switch
		}while(choice!=5);
System.out.println("---------------end of main---------");
	}

}
