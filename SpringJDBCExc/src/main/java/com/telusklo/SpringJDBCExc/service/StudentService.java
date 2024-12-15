package com.telusklo.SpringJDBCExc.service;

import com.telusklo.SpringJDBCExc.model.Student;
import com.telusklo.SpringJDBCExc.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
     private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s){
        repo.save(s);
        System.out.println("Added");
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
