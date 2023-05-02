package generic;

public class Test {
	public static void main(String[] args) {
//create Holder class instance to hold : 1234
		Holder<Integer> h1 = new Holder<Integer>(1234);// int ---> Integer : auto boxing
		int data = h1.getRef();// javac : auto un boxing(Integer --> int)
		// create Holder class instance to hold : "hello"
		Holder<String> h2 = new Holder<String>("hello");// javac : NO CONVERSION!
		String s = h2.getRef();
	//	h1 = h2;// javac error : incompatible : Holder<Integer> is incompatible with
				// Holder<String>!!!!!

	}
}
