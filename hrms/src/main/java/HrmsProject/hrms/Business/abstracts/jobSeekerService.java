package HrmsProject.hrms.Business.abstracts;

import java.util.List;

import HrmsProject.hrms.Core.utility.results.DataResult;
import HrmsProject.hrms.Core.utility.results.Result;
import HrmsProject.hrms.Entity.concretes.JobSeeker;

public interface jobSeekerService {
	Result Add(JobSeeker jobSeeker);
	Result Delete(JobSeeker jobSeeker);
	Result Update(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>>getAll();
	DataResult<JobSeeker>GetById(int id);
}
