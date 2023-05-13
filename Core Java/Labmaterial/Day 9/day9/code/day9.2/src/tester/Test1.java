package tester;

import static utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Product;

public class Test1 {

	public static void main(String[] args) {
		// display list of products : using forEach
		List<Product> productList = populateProductList();
		System.out.println("product list");
		productList.forEach(p -> System.out.println(p));
		//apply discount to all the products by 10 Rs
		productList.forEach(prod -> prod.setPrice(prod.getPrice()-10));
		System.out.println("product list again ");
		productList.forEach(p -> System.out.println(p));
	}

}
