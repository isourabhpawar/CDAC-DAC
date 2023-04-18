1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.

//Class File

public class Classroom {
private int rollno, mark1, mark2,mark3, total;
public float percentage;
public String grade;
public Classroom(int rollno,int mark1,int mark2,int mark3)
{
this.rollno=rollno;
this.mark1=mark1;
this.mark2=mark2;
this.mark3=mark3;
}
public void total()
{
total=mark1+mark2+mark3;
}
public int getTotal()
{
return total;
}
public void percentage()
{
percentage=(total*100)/300;
}
public float getpercentage()
{
return percentage;
}
public String grade()
{
if(percentage>80)
{
return grade="A+";
}
else if(80<percentage|| percentage>65)
{
return grade="A";
}
else
{
return grade="B";
}
}
public void Display()
{
System.out.println("-------------------------------");
System.out.println("roll no: "+rollno+"\ntotal: "+total+"\npercentage: "+percentage+"\ngrade: "+grade);
}
}
//Tester File
import java.util.Scanner;
import assignmnet.Classroom;
public class TestClassroom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter roll no, mark1, mark2, mark3: ");
		Classroom cr = new Classroom(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		cr.total();
		cr.percentage();
		cr.getpercentage();
		cr.grade();
		cr.Display();
		sc.close();
	}
}


 
 
 


1.1 Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class. 

//Class File

package CodeFile;

public class Person {
	
	private int age;
	private String name, city;
	
	public Person() {
		System.out.println("Default Constructor called!");
	}
	
	public Person(int age,String name,String city) {
		//System.out.println("Parameterized Constructor called!");
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
	//getters for all data members
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	//setters for all data members
	public void setAge(int a) {
		this.age = a;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println("Employee Details: ");
		System.out.println("Age: "+this.age+"\nName: "+this.name+"\nCity: "+this.city);
	}
}

//Tester

package Tester;

import java.util.Scanner;
import CodeFile.Person;

public class PersonTester {

	public static void main(String[] args) {
		
		Person obj1;
		obj1 = new Person();
		
		Person obj2;
		obj2 = new Person(23,"Pranav","Pune");
		
		obj2.display();
		
		//calling getters
		String name = obj2.getName();
		String city = obj2.getCity();
		int age = obj2.getAge();
		System.out.println("-------------------------------");
		
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
		
		System.out.println("-------------------------------");
		
		//calling setters
		System.out.println("Set the Values for Data Members: ");
		obj1.setAge(23);
		obj1.setName("Anuj");
		obj1.setCity("Nashik");
		obj1.display();
		
	}
}

OUTPUT:




2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class. 

//Class File

package CodeFile;

public class Date{
	
	//Private Data Members
	private int day,month,year;
	
	//Constructors
	public Date(){
		this.day = 1;
		this.month = 6;
		this.year = 1980;
	}
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	//Display Method
	public void display() {
		System.out.println("Date as per user is : ");
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
}


//Tester

package Tester;

import java.util.Scanner;
import CodeFile.Date;

public class DateTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date obj1 = new Date();
		obj1.display();
		 
		System.out.println("Enter Date:(DD/MM/YYYYY) ");
		Date obj2 = new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		obj2.display();
	}
}
OUTPUT:





3. Create a class Book with data members as bname,id,author,price. Write getters and setters for all the 
data members. Also add the display function. Create Default and Parameterized constructors. Create 
the object of this class in main method and invoke all the methods in that class. 

//Class File

package CodeFile;

public class Book {
	
	//Private Data Members
	private int id;
	private String bName,author;
	private int price;
	
	//Default Constructor
	public Book(){}
	
	//Parameterized Constructor
	public Book(int i,String bn, String a, int p){
		this.id = i;
		this.bName = bn;
		this.author = a;
		this.price = p;
	}
	
	//getters
	public int getID() {
		return this.id;
	} 
	
	public String getbName() {
		return this.bName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	//setters
	public void setbName(String n) {
		this.bName = n;
	}
	
	public void setAuthor(String a) {
		this.author = a;
	}
	
	public void setPrice(int p) {
		this.price = p;
	}
	
	//Display Method
	public void display() {
		System.out.println("Book ID: "+this.id+"\nBook Name: "+this.bName
				+"\nAuthor Name: "+this.author
				+"\nPrice: "+this.price);
	}
}

//Tester

package Tester;

import java.util.Scanner;
import CodeFile.Book;

public class BookTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Details");
		
		int id,price;
		String name,author;
		
		System.out.println("Enter Book Id: ");
		id = sc.nextInt();
		
		System.out.println("Enter Book Name: ");
		name = sc.next();
		
		System.out.println("Enter Book Author: ");
		author = sc.next();
		
		System.out.println("Enter Book Price: ");
		price = sc.nextInt();
		
		Book obj = new Book(id,name,author,price);
		
		//Calling Getters
		id = obj.getID();
		name = obj.getbName();
		author = obj.getAuthor();
		price = obj.getPrice();
		
		System.out.println("Entered Book Deatils are as follows: ");
		
		//Displaying Details
		System.out.println("Updated Details are as follows: ");
		obj.display();	
	}
}

OUTPUT:


4. Create a class Point with data members as x,y. Create Default and Parameterized constructors. Write 
getters and setters for all the data members. Also add the display function. Create the object of this 
class in main method and invoke all the methods in that class. 

//Class File

package CodeFile;

public class Point {

	//Private Data Members
	private int x,y;
	
	//Constructor
	public Point(){
		this.x=0;
		this.y=0;
	}
	
	//getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	//setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	//display method
	public void display() {
		System.out.println("Values of X and Y are: "+this.x+" "+this.y);
	}
	
}

//Tester

package Tester;

import CodeFile.Point;
import java.util.Scanner;

public class PointTester {

	public static void main(String[] args) {
		
		Point obj = new Point();
		obj.display();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Setting the New Values for X and Y... ");
		System.out.println("Enter Value for X and Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		obj.setX(x);
		obj.setY(y);
		obj.display();
		
		System.out.println("New set values for X and Y are:");
		System.out.println("New value of X is: "+obj.getX()+"New Value of Y is: "+obj.getY());
	}

}

OUTPUT:



5. Create a class ComplexNumber with data members real, imaginary. Create Default and Parameterized constructors. Write getters and setters for all the data members. Also add the display function. Create the object of this class in main method and invoke all the methods in that class.

//Class File

package CodeFile;

public class ComplexNumber {
	
	//Private Data Members
	private int real,img;
	
	//Constructors
	public ComplexNumber(){
		this.real = 1;
		this.img = 1;
	}
	
	public ComplexNumber(int r,int i){
		this.real = r;
		this.img = i;
	}
	
	//getters
	public int getReal(){
		return real;
	}
	
	public int getImg(){
		return img;
	}
	
	//setters
	public void setReal(int real){
		this.real = real;
	}
	
	public void setImg(int img){
		this.img = img;
	}
	
	public void display() {
		System.out.println("Complex Number is : "+this.real+"+"+this.img+"i");
	} 
}

//Tester

package Tester;

import java.util.Scanner;
import CodeFile.ComplexNumber;

public class ComplexNumberTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bydefault Complex Number");
		
		ComplexNumber obj1 = new ComplexNumber();
		
		System.out.println("Parameterized Inputed Complex Number");
		ComplexNumber obj2 = new ComplexNumber(2,3);
		
		System.out.println("Enter Complex Number as per user:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		obj2.setReal(x);
		obj2.setImg(y);
		obj2.display();
		
	}

}

OUTPUT:





6:create BankAccount  aaplication for operations like withdraw ,deposite and moneyTransfer.
Create menu drive program for bank operations..

//Class File

package BankAccount;

public class Account {
	private int actid;
	private String name,city;
	double balance;
	
	public Account(int actid,String name,String city,double balance){
		System.out.println("--account constrctr para--");
		this.actid=actid;
		this.name=name;
		this.city=city;
		this.balance=balance;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public int getActid() {
		return actid;
	}
	public double getBalance() {
		return balance;
	}
	
	public double withdraw(double amount) {
		if(balance>amount) {
			this.balance -= amount;
			System.out.println("Balance after withdraw "+this.balance);
		}else {System.out.println("Insufficient Balance");}
		return balance;
	}
	
	public double deposit(double amount) {
		this.balance+=amount;
		System.out.println("Balance after deposit is "+this.balance);
		return balance;
	}
	
	public void displayAccount() {
		System.out.println("--Account Details--");
		System.out.println("Name:- "+name+"\nAccountID:- "
		+actid+" City:- "+city+" Balance= "+ balance);
	}
		
	public void moneyTransfer(Account reciever,double amount) {
		System.out.println("transaction in process");
		this.balance-=amount;//this because amount has to be 
		//deducted from object that is initiating the transaction
		reciever.balance+=amount;
		System.out.println("money transferred from "+this.getName()+" to "
				+reciever.getName());
		System.out.println("Balance after money transfer"+this.balance);
	}	
	public String monytrnsfr(Account recievr,int amounnt) {
		this.balance-=amounnt;
		recievr.balance+=amounnt;
		return "Updated balance is "+ this.balance;	
		
	}	
}

//Tester



package TestBank;

import java.util.Date;
import java.util.Scanner;
import BankAccount.Account;

public class TestBankofCdac {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int index = 0;
		boolean flag = false;
		int id;
		double amt;
		Account act = null;// check hashcode

		Account[] bankofCdac = new Account[10];

//		for (int i = 0; i < bankofCdac.length; i++) {
//			System.out.println(bankofCdac[i] + " ");
//		}
		System.out.println("Welcome to bankofCdac\n");
		System.out.println("1.Create new account");
		System.out.println("2.Show all accounts");
		System.out.println("3.Deposit amount");
		System.out.println("4.Withdraw amount");
		System.out.println("5.Check Balance");
		System.out.println("6.Update city");
		System.out.println("7.Show all account holder names");
		System.out.println("8.Show all account holder cities");
		System.out.println("9.Moneytransfer");

		do {
			System.out.println("Select the option from above menu  ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				if (index < bankofCdac.length) {
					System.out.println("Enter account id," + " Name, City, Balance");
					bankofCdac[index] = new Account(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
					index++;

				} else {
					System.out.println("Maximum limit reached");

				}
				break;

			case 2:
				for (int i = 0; i < bankofCdac.length; i++) {
					if (i < index) {
						bankofCdac[i].displayAccount();
					}
				}
				break;

			case 3:
				flag=true;
				System.out.println("Enter Account ID");
				id = sc.nextInt();
				for (int i = 0; i < bankofCdac.length; i++) {
					if (i < index) {
						if (id == bankofCdac[i].getActid()) {
							System.out.println("Enter amount to deposit");
							amt = sc.nextDouble();
							bankofCdac[i].deposit(amt);
							flag = true;
						} else {
							flag = false;
						}

					}
					if (flag == false) {
						System.out.println("Account doesnot exist");
					}
				}
				break;

			case 4:
				System.out.println("Enter the Account Id");
				id = sc.nextInt();

				for (int i = 0; i < bankofCdac.length; i++) {
					if (i < index) {
						if (id == bankofCdac[i].getActid()) {
							System.out.println("Enter amount to Withdraw");
							amt = sc.nextInt();
//						System.out.println("Transaction Successful.Updated account balance is: ");
							bankofCdac[i].withdraw(amt);
							break;

						} else {
							System.out.println("Invalid Account ID");
						}
					}
				}
				break;

			case 5:
				System.out.println("Enter the Account Id");
				id = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (id == bankofCdac[i].getActid()) {
						System.out.println("Your account balance is: ");
						System.out.print(bankofCdac[i].getBalance() + "\n");
						flag=true;break;
					} if(flag==false){
						System.out.println("Invalid Account ID");
					}
				}
				break;
			case 6:
				System.out.println("Enter the Account Id");
				id = sc.nextInt();
				flag=false;
				for (int i = 0; i < bankofCdac.length; i++) {
					if (i < index) {
						if (id == bankofCdac[i].getActid()) {

							System.out.println("Enter the new city name: ");
							bankofCdac[i].setCity(sc.next());
//						System.out.println("Your new city name is:  " + (bankofCdac[i].getCity()));
						flag =true;break;
						}if(flag==false){
							System.out.println("Invalid Account ID");
						}
					}
				}
				break;

			case 7:
				for (int i = 0; i < bankofCdac.length; i++) {
					if (i < index) {
						System.out.println(bankofCdac[i].getName() + " ");

					}
				}
				break;
			case 8:
				for (int i = 0; i < index; i++) {
					{
						System.out.println(bankofCdac[i].getCity() + " ");
					}
				}
				break;

			case 9:
				System.out.println("Enter the our account id");
				int sender = sc.nextInt();
				System.out.println("Enter the beneficiary account id");
				int reciever = sc.nextInt();
				System.out.println("Enter the amount");
				int amountt = sc.nextInt();
				System.out.println("transaction in process");
				Thread.sleep(1000);
				for (int i = 0; i < index; i++) {
					for (int j = 0; j < index; j++)
						if (bankofCdac[i].getActid() == sender && bankofCdac[j].getActid() == reciever) {
							System.out.println(bankofCdac[i].monytrnsfr(bankofCdac[j], amountt));

						}
				}

				break;
			}
		} while (choice != 10);

	}

}

OutPut





7:Create Student class with rollno, name address.
Write business logic for auto incrment of rollno(don't accept roll no from user)
Write parameterised constr for accepting name and address only
Write getter and setter and display function
7.1 Test Student class by creating  5 diff object.and display aal details(chk rollno created automatically)
7.2 Create an array of 5 students and show only names 

Code done in asked fashion, created two packages StudentClass and StudentClassTester



//ClassFile



package StudentClass;

public class Student {
	private static int rollcounter=1000;
//	static block
//	static {
//		  rollcounter = 1000;
//	}
	
	//Data Members
	private int rollNo;
	private String name;
	private String address;
	
	//Constructors	
	public Student(String name, String address) {
		rollcounter++;
		this.rollNo = rollcounter;
		this.name = name;
		this.address = address;		
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address= address;
	}
		

	//Methods
	
	public void display() {
		System.out.println("Roll No of Student is "+this.rollNo+"\nThe Name of Student is "+this.name+
				"\nAddress is "+this.address+"\n");
	}
}





//Tester
package StudentClassTester;

import java.util.Scanner;

import StudentClass.Student;

public class TesterStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int index = 0;
		int ch = 1;
		Student stud[] = new Student[5];

		do {
			
			System.out.println("\nSelect the option: \n1.Create Student\n2.Display Students"
					+ "\n3.Display Names\n4.Exit");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				
					System.out.println("Enter name and address of student " + (index + 1));
					stud[index] = new Student(sc.next(), sc.next());
					index++;
			
				break;
				
			case 2:
				for (int j = 0; j < index; j++) {
					stud[j].display();
				}
			break;
			case 3:
				System.out.println("Names are: ");
				for (int j = 0; j < index; j++) {
					System.out.println(stud[j].getName());
				}
			
			break;
			
			

		
	
            }
            }while (ch != 4);
	}
}
