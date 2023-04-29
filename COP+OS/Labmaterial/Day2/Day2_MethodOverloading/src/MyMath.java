
public class MyMath {

	public void add1(int i, int j) {

		System.out.println("Add(int,int)=" + (i + j));

	}

	public void add2(int a, double d) {
		System.out.println("Add(int,double)=" + (a + d));
	}

	public void add3(double d1, double d2) {
		System.out.println("Add(double ,double)=" + (d1 + d2));
	}
	
	
	//if purpose is same but for diff data types
	//create functions with same name  but with diff signature
	//Signature: 1:number of parameters 2:data type of parameter 3:sequence in which they pass
	
	//Solution:Method Overloading
	public void addition(int i,int j)
	{
		System.out.println("addition(i,i)="+(i+j));
	}
	
	public void addition(double d1,double d2) {
		System.out.println("addition(d1,d2)="+(d1+d2));
	}
	public void addition(int i,double d1)
	{
		System.out.println("addition(i,d2)="+(d1+i));
	}
	public void addition( double d1,int i)
	{
		System.out.println("addition(i,d2)="+(d1+i));
	}
	public void addition(int i,int j,int k,int l)
	{System.out.println("Addition(i,j,k,l)="+(i+j+k+l));
		
	}
	
	
	//dynamic signature :varArgs
	//can accept zero or many number of arguments
	
	
	public void sum(int... a) {
		System.out.println("Args :"+a.length);
		//
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		System.out.println("Addition of "+a.length +"  numbers="+total);
	}
	
	
	//error
//	public void xyz(int...a,double... per)
//	{
//		
//	}
//	
	//error
//	public void xyz(int... a,String name)
//	{
//		
//	}
	
	//imp:varArgs must be last argument
	public void display(String name,String... skills) {
		System.out.println("Welcome :"+name);
		System.out.println("Skills=");
		for(int i=0;i<skills.length;i++)
		{
			System.out.print (skills[i]+"  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
