package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckerTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResources {

	public static void main(String[] args) throws InterruptedException{
		//create single joint acct
		JointAccount acct=new JointAccount(10000);
		//create tasks --attach thrds --strt them
		//Thread(Runnable instance,String nm)
		Thread t1=new Thread(new UpdaterTask(acct),"customer1");
		Thread t2=new Thread(new CheckerTask(acct),"customer2");
		t1.start();
		t2.start();
		System.out.println("waiting for child thrds....");
		t1.join();
		t2.join();
		System.out.println("main over...");

	}

}
