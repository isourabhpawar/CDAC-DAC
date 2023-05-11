package runnable_tasks;

import com.app.core.JointAccount;

public class UpdaterTask implements Runnable {
	private JointAccount jointAccount;

	public UpdaterTask(JointAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
		System.out.println("invoked by " + Thread.currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				synchronized (jointAccount) {
					jointAccount.updateBalance(5000);
				}
				Thread.sleep(345);// to simulate practical delays + forcing ctx switching => rigorous testing
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got err " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}
