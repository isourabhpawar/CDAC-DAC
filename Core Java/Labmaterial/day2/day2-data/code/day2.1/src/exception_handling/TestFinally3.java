package exception_handling;

public class TestFinally3 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back in main");
		} catch (Exception e) {
			System.out.println("in main's catch-all  " + e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over..");

	}

	private static void testMe() {
		try {
			System.out.println("in meth's try");
			String[] ss = { "aa", "bb" };
			System.out.println(ss[1]);
			boolean flag = true;
			if (flag)
				return;
			System.out.println("end of try");
		} finally {
			System.out.println("in meth's finally");
		}
		System.out.println("meth end");
	}

}
