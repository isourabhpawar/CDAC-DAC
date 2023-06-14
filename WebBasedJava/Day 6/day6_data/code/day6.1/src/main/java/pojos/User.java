package pojos;

public class User {
	private String email;
	private String password;
	private String fullName;
	private int age;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String email, String password, String fullName, int age) {
		super();
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", fullName=" + fullName + ", age=" + age + "]";
	}
	
}
