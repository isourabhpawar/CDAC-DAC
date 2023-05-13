package p2;

public interface B {
	//public static final
	int DATA = 200;
//public
	default void show()
	{
		System.out.println("B's show");
	}
}
