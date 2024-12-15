package com.bootcamp.SpringJPA;

import com.bootcamp.SpringJPA.model.Employe;
import com.bootcamp.SpringJPA.repository.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		Employe emp1 = context.getBean(Employe.class);
		Employe emp2 = context.getBean(Employe.class);
		Employe emp3 = context.getBean(Employe.class);
		Employe emp4 = context.getBean(Employe.class);

		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
//
//		emp1.setEmpID(101);
//		emp1.setEmpAge(25);
//		emp1.setEmpName("Sathish");
//		emp1.setEmpDepartment("Automation");
//
//		emp2.setEmpID(102);
//		emp2.setEmpAge(27);
//		emp2.setEmpName("Abhijit");
//		emp2.setEmpDepartment("Automation Walgreen");
//
//		emp3.setEmpID(103);
//		emp3.setEmpAge(23);
//		emp3.setEmpName("Vyshnavi");
//		emp3.setEmpDepartment("Humana");

		emp4.setEmpID(104);
		emp4.setEmpName("Ayo Suduke");
		emp4.setEmpAge(56);
		emp4.setEmpDepartment("BigPanda");

//		repo.save(emp1);
//		repo.save(emp2);
//		repo.save(emp3);
		repo.delete(emp4);


		//System.out.println(Arrays.toString((repo.findByName("Sathish"))));
		//System.out.println(repo.findByName("Sathish"));
		System.out.println("Server up");

	}

}
