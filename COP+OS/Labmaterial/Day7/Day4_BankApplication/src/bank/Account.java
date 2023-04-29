package bank;

public class Account {

	private int actid;
	private String name, email, city;
	private double balance;

	public Account(int actid, String name, String email, String city, double balance) {
		System.out.println("---Account Para Constr----");
		this.actid = actid;
		this.name = name;
		this.email = email;
		this.city = city;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getActid() {
		return actid;
	}

	public double getBalance() {
		return balance;
	}

	// behaviour method BL

	public void withdraw(double amount) {
		if (balance > amount) {
			System.out.println("---inside withdraw----");
			this.balance = this.balance - amount;
			System.out.println("Balance Aftre Withdraw=" + this.balance);

		} else {
			System.out.println("Insufficient Amount");

		}

	}

	public double deposite(double amount) {
		System.out.println("---inside deposite----");
		this.balance = this.balance + amount;
		System.out.println("Balance Aftre deposite=" + this.balance);
		return balance;

	}

	public void displayAccount() {
		System.out.println("----Account Details---------");
		System.out.println("ActId=" + actid +" Name:" + name +"  city=" + city+ " Balance=" + balance);

	}
	//act1.moneyTransfer(  act2,amount);
	
	public void moneyTransfer(Account reciver,double amount)
	{
		System.out.println("---monryTransfer-----");
		
		//send money from act1 to act2
		//sender account  act1 here this
		this.balance=this.balance-amount;		
		//reciver account		
		 reciver.balance=reciver.balance+amount;
		
		System.out.println("Money Transfered From :"+ this.getName()+"   To "+reciver.getName());
		
		System.out.println("After Money Transafer:"+this.balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
