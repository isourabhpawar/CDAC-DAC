package pojos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // mandatory anno to tell hibernate , following is common super class ,
					// containing common fields , with no table associated with it !
public class BaseEntity {
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generation of ids : auto_increment
	private Long id;

	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
