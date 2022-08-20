package HrmsProject.hrms.Entity.concretes;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="employee")
@Entity
public class employee {
	private int id;
	private String firstName;
	private String lastName;
	
	public employee() {}
	
	public employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
