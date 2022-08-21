package HrmsProject.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.hrms.Entity.concretes.JobTitle;

public interface jobTitleDao extends JpaRepository<JobTitle, Integer> {

}
