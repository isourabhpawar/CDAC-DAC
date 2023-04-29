package string_handling;

public class Test1 {

	public static void main(String[] args) {
		//immutability of strings
		 String s="hello";
		s.concat("hi");
		System.out.println(s);//hello
		s+="12345";//s=s+"12345";
		System.out.println(s);//hello12345
		String s1=s.toUpperCase();
		System.out.println(s);//hello12345
		System.out.println(s1);//HELLO12345
		System.out.println(s.replace('l', 'p'));//heppo12345
		System.out.println(s);//hello12345
		System.out.println("substring "+s.substring(2,6));//llo1
				
		

	}

}
