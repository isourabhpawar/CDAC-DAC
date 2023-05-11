package runnable_tasks;

import com.app.core.JointAccount;

public class CheckerTask implements Runnable {
	private JointAccount jointAccount;

	public CheckerTask(JointAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
		System.out.println("invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				double balance = jointAccount.checkBalance();
				if(balance != 10000)
				{
					System.out.println("ERROR!!!!!!!!!!!!!!!!!!!");
					System.exit(-1);
				}
				Thread.sleep(445);// to simulate practical delays + forcing ctx switching => rigorous testing
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
