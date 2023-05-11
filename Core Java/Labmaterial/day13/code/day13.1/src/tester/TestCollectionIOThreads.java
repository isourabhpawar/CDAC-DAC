package tester;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;

import runnable_tasks.DateSorterTask;
import runnable_tasks.PriceSorterTask;

import static utils.ShopUtils.*;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get data from shop utils
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Enter file names to store products sorted as per date n price");
			// create task --attach to thrd --strt thrd
			Thread t1 = new Thread(new DateSorterTask(sc.next(), productMap), "date_sorter");
			Thread t2 = new Thread(new PriceSorterTask(sc.next(), productMap), "price_sorter");
			t1.start();
			t2.start();
			System.out.println("waiting for child thrds to complete exec");
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
