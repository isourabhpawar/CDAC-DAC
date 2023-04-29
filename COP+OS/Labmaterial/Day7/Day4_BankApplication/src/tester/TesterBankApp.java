package tester;

import java.util.Scanner;

import bank.Account;

public class TesterBankApp {

	public static void main(String[] args) {

// Account act1;
// act1=new Account(102, "Ramesh", "Mumbai", "Ramesh@gmail.com", 50000);
// act1.displayAccount();

		System.out.println("1:Create New Account");
		System.out.println("2:Show Account");
		System.out.println("3:Deposite");
		System.out.println("4:Withdraw");
		System.out.println("5:Chk Balance");
		System.out.println("6:Update Email");
		System.out.println("7:Update City");
		System.out.println("8:Exit");

		Scanner sc = new Scanner(System.in);// para contr
		int choice;

		Account act = null;

		do {
			System.out.println("enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("ActId Name City Email balance");
				act = new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
				System.out.println("account Created ");
				break;
			case 2:
				if (act != null)
					act.displayAccount();
				else
					System.out.println("Create account First");
				break;
			case 3:
				System.out.println("Enter Amount To Deposite");
				double curBal = act.deposite(sc.nextDouble());
				System.out.println("Current Balance=" + curBal);
				break;
			case 4:
				System.out.println("Enter Amount To Withdraw");
				 act.withdraw(sc.nextDouble());
				System.out.println("Current Balance=" + act.getBalance());
				break;
			case 5:System.out.println("Welcome :"+act.getName() +"  Account Balance="+act.getBalance());
			default:
				System.out.println("Invalid");
				break;
			}// switch
		} while (choice < 8);
		System.out.println("----------------end of main---------");

	}

}
