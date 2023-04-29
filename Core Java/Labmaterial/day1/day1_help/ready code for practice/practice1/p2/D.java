package p2;
import p1.A;
class D extends A
{
D()
   {
	   //super();added implicitly by javac
      System.out.println("D's state "+i+" "+j+" "+k+" "+l);
   }
}