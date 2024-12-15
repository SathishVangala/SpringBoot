package com.jobdesign.JobPortalExc;

import com.jobdesign.JobPortalExc.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
   @Autowired
   private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }
    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }

 @RequestMapping("handleForm")
    public String handleForm(JobPost jobPost, Model model){
        model.addAttribute("jobPost",jobPost);
        service.addJobs(jobPost);
        return "success";

 }

    @GetMapping("/viewalljobs")

    public String viewJobs(Model model) {

        List<JobPost> jobPosts = service.getAllJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}
