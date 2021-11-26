package com.HRMS.hrms.bussiness.concretes;

import com.HRMS.hrms.bussiness.abstracts.JobTitleService;
import com.HRMS.hrms.dataAccess.abstracts.JobTitleDao;
import com.HRMS.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return this.jobTitleDao.findAll();
    }

}
