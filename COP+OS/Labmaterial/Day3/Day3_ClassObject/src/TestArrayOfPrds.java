
public class TestArrayOfPrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product p1=new Product();
		p1.accpetDetails(11, "Pen", 20);
		
		Product p2=new Product();
		p2.accpetDetails(12, "Color Box", 50);
		
		Product[] shop=new Product[2];
		
		shop[0]=p1;
		shop[1]=p2;
		
		System.out.println("First Product from shop");
		shop[0].display();
		
		System.out.println("Second Product from shop");
		shop[1].display();
		
		System.out.println("show all prds");
		for(int i=0;i<shop.length;i++)
		{
			shop[i].display();
		}
		
		System.out.println("show price only of all  prds");
		
		for(int i=0;i<shop.length;i++)
		{
			System.out.println(shop[i].getPrice());
		}
		

	}

}
