package p2;

public interface A {
	//public static final
	int DATA = 100;
//public
	default void show()
	{
		System.out.println("A's show");
	}
}
