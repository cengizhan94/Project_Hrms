package HrmsProject.hrms.Entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="job_seeker")
@Entity
public class jobSeeker {
	@GeneratedValue
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first-name")
	private String firstName;
	
	@Column(name="last-name")
	private String lastName;
	
	@Column(name="national-identity")
	private String nationalIdentity;
	
	public jobSeeker() {}
	
	public jobSeeker(int id, String firstName, String lastName, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}
	

}
