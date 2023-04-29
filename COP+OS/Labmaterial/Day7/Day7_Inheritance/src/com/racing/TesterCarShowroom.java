package com.racing;

public class TesterCarShowroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a collection of all cars
		
		//create an array of Parent Class
		
		Car[] arr=new Car[5];//will store 5 cars in arr
		
		//add first car in arr
		Nano n=new Nano(101, "Yellow", "Disel");
		//compile time type  arr[0] is Car
		//run time type arr[0] is Nano
		//UpCasting:Parent Class obj holds ref of Child class 
		arr[0]=n;//0 th index ref of first car
		
		BMW bmw=new BMW(202,"Black","Petrol",2);;
		
		arr[1]=bmw;//UpCasting //compile time type  arr[1] is Car
		//run time type arr[1] is BMW 
		
		arr[2]=new Ferrari(707, "Red", "Petrol", 5);//Upcsting
		 //compile time type  arr[2] is Car
		//run time type arr[2] is Ferrari 
		
		//show all cars from arr
		System.out.println("\n\n\n\n");
		for(Car c:arr)
		{
			if(c!=null)
			{	System.out.println(c.getClass());
				//runtime polymorphism
				c.speed();//at the time copilation Car class speed
		//	c.carDetails();//at the time of compilation Car class carDetails
				//to call child class behaviour downcast parent class obj
				//i.e convert parent class obje into child class obj
				//DownCasting
			//	((BMW)c).comfirt();//Car class downcast to BMW
			//with above dwnCasting may be class cast exception by JVM
				
				//use RTTI:Run Time Type Identification
				if(c instanceof BMW)//if c holding ref of BMW
				{
					((BMW)c).comfirt();
				}
				else if(c instanceof Ferrari)
				{
					((Ferrari)c).startNos();
				}
					
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
