package lists;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {

	public static void main(String[] args) {
		// create empty AL to store Integer refs
		ArrayList<Integer> intList = new ArrayList<>();// size=0, capa :10
		System.out.println("Printing empty AL");
		for (int i : intList)
			System.out.println(i);// no iteration : since AL iterates over size
		System.out.println(intList);
		int[] data = { 10, 2, 34, 11, 5, 4, -10, 2, 10, 30, 20, 109, 100 };
		// populate AL with above data
		for (int i : data)// i=data[0].....
			intList.add(0,i);// append , auto boxing (int ---> Integer)
		System.out.println("populated AL " + intList);
		intList.add(0, 99);
		System.out.println("AL again " + intList);// [99,10,2,34,11,5,4,-10,2,10,30,20,109,100]
		System.out.println(intList.contains(-10));// invokes internally Integer's equals --t
		System.out.println("Removed " + intList.remove(intList.indexOf(-10)));// -10
		System.out.println(intList.contains(-10));// f
		System.out.println("AL again " + intList);// [99,10,2,34,11,5,4,2,10,30,20,109,100]
		System.out.println(intList.indexOf(10) + " " + intList.lastIndexOf(107));
		// double the values of all elems > 50
		for (int i = 0; i < intList.size(); i++)
			if (intList.get(i) > 50)// auto un boxing
				System.out.println("Replaced " + intList.set(i, intList.get(i) * 2));// 99 109 100

		System.out.println("AL again " + intList);// ordered list
		// sort these elems in asc order
		// API : java.util.Collections : public void sort(List<T> list) --uses natural
		// ordering --based java.lang.Comparable<T>
		Collections.sort(intList);
		System.out.println("AL again " + intList);//sorted list
//		for (int i : data)// i=data[0].....
//			intList.add(i);// append , auto boxing (int ---> Integer)
//		System.out.println("populated AL " + intList);
	}

}
