package com.jobdesign.JobPortalExc;

import com.jobdesign.JobPortalExc.model.JobPost;
import com.jobdesign.JobPortalExc.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJobs(JobPost jobpost){
        repo.addJobPost(jobpost);
    }

    public List<JobPost> getAllJobs(){
         return repo.getAllJobPost();
    }
}
