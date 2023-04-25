package productshop;
import java.util.Scanner;
public class TestProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Grossary ");
		
		Category[] c=Category.values();
		
		Product[] prod=new Product[10];
		
		
		int index=0;
		
		System.out.println("Select the option from below: \n1.Add new product \n2.Display all products"
				+ "\n3.Show Product from ID \n4.Show all products above certain price \n5.Show products"
				+ "from category \n0.To exit ");
		
		int ch=0;
		
		do{System.out.println("Select the option from choices given above:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter pid,pname,pprice,pcategory");
				prod[index]=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),Category.valueOf(sc.next().toLowerCase()));
				index++;
				System.out.println("Product added");
				break;
			case 2:
				for(Product i:prod) {
					if(i!=null) {System.out.println(i);}
					
				}
				break;
				
			case 3:
				System.out.println("Enter the product id");
				int prodid=sc.nextInt();
				for(Product i:prod) {if(i!=null) {
					if(i.getPid()==prodid) {System.out.println(i);
						
					}}
					
				}
				break;
			
			case 4:
				System.out.println("Enter the price to show products above that prices");
				int prodprice=sc.nextInt();
				for(Product i:prod) {if(i!=null) {
					if(i.getPprice()>prodprice) {System.out.println(i);
						
					}
				}
				}
			break;
			
			case 5:
				System.out.println("Enter the category name to show products");
				String cat=sc.next();
				for(Product i:prod) {if(i!=null) {
					if(i.getCategory()==Category.valueOf(cat)) {System.out.println(i);
						
					}
				}
				}
				break;
		
			
			
			
			}
			
		}while(ch!=0);
			
		
		

	}

}
