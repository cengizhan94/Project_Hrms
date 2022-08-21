package HrmsProject.hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HrmsProject.hrms.Business.abstracts.jobTitleService;
import HrmsProject.hrms.Core.utility.results.DataResult;
import HrmsProject.hrms.Core.utility.results.Result;
import HrmsProject.hrms.Core.utility.results.SuccessDataResult;
import HrmsProject.hrms.Core.utility.results.SuccessResult;
import HrmsProject.hrms.DataAccess.abstracts.jobTitleDao;
import HrmsProject.hrms.Entity.concretes.JobTitle;

@Service
public class jobTitleManager implements jobTitleService{

	jobTitleDao _jobTitlesDao;
	
	@Autowired
	public jobTitleManager(jobTitleDao _jobTitlesDao) {
		super();
		this._jobTitlesDao = _jobTitlesDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(_jobTitlesDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this._jobTitlesDao.save(jobTitle);
		return new SuccessResult("job added.");
	}

}
