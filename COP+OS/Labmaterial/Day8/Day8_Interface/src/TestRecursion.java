
public class TestRecursion {

	
	public static int sum(int no)//no=10 9
	{
		
		if(no>0)
		{
			return no+sum(no-1);
		}else
			return 0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//make addition from 1 to 10
	int total=	sum(5);
		System.out.println("Total:"+total);
	}

}
