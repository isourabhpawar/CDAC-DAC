package Tester;
import static Exceptions.ValidateDetails.*;
import static ser.Serial.storedetails;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.stud.Course;
import com.app.stud.Qualif;
import com.app.stud.Student;

import ser.Serial;

public class TestStudent {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner (System.in);
				
			
				
				
				){		
		


		HashMap<String,Student> studMap=new HashMap<String,Student>();
		
		boolean exit=false;
		
		while(!exit) {System.out.println("1.restore Student details"
				+ "\n2.store student details\n3.register new student"
				+ "\n4.display all students\n5.remove students who have not submitted docs."
				+ "\n6.display students from address"
				+ "\n7.sort as per DOB \n8.display emails of stud who paid less than 70000");
			try {
				switch(sc.nextInt()) {
				case 1:
					//Restore the details
					
					HashMap<String,Student> restoredMap=new HashMap<>();
					//it overwrite exisiting map so creating new map restored
//					studMap=(HashMap<String, Student>) ois.readObject();
					restoredMap=(HashMap<String, Student>) Serial.restoredet();
					
					System.out.println("printing restored details");
					restoredMap.values().forEach(q->System.out.println(q));
					
					
					break;
					
				case 2:
					
					//store details in filename stud.ser
					
					
					Serial.storedetails(studMap);
					System.out.println("Stored All details in stud.ser file");
					
					
					break;
					
				case 3://registering new student
					
					
					
					System.out.println("rollno,  fname,  lname,  email,  address,  course,\r\n"
							+ " qualification,  dob,  fees,  isDocSubmitted? (boolean)");
					
					String roll=sc.next();
					String fnamee =sc.next();
					String lnamee =sc.next();
					String email =sc.next();
					String address=sc.next();
					String course=sc.next();
					String qualiff=sc.next();
					String dob =sc.next();
					double fees =sc.nextDouble();
					boolean docsub=sc.nextBoolean();
					//asd sourabh pawar s.com pune dbda mech 2020-02-03 50000 true
					//zxc suhas patil c.com nasik dac entc 2021-03-03 60000 false
					//qwe pranav p p.com mumbai ditiss comp 2023-03-03 90000 true
					
					
					Student s=new Student(roll,fnamee,lnamee,email,address,Course.valueOf(course.toUpperCase()),validQualif(qualiff),validateDob(LocalDate.parse(dob)),fees,docsub);
					
					studMap.put(s.getRollno(), s);
					studMap.values().forEach(s1->System.out.println(s1));
					
					break;
					
				case 4://displaying all students
					studMap.values().forEach(s1->System.out.println(s1));
				
				
					break;
					
				case 5:
					//removing who have not subbmitted docs
					
					studMap.values().removeIf(d->(!d.isDocSubmitted()));
					System.out.println("\n removed all students who not"
							+ " submitted documents ");
					break;
					
				case 6:
					//displaying according to city 
					
					System.out.println("Enter the city name to display");
					String city=new Scanner(System.in).next();
					studMap.values().stream().filter(c->c.getAddress().equals(city)).forEach(v->System.out.println(v));
				
					
					
					break;
					
				case 7:
					//sorting on dob
					System.out.println("Print Sorted Students dob wise");
					
					studMap.values().stream().sorted((d1,d2)->d1.getDob().compareTo(d2.getDob())).forEach(b->System.out.println(b));
					
					break;
					
				case 8://display email 70000
					
					System.out.println("Displaying stud emails paid less than 70000");
					
					studMap.values().stream().filter(g1->(g1.getFees())<70000.0).forEach(p->System.out.println(p.getEmail()));
					
					
					
					break;
					
				
					
				}
				
				
				
				
			}
			catch(Exception e) {e.printStackTrace();sc.nextLine();
				
			}
			
			
			
		}
		
        }catch(Exception e) {
        	new Scanner(System.in).nextLine();
        	e.printStackTrace();
        	
        }
	}

}
