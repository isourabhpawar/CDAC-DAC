package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.shop.core.Product;

public interface IOUtils {
//add static method to store sorted  list of products in the text file using buffer
	static void storeProductDetails(String fileName,List<Product> products) throws IOException
	{
		//create chain of I/O strms Java App ---> PW -->FW ---> Text File
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			products.forEach(pw::println);//p -> pw.println(p)
		}//pw.close [..........]
	}
}
