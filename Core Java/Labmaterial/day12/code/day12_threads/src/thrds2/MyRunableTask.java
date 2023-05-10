package thrds2;
//implement Runnable i/f
public class MyRunableTask implements Runnable{

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" strted");
		//exec logic : for loop
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" exec # "+i);
				Thread.sleep(500);
			}
		}catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got exc "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
	}

}
