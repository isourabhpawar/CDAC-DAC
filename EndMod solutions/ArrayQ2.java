import java.util.*;

public class arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a[] = new int[sc.nextInt()];
		//taking size as input from user
		System.out.println("Enter the elements of array");
		//taking elements as input
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Elements of array: ");
		//printing array elements
		for(int i=0; i<a.length; i++) {
		    System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//sorting array
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int count = 0;//to count the frequency
		int i = 0;//loop iterator
		for (int j = i + 1; j < a.length; j++) {//traversing through the array
			//track the just next element to i'th index
			if (a[i] == a[j]) {//if element matches then count++
				count++;

			} else {
				System.out.println("frequency of element " + a[i] + " is " + (count + 1));
				//print count+1 because there will be atleast one element
				i = j;//reset the i'th index
				count = 0;//reset the count

			}
		}
		System.out.println("frequency of element " + a[a.length - 1] + " is " + (count + 1));
		// the last element will be left untracked 
		//so this statement is specially for last element

	}

}
