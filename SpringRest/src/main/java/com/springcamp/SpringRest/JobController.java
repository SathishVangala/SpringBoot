package com.springcamp.SpringRest;

import com.springcamp.SpringRest.model.JobPost;
import com.springcamp.SpringRest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService service;
    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){

        return service.returnAllJobPosts();
    }
    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId){
        return  service.getJob(postId);
    }
    @PostMapping("jobPost")
    public JobPost jobPost(@RequestBody JobPost jobPost){
        service.addJobPost(jobPost);
        return jobPost;
    }
    @PutMapping("jobPost")
    public JobPost updatePost(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return jobPost;
    }
    @DeleteMapping("jobPost/{postId}")
    public void deletePost(@PathVariable int postId){
        service.deletePost(postId);
        //return "Deleted";
    }
}
