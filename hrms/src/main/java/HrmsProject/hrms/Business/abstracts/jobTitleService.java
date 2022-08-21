package HrmsProject.hrms.Business.abstracts;

import java.util.List;

import HrmsProject.hrms.Core.utility.results.DataResult;
import HrmsProject.hrms.Core.utility.results.Result;
import HrmsProject.hrms.Entity.concretes.JobTitle;

public interface jobTitleService {
	
	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
}
