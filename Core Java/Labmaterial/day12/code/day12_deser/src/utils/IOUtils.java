package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IOUtils {


	// add a static method for restoring product details , using de-ser from bin
	// file
	
	static Object restoreProductDetails(String fileName) throws IOException,ClassNotFoundException{
		// attach data strms for de-ser.
		// Java App <----- OIS: deserializer<-----FIS : node strm<---- Bin File
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			return in.readObject();
		}
	}
}
