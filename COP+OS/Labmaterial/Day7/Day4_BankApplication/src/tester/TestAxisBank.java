package tester;

import java.util.Scanner;

import bank.Account;

public class TestAxisBank {

	public static void main(String[] args) {

//Array Of Account
		Account[] axisBank = new Account[10];
		System.out.println("------");
//		for(int i=0;i<axisBank.length;i++)
//		{
//			System.out.println(axisBank[i]);
//		}

		System.out.println("1:Create New Account");
		System.out.println("2:Show All  Accounts");
		System.out.println("3:Deposite");
		System.out.println("4:Withdraw");
		System.out.println("5:Chk Balance");
		System.out.println("6:Update Email");
		System.out.println("7:Update City");
		System.out.println("8:Show All Customers Name");
		System.out.println("9:Show All Customers emails");

		Scanner sc = new Scanner(System.in);// para contr
		int choice;
		int index = 0;
		boolean flag = false;
		Account act = null;

		do {
			System.out.println("enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (index < axisBank.length) {
					System.out.println("ActId Name City Email balance");
					act = new Account(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble());
					axisBank[index] = act;
					index++;
				} else {
					System.out.println("Array Is Full");
				}

				break;
			case 2:
				for (int i = 0; i < index; i++) {
					axisBank[i].displayAccount();
				}

				break;
			case 3:
				System.out.println("Enter ActId ");
				int id = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (axisBank[i].getActid() == id) {
						System.out.println("Enter amount To Deposite");
						double amt = sc.nextDouble();
						axisBank[i].deposite(amt);
						flag = true;
						break;
					} else {
						flag = false;

					}
				}
				if (flag == false) {
					System.out.println("Act does Not exist");
				}

				break;
			case 4: //sender
				//reciver
				//amount
				System.out.println("Enter Sender ActId ");
				int senderid = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (axisBank[i].getActid() == senderid) {
						System.out.println("Reciver Id:");
						int reciverId=sc.nextInt();
						for (int j = 0; j < index; j++)
						{
							if (axisBank[j].getActid() == reciverId)
							{
								System.out.println("Amount");
								axisBank[i].moneyTransfer(axisBank[j], sc.nextDouble());
							}
						}
						
						
					}
						System.out.println("Enter amount To Deposite");
						double amt = sc.nextDouble();
						axisBank[i].deposite(amt);
						flag = true;
						break;
					} 

				break;
				//complete all other case in lab
			case 8:
				for(Account acts:axisBank)
				{
					if(acts!=null)
					{
						System.out.println(acts.getName());
					 }
					
				}
				
				
				
				
				
				
			default:
				System.out.println("Invalid");
				break;
			}// switch
		} while (choice < 8);
		System.out.println("----------------end of main---------");

	}

}
