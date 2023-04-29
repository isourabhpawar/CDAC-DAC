package string_handling;

public class Test3 {

	public static void main(String[] args) {
		// == vs equals
		String s1 = new String("hello");// s1 ---> non literal string
		String s2 = new String(s1);// s2 -->non literal string
		System.out.println(s1 == s2);// f : ref equality(adr comparison)
		System.out.println(s1.equals(s2)); // t : content equality : case sensitive
		String s3 = s1.toUpperCase();
		System.out.println(s1 == s3);// f
		System.out.println(s1.equals(s3));// f
		System.out.println(s1.equalsIgnoreCase(s3));// t
		/*
		 * IMPORTANT : To check the equality of 2 strings , NEVER use == , but use
		 * equals / equalsIgnoreCase
		 */

	}

}
