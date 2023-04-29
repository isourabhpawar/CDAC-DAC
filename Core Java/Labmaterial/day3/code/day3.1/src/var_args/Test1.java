package var_args;

public class Test1 {

	public static void main(String... args) {
		for(String s : args)
			System.out.println(s);
		System.out.println("------------------------");
		show();
		System.out.println("------------------------");
		show(new int[] {10,20,40});
		System.out.println("------------------------");
		show(11,21,32);

	}
	
	static void show(int...data)
	{
		for(int i : data)
			System.out.println(i);
	}

}

