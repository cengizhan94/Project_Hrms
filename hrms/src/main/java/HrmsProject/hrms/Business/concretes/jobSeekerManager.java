package HrmsProject.hrms.Business.concretes;

import java.util.List;

import HrmsProject.hrms.Business.abstracts.jobSeekerService;
import HrmsProject.hrms.Core.utility.results.DataResult;
import HrmsProject.hrms.Core.utility.results.Result;
import HrmsProject.hrms.Core.utility.results.SuccessDataResult;
import HrmsProject.hrms.Core.utility.results.SuccessResult;
import HrmsProject.hrms.DataAccess.abstracts.jobSeekerDao;
import HrmsProject.hrms.Entity.concretes.JobSeeker;

public class jobSeekerManager implements jobSeekerService{

	jobSeekerDao _jobSeekerDao;
	
	public jobSeekerManager(jobSeekerDao _jobSeekerDao) {
		super();
		this._jobSeekerDao = _jobSeekerDao;
	}

	@Override
	public Result Add(JobSeeker jobSeeker) {
		this._jobSeekerDao.save(jobSeeker);
		return new SuccessResult("iş arayan bilgileri eklendi");
	}

	@Override
	public Result Delete(JobSeeker jobSeeker) {
		this._jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("iş arayan bilgileri silindi");
	}

	@Override
	public Result Update(JobSeeker jobSeeker) {
		this._jobSeekerDao.save(jobSeeker);
		return new SuccessResult("iş arayan bilgileri güncellendi");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		this._jobSeekerDao.findAll();
		return new SuccessDataResult<List<JobSeeker>>();
	}

	@Override
	public DataResult<JobSeeker> GetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
