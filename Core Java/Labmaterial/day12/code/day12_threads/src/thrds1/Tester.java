package thrds1;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd details "+ Thread.currentThread());// Thread [main,5,main]
		// create child thrds
		MyThread t1 = new MyThread("one");
		MyThread t2 = new MyThread("two");
		MyThread t3 = new MyThread("three");
		MyThread t4 = new MyThread("four");
		t1.start();
		t2.start();
		t3.start();
		t4.start();// RUNNABLE : 1(parent)+4(child)
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			sleep(1000);
		}
		System.out.println("main over......");

	}

}
