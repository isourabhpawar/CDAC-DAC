package user_thrds;

public class RunnableTask implements Runnable {


	@Override
	public void run() {
		// thrd name strted
		System.out.println(Thread.currentThread().getName() + " strted ");
		try {
			// B.L : dummy for loop
			for (int i = 0; i < 10; i++) {
				if (Thread.currentThread().getName().equals("two")) {
					System.out.println("Enter data");
					int data = System.in.read();
				}
				System.out.println(Thread.currentThread().getName() + " exec # " + i);
				Thread.sleep(500);
			}

		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over ");
	}
}
