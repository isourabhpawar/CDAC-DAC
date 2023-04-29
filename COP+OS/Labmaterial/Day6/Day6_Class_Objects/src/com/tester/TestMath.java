package com.tester;

//import com.code.MyMath;
import com.code.Student;//import class
import static com.code.MyMath.*;//static import:used for static data members or methods so no need to use class name
public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		
		//static methods get called using ClassName.MethodName
		//without static import
//	    int i=	 MyMath.add(23, 354); 
//		System.out.println("Add="+i);
//		System.out.println("Max="+MyMath.max(45, 23));
//		System.out.println("pow="+MyMath.power(4, 3));
//		
//		 using static import
		
		int i=	 add(23, 354);//static import:no need to use class name to call add 
		System.out.println("Add="+i);
		System.out.println("Max="+ max(45, 23));
		System.out.println("pow="+ power(4, 3));
		
	}

}
