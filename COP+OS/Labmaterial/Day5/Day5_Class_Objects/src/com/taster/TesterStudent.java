package com.taster;

import com.code.Student;

public class TesterStudent {

	public static void main(String[] args) {

		Student.displayInstituteName();
		
		Student s1;
		s1 = new Student(1, "abc", "Pune", 22, 67.77);// constr
		s1.displayStudent();
		
		Student s2=new Student(2, "Xyz", "Mumbai", 20, 45.67);//constr
		s2.displayStudent();
		s1.setName("Ramesh");
		System.out.println("After UpDating name");
		
		s1.displayStudent();
		s2.displayStudent();
		
		System.out.println("-------Changein Institute Name---------");
		
		Student.changeName();
		
		s1.displayStudent();//
		s2.displayStudent();
		
		
		
		
	}

}
