package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);//auto boxing 
		//attach iterator to display elems
		Iterator<Integer> itr=list.iterator();//itr : before 1st elem , before index 0
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
