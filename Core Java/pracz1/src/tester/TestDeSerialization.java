package tester;

import java.util.Scanner;
import static utils.IOUtils.restoreProductDetails;

public class TestDeSerialization {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			System.out.println("Product Details restored from bin file : ");
			System.out.println(restoreProductDetails(sc.nextLine()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
