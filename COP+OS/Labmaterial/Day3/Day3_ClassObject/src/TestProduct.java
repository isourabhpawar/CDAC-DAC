import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of Product
		Product prd1 = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PrdId name price");
		prd1.accpetDetails(sc.nextInt(), sc.next(), sc.nextDouble());
		prd1.display();
		
		System.out.println("Enter New Price");
		prd1.setPrice(sc.nextDouble());
		
		System.out.println("Updated Price="+prd1.getPrice());
		
		prd1.display();
		
		
	}

}
