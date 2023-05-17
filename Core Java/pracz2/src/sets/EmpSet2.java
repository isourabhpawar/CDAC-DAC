package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {
		Emp e1=new Emp("rnd-001", "Riya", 10000);
		Emp e2=new Emp("rnd-003", "Rakesh", 20000);
		Emp e3=new Emp("rnd-001", "Riya", 10000);
		Emp e4=new Emp("BBBB", "Riya", 10000);
		Emp e5=new Emp("AaBB", "Rakesh", 20000);
		Emp e6=new Emp("AaAa", "Riya", 10000);
		Emp e7=new Emp("BBAa", "Riya", 10000);
		//BBBB AaBB AaAa BBAa : un equal objs BUT same hash code
		//create empty HS to store Emp refs
		HashSet<Emp> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t , hc : 1
		System.out.println("Added "+emps.add(e2));//t , hc : 1 , 
		System.out.println("Added "+emps.add(e3));//f hc : 1 , eq : 1
		System.out.println("Added "+emps.add(e4));//t , hc : 1 
		System.out.println("Added "+emps.add(e5));//t hc : 1 , eq : 1
		System.out.println("Added "+emps.add(e6));//t  , hc : 1  , eq : 2
		System.out.println("Added "+emps.add(e7));//t  , hc : 1 , , eq : 3
		System.out.println("size "+emps.size());//5
		for(Emp e : emps)
			System.out.println(e);//no dups
	

	}

}
