package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);//auto boxing 
		//attach list itr
	//	ListIterator<Integer> litr=list.listIterator();
	//	System.out.println(litr.previous());
		//display elems in the list : reverse manner
		ListIterator<Integer> litr=list.listIterator(list.size());//litr : after the last elem
		while(litr.hasPrevious())
			System.out.println(litr.previous());

	
		

	}

}
