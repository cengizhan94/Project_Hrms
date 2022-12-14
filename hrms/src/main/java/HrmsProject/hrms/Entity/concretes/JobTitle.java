package HrmsProject.hrms.Entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_titles")
@Data
public class JobTitle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_title")
	private String jobTitle;
	
	public JobTitle() {}

	public JobTitle(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
	}
	

}
