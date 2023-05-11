package runnable_tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;
import static utils.IOUtils.storeProductDetails;

public class DateSorterTask implements Runnable {
	// state :
	private String fileName;
	private Map<Integer, Product> products;

	public DateSorterTask(String fileName, Map<Integer, Product> products) {
		super();
		this.fileName = fileName;
		this.products = products;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			// map --> collection --> strm --> sorted --> collect
			List<Product> sortedProductList = products.values() // Collection<Product>
					.stream() // Stream<Product>
					.sorted((p1, p2) -> p1.getManufactureDate().compareTo(p2.getManufactureDate()))// sorted
					// Stream<Product>
					.collect(Collectors.toList());//terminal op : to collect stream elems in to the list
			// store the list in text file
			storeProductDetails(fileName, sortedProductList);
			System.out.println("storing of products done by " + Thread.currentThread().getName());

		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
