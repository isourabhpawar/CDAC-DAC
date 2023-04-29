
public class Employee {

}
class Manager extends Employee implements IPrintable
{

	@Override
	public void print() {
		System.out.println("Print method in Manager Class");
		
	}
	
}