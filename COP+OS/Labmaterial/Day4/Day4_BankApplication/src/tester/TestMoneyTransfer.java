package tester;

import bank.Account;

public class TestMoneyTransfer {

	public static void main(String[] args) {


		
		Account act1=new Account(101, "Ram", "Pune", "aaa", 50000);
		
		Account act2=new Account(102, "Sham", "Pune", "aferta", 10000);
		
		//Ram wants send money to sham i.e act1 transferMoney to act2
		act1.displayAccount();
		act2.displayAccount();
		
		double amount=10000;
		act1.moneyTransfer(  act2,amount);
		
		act1.displayAccount();
		act2.displayAccount();
		
		
		
		
		
		
		
		

	}

}
