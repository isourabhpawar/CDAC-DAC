package non_generic;

public class Test {
	public static void main(String[] args) {
//create Holder class instance to hold : 1234
		 Holder h1=new Holder(1234);//int --> Integer(auto boxing) ---> upcasting
		 System.out.println(h1.getClass());//non_generic.Holder
		 System.out.println(h1.getRef().getClass());//java.lang.Integer
		 int data=(Integer)h1.getRef();//prog : downcasting ,javac : auto un boxin
		//create another Holder class instance to hold : "hello"
		 Holder h2=new Holder("hello");//up casting : javac
		 System.out.println(h2.getClass());//non_generic.Holder
		 System.out.println(h2.getRef().getClass());//java.lang.String
		 String s=(String) h2.getRef();
		 h1=h2;
		 //un comment next line to observe : ClassCastExc
		// data=(Integer)h1.getRef();//run time err : ClassCastExc
		 
	}
}
