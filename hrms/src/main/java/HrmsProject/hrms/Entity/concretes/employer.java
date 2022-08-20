package HrmsProject.hrms.Entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employer")
public class employer {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="company-name")
	private String companyName;
	
	public employer() {}

	public employer(int id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}

}
