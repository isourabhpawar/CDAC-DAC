package pojos;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address extends BaseEntity {
	@Column(name="adr_line1",length = 50)
	private String adrLine1;
	@Column(name="adr_line2",length = 50)
	private String adrLine2;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String country;
	@Column(length = 20,name="zip_code")
	private String zipCode;
	//one to one uni dir association between Address 1----->1 Emp
	@OneToOne(fetch = FetchType.LAZY)
	//by def fetch=EAGER
	@MapsId //for shared PK approach
	@JoinColumn(name="emp_id")
	private Employee owner;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String adrLine1, String adrLine2, String city, String state, String country, String zipCode) {
		super();
		this.adrLine1 = adrLine1;
		this.adrLine2 = adrLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getAdrLine1() {
		return adrLine1;
	}
	public void setAdrLine1(String adrLine1) {
		this.adrLine1 = adrLine1;
	}
	public String getAdrLine2() {
		return adrLine2;
	}
	public void setAdrLine2(String adrLine2) {
		this.adrLine2 = adrLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Employee getOwner() {
		return owner;
	}
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Address [adrLine1=" + adrLine1 + ", adrLine2=" + adrLine2 + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	
	
}
