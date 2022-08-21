package HrmsProject.hrms.API.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HrmsProject.hrms.Business.abstracts.jobTitleService;
import HrmsProject.hrms.Core.utility.results.DataResult;
import HrmsProject.hrms.Core.utility.results.Result;
import HrmsProject.hrms.Entity.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class jobTitlesController {
	private jobTitleService _jobTitleService;

	@Autowired
	public jobTitlesController(jobTitleService _jobTitleService) {
		super();
		this._jobTitleService = _jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return this._jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(JobTitle jobTitle) {
		return this._jobTitleService.add(jobTitle);
	}
}
