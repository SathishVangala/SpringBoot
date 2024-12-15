package com.jobdesign.JobPortalExc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;
}
