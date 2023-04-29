package p2;

public class ConsolePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Printing a message " + message 
				+ " on the console , speed " + SPEED);
	}

}
