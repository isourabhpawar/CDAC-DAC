import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		System.out.println("1 :accept array 2:disp array 3:searcing element 4:sum of array 5: exit");
		int[] arr;
		System.out.println("How Many Element To Store");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Array Created For storing "+arr.length+"  Numbers");
		do {
			System.out.println();
			System.out.println("Enter Choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				//accept
				for(int i=0;i<arr.length;i++)
				{
				arr[i]=sc.nextInt();
				}
				break;
			case 2://display
				for(int i=0;i<=arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				break;
			case 3:
				System.out.println("Enter Element To find");
				int no=sc.nextInt();
				boolean flag=false;;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==no)
					{
						flag=true;
						break;
						//System.out.println("Present");
					}
					else
					{
						flag=false;
						//System.out.println(" Not Present");
					}
					
				}
				if(flag==true)
					System.out.println("Present");
				else
					System.out.println("Not Present");
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("invalid choice");
				break;

			}// switch
		} while (ch != 5);
		System.out.println("----end of main----");
	}

}
