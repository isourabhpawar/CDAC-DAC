package p2;

public class NetworkPrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Sending  a message " + message 
				+ "to the remote server ");
	}
	public void openConnection()
	{
		System.out.println("opening a connection");
	}
	public void closeConnection()
	{
		System.out.println("closing a connection");
	}

}
