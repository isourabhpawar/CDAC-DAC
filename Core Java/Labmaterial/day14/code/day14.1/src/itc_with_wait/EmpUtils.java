package itc_with_wait;

public class EmpUtils {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());// producer
		while (dataReady)
			this.wait();//p : Blocked on wait : outside the monitor
		//dataReady : false
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());// producer
		dataReady=true;
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while(!dataReady)
			this.wait();
		//dataReady : true
		// consume data
		System.out.println("Read  Data " + e);
		
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		return e;
	}

}
