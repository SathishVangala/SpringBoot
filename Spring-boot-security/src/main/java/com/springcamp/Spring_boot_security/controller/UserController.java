package com.springcamp.Spring_boot_security.controller;

import com.springcamp.Spring_boot_security.model.Student;
import com.springcamp.Spring_boot_security.model.User;
import com.springcamp.Spring_boot_security.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostMapping("register")
    public User register(@RequestBody User user){
        return service.saveUser(user);
    }

    @RestController
    public static class Controller {
        @GetMapping("/")
        public String greet(HttpServletRequest request){
            return "<h1>Hello world</h1> "+request.getSession().getId();
        }
        @GetMapping("about")
        public String about(HttpServletRequest request){
            return "This is Spring security topic "+request.getSession().getId();
        }

    }

    @RestController
    public static class StudentController {

        List<Student> students=new ArrayList<>(List.of(
                new Student(1,"Sathish","Java"),
                new Student(2,"Goutham","Blockchain")
        ));

        @GetMapping("csrf-token")
        public CsrfToken getCsrf(HttpServletRequest request){
            return (CsrfToken) request.getAttribute("_csrf");
        }

        @GetMapping("students")
        public List<Student> getStudents(){
            return students;
        }
        @PostMapping("students")
        public void addStudent(@RequestBody Student student) {
            students.add(student);
        }
    }
}
