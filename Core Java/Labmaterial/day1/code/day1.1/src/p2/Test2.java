package p2;

public class Test2 {

	public static void main(String[] args) {
		Printer[] printers = { new FilePrinter(), new ConsolePrinter(), new NetworkPrinter() };// [Lp2.Printer; Printer
																								// , CP,FP,NP
		System.out.println(printers.getClass());// [Lp2.Printer;
		// how will u print a mesg : Some Mesg on these printers?
		for (Printer p : printers) {
			if (p instanceof FilePrinter) {
				((FilePrinter) p).openFile();
				p.print("some mesg");
				((FilePrinter) p).closeFile();
			} else if (p instanceof NetworkPrinter) {
				((NetworkPrinter) p).openConnection();
				p.print("mesg1235");
				((NetworkPrinter) p).closeConnection();

			} else
				p.print("some mesg"); // run time poly
		}

	}

}
