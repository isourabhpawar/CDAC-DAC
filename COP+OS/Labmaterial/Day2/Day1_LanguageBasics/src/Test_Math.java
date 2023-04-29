
public class Test_Math {
	public static void main(String[] args) {

		int a = 1;
		while (a <= 10) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}

			a++;
		}
		System.out.println();
		System.out.println(" a=" + a);//

		do {
			System.out.print(a + " ");

			a++;
		} while (a <= 10);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				// continue;
				System.out.println(i);

		}

	}
}

