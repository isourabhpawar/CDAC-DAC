package cloning_shallow_copy;

public class Test {

	public static void main(String[] args) throws Exception{
		Student s1=new Student(100);// s1 ---> 1st student obj
		Address a1=new Address("Pune");
		s1.setAdr(a1);
		System.out.println(s1);//100 Pune
		//clone of s1
		Student s2=s1.clone();
		System.out.println(s2);//100 Pune
		System.out.println(s1==s2);//f
		s1.setRollNo(200);
		s1.getAdr().setCity("Mumbai");
		System.out.println(s1);//200 Mumbai
		System.out.println(s2);//100 Mumbai

	}

}
