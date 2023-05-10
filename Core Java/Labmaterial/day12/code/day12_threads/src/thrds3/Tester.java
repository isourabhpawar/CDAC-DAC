package thrds3;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd details "+ Thread.currentThread());// Thread [main,5,main]
		//create runnable task instance
		MyRunableTask task=new MyRunableTask();
//		Thread t0=new Thread();
//		t0.start();
		// create child thrds
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");//How many runnable thrds ? 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();// RUNNABLE : 1(parent)+4(child)
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
			sleep(200);
		}
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		t1.join();//main blocked on join , waiting for t1 to finish!
		t2.join();//main blocked on join , waiting for t2 to finish!
		t3.join();//main blocked on join , waiting for t3 to finish!
		t4.join();//main blocked on join , waiting for t4 to finish!
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over......");
	}

}
