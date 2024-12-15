package com.springcamp.SpringRest.service;


import com.springcamp.SpringRest.model.JobPost;
import com.springcamp.SpringRest.repo.JobRepo;
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

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public String updateJob(JobPost jobPost) {
         repo.updateJob(jobPost);
         return "Success";
    }

    public void deletePost(int postId) {
        repo.deletePost(postId);

    }
}
