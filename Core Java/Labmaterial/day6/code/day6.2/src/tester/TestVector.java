package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<String> strings=new Vector<>(5, 12);
		for(int i=0;i<10;i++)
			strings.add("name "+i);
		System.out.println(strings);
		System.out.println(strings.size());
		System.out.println(strings.capacity());
		//sort these strings n display the same
		Vector<String> strings2=new Vector<>();
		String[] names= {"Rutuj","Anish","Priyanka","Amiti","Shubham","Ravi"};
		for(String s : names)
			strings2.add(s);
		System.out.println(strings2);
		Collections.sort(strings2);
		System.out.println("sorted strings");
		System.out.println(strings2);
		//desc sorted manner
		Collections.sort(strings2, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println("sorted strings : desc"); 
		System.out.println(strings2);
		
		

	}

}
