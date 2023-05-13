package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
		// display list of products : using forEach
				List<Product> productList = populateProductList();
				System.out.println("product list");
				productList.forEach(p -> System.out.println(p));
				//remove all the products from specified category
				System.out.println("Enter product category");
				Category chosenCategory=Category.valueOf(sc.next().toUpperCase());
				//Higher order func : Collection i/f method
				//public default boolean removeIf(Predicate<? super T> filter)
				//SAM : public boolean test(T t)
				boolean removed
				=productList.removeIf(p -> p.getProductCategory()==chosenCategory);
				System.out.println(removed);//t / f
				System.out.println("product list again ");
				productList.forEach(p -> System.out.println(p));
			
				
		}
			

	}

}
