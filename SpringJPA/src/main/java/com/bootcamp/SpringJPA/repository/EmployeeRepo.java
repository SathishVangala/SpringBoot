package com.bootcamp.SpringJPA.repository;

import com.bootcamp.SpringJPA.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employe, Integer> {

    @Query("select s from Employe s where s.empName=?1")
    List<Employe> findByName(String name);
}
