package p1;

public class C implements A,B{

	@Override
	public void show() {
		System.out.println(A.DATA+" "+B.DATA);
		
	}

}
