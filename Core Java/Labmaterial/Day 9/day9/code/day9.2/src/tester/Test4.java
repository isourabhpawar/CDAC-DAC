package tester;
import static utils.ShopUtils.*;

import java.util.Map;

import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
			//display the products from the Map
		Map<Integer, Product> productMap = populateProductMap(populateProductList());
		System.out.println("Products in the shop : using Map");
		productMap.forEach((k,v)-> System.out.println(k+" : "+v));
	}

}
