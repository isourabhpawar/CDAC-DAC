package cloning_deep_copy;

public class Test {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student(100);
		Address a1 = new Address("pune");
		s1.setAdr(a1);
		System.out.println(s1);//100 pune
		// clone of s1
		Student s2 = s1.clone();//s1 ---> student1 --> adr1
		//s2 --> student2 --> adr2
								
		System.out.println(s2); //100 pune
		System.out.println(s1 == s2);//f
		s1.setRollNo(200);
		s1.getAdr().setCity("mumbai");
		System.out.println(s1);//200 mumbai
		System.out.println(s2);//100 pune
	

	}

}
