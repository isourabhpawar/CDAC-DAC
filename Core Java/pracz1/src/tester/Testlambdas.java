package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

import com.shop.core.Product;

public class Testlambdas {

	public static void main(String[] args) {
		
		/*Comparator<Product> productComp = 
				(p1, p2) -> ((Double) p2.getPrice()).compareTo(p1.getPrice());
		Collections.sort(productList, productComp);//higher order func using func literal
		System.out.println("Sorted  list as per price desc");
		productList.forEach(p -> System.out.println(p));
		*
		// Sort the products in the list as per date : custom ordering
		Collections.sort(productList, (p1, p2) -> p1.getManufactureDate().compareTo                    		(p2.getManufactureDate()));
		 * 
		 * 	productMap.values() //Collection<Products>
			.removeIf(p -> p.getManufactureDate().isBefore(date));
		 * 
		 * Optional<Product> optionalProduct = productMap.values() // Collection<Product>
					.stream() // Stream<Product> : all : src
					.filter(p -> p.getProductCategory() == cat)// Stream<Product> : filtered as per cat
					.max((p1, p2) -> ((Double) p1.getPrice()).compareTo(p2.getPrice()));
			if (optionalProduct.isPresent())
				System.out.println("Name of most expensive product " + 
				optionalProduct.get().getName());
		 * 
		 * double sum = productMap.values() //Collection<Product>
			.stream() //Stream<Product> : all  : src
			.filter(p -> p.getProductCategory()==cat)//Stream<Product> : filtered as per cat
			.mapToDouble(p -> p.getPrice())		//DoubleStream : double : prim.
			.sum();//terminal op.
		 *
		 *
		 *
			
		 */
		 
 	


	}

}
