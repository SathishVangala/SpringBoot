package com.sathish.SpringJobPortal.service;

import com.sathish.SpringJobPortal.model.JobPost;
import com.sathish.SpringJobPortal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;
    // method to add a jobPost
    public void addJobPost(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }

    //method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return repo.getAllJobPost();


    }
}
