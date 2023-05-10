package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface IOUtils {
//add a static method to store the product details from the map using ser.
	static void storeProductDetails(String fileName, Map<Integer, Product> products) throws IOException {
		// Java App --> OOS --> FOS --> bin file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(products);// serialization
		}
	}

	
}
