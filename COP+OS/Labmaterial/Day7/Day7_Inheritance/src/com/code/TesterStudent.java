package com.code;

public class TesterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);

		Student std = new Student(10, "Vinit", 90);
		System.out.println(std);//will call student toString()
		
		
		Student[] arr=new Student[5];
		
		arr[0]=std;
		arr[1]=new Student(2, "Abc", 90.45);
		arr[2]=new Student(3, "Abc1", 30.45);
		arr[3]=new Student(4, "Ab2c", 50.45);
		arr[4]=new Student(5, "Ab3c", 60.45);
		
		System.out.println("--------------");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("--------------");
		
		
		for(Student s :arr)
		{
			System.out.println(s);
		}
		
		
		

	}

}
