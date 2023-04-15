1: Create Date class with members day,month ,year.
Write no argument and parameterised constructor .Create two object s and initialize them using no argument and parameterised constructor respectively. Print date using display function.

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



2:Create Employee class with members id(int),name(string)  
Write default and parameterised constructor in Employee Class.Write accept() function to accept information and display() to display emp information.

//Class File

package CodeFile;

public class Employee{
	
	//Private Data Members
	private int id;
	private String name;
	
	//Constructors
	public Employee(){
		System.out.println("Implicit call to Constructor!");
	}
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	//Accepts Method
	public void accept(int id,String name) {
		this.id = id ;
		this.name = name;
	}
	
	//Display Method
	public void display() {
		System.out.println("Employee Details: \nid:"+id+" name:"+name+" ");
	}
}

//Tester

package Tester;

import java.util.Scanner;
import CodeFile.Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee obj;
		obj = new Employee();
		
		System.out.println("Enter Details of an Employee: ");
		obj.accept(sc.nextInt(),sc.next());
		
		obj.display();
		
	}
}



3. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class.

//Code File

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


4: Create a class Book with data members as bname,id,author,price. Write getters and setters for all the data members. Also add the display function.  
Create the object of this class in main method and invoke all the methods in that class.

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



5. Create a class Point with data members as x,y.  Write 
getters and setters for all the data members. Also add the display function. Create the object of this class in main method and invoke all the methods in that class. 
package CodeFile;

//Class File

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



6. Create a class ComplexNumber with data members real, imaginary.  Write getters and setters for all the data members. Also add the display function. Create the object of this class in main method and invoke all the methods in that class.

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
