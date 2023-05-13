package p2;

public class C implements A, B {
	//If you are inheriting dup def method imple. from multiple i/fs , 
		//javac forces the overriding of the def method in the imple class
	@Override
	public void show() {
		//how to invoke i/f's method ?
		A.super.show();
		B.super.show();
		System.out.println(A.DATA+" "+B.DATA);
	}

	
}
