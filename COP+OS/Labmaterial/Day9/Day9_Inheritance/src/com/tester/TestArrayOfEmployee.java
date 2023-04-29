package com.tester;

import java.util.Scanner;

import com.app.Employee;

public class TestArrayOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr=new int[5];
		Employee[] arr;
		arr=new Employee[5];//arr[0]=null 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{System.out.println("Empid name city salary");
			Employee e=new Employee(sc.nextInt()	, sc.next(), sc.next(), sc.nextDouble());
			arr[i]=e;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//create menu driven application for adding employee
		//1 :add employee(only unique empid added in array
		//2:display
		//3:edit city ,name
		//4:search
		
		//for each
		for(Employee obj:arr)
		{
			System.out.println(obj);
		}
		
		
		

	}

}
