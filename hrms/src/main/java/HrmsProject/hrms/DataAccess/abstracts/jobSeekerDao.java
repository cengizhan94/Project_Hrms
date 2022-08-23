package HrmsProject.hrms.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HrmsProject.hrms.Entity.concretes.JobSeeker;

public interface jobSeekerDao extends JpaRepository<JobSeeker, Integer>{

}
