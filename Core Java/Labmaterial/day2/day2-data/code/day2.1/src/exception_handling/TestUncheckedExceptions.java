package exception_handling;

public class TestUncheckedExceptions {

	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 2;
			System.out.println("Result = " + (a / b));// throw new AE("/ by 0")
			int[] data = { 1, 2, 3, 4 };
			System.out.println(data[0]);// AOBExc
			System.out.println("parsed int value " + Integer.parseInt("a1234"));// NumberFormatExc
			String s = null;
			System.out.println("char at index 0 " + s.charAt(0));// NPE
			System.out.println("end of try....");
		}
//		} catch (ArithmeticException| NumberFormatException e) {
//			System.out.println(1);
//		}
//		catch (NullPointerException e) {
//			System.out.println(2);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(3);
//		}
		catch (Exception e) {
			System.out.println("in catch-all");
			System.out.println("err mesg "+e.getMessage());
			System.out.println("err mesg + name "+e);
			System.out.println("complete details");
			e.printStackTrace();
		}
		System.out.println("main continues....");

	}

}
