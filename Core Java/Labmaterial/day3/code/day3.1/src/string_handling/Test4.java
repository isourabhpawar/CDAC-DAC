package string_handling;

public class Test4 {

	public static void main(String[] args) {
		//literal vs non literal strings
		String s1="hello";
		String s2=new String(s1);
		String s3="hello";
		String s4="Hello";
		System.out.println("s1==s2"+(s1==s2));//f
		System.out.println("s1 eq s2"+s1.equals(s2));//t
		System.out.println("s1==s3"+(s1==s3));//t
		System.out.println("s1 eq s3"+s1.equals(s3));//t
		System.out.println("s1==s4"+(s1==s4));//f
		System.out.println("s1 eq s4"+s1.equals(s4));//f
		System.out.println("s1 ignore case eq s4"+s1.equalsIgnoreCase(s4));//t

	}

}
