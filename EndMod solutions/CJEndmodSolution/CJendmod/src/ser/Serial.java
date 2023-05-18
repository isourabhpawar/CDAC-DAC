package ser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.stud.Student;

public class Serial {

	public static void main(String[] args) {
//creating streams io
      try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream("stud.ser"));
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stud.ser"));){
	
           }
		catch(Exception e) {
			e.getMessage();
		}
		

	}
	public static void storedetails(Map<String,Student> storemap) throws FileNotFoundException, IOException {
		try(//storingdetails functions
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("stud.ser"));){
		oos.writeObject(storemap);
		
		}
	}
	public static Map<String,Student> restoredet() throws IOException, ClassNotFoundException{
		try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream("stud.ser"));){
		//restoring details
		Map<String,Student> smap=(Map<String, Student>) ois.readObject();
		return smap;
		}
	}
		
	}


