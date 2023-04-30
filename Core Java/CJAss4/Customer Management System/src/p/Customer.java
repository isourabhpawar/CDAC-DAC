package p;
import java.time.LocalDate;

public class Customer {
	private int custid;
	public static int custidgen=10001;
	private String name;
	private String email;
	private String password;
	private double regstramount;
	private LocalDate dob;
	private Serviceplan srvcplan;
	        
	
	
	public Customer(String name, String email, String password, LocalDate dob,
			Serviceplan srvcplan) {
		super();
		
		this.custid = custidgen++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.srvcplan = srvcplan;
		this.regstramount = srvcplan.getCharge();
		
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getRegstramount() {
		return regstramount;
	}
	public void setRegstramount(double regstramount) {
		this.regstramount = regstramount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Serviceplan getSrvcplan() {
		return srvcplan;
	}
	public void setSrvcplan(Serviceplan srvcplan) {
		this.srvcplan = srvcplan;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", email=" + email + ", srvcplan=" + srvcplan + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
