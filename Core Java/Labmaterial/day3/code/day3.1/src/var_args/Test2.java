package var_args;

public class Test2 {

	public static void main(String[] args) {
		showAnimals();
		System.out.println("------------------------");
		showAnimals(new Dog("Pluto"),new Cat("Mojo"));

	}
	static void showAnimals(Animal...animals)
	{
		for(Animal a : animals)
			System.out.println(a.getName());
	}

}
