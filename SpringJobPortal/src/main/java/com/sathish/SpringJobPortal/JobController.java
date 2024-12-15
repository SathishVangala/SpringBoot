package com.sathish.SpringJobPortal;

import com.sathish.SpringJobPortal.model.JobPost;
import com.sathish.SpringJobPortal.repo.JobRepo;
import org.springframework.ui.Model;
import com.sathish.SpringJobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleAddJobForm(JobPost jobPost,Model model) {
        model.addAttribute("jobPost", jobPost);
        service.addJobPost(jobPost);
        //System.out.println(jobPost);
        return "success";

    }
    @GetMapping("/viewalljobs")

    public String viewJobs(Model model) {

        List<JobPost> jobPosts = service.returnAllJobPosts();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }


}
