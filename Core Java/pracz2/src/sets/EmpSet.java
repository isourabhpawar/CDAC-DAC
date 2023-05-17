package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		Emp e1=new Emp("rnd-001", "Riya", 10000);
		Emp e2=new Emp("rnd-003", "Rakesh", 20000);
		Emp e3=new Emp("rnd-001", "Riya", 10000);
		Emp e4=new Emp("rnd-004", "Riya", 10000);
		Emp e5=new Emp("rnd-002", "Rakesh", 20000);
		Emp e6=new Emp("rnd-008", "Riya", 10000);
		//create empty HS to store Emp refs
		HashSet<Emp> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t , hc : 1
		System.out.println("Added "+emps.add(e2));//t , hc : 1 , 
		System.out.println("Added "+emps.add(e3));//f hc : 1 , eq : 1
		System.out.println("Added "+emps.add(e4));//t , hc : 1 
		System.out.println("Added "+emps.add(e5));//t hc : 1 
		System.out.println("Added "+emps.add(e6));//t  , hc : 1 
		System.out.println("size "+emps.size());//5
		for(Emp e : emps)
			System.out.println(e);//no dups
	

	}

}
