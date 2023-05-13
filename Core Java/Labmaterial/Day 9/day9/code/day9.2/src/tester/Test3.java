package tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>(Arrays.asList
				("func java", "scala", "python", "javascript", "c#"));
		//display the list 
		strings.forEach(s -> System.out.println(s));
		//remove all the strings with length > 5
		strings.removeIf(s -> s.length()> 5);
		System.out.println("list after remove");
		strings.forEach(s -> System.out.println(s));
		
	}

}
