import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		// declaration 
		int[] arr;
		//  instantiation  
		arr = new int[5];
		// initialization  
		arr[0] = 34;
		arr[1] = 44;
		arr[2] = 77;
		arr[3] = 88;
		arr[4] = 99;

		// display array elemnt
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		//
		// for each loop
		System.out.println();
		// for each number in array ;:start with first number till last number
		// by default fwd only read only
		for (int no : arr) {
			System.out.print(no + "  ");
		}

		// operation
		// search element from array
		// sort array
		// even numbers from array
		// odd,prime numbers
		// number>40
		// sum of array elemnts

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Capacity=");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.println("Size Of Arr1:" + arr1.length);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter Array element");
			arr1[i] = sc.nextInt();//
		}
		
		System.out.println("----Array Elements----------");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		
		System.out.println("----Array Elements----------");
		
		for(int n:arr1)
		{
			System.out.print(n+"  ");
		}
		
		
		
		
		
		

	}

}
