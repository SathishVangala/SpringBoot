package com.telusklo.SpringJDBCExc;

import com.telusklo.SpringJDBCExc.model.Student;
import com.telusklo.SpringJDBCExc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExcApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExcApplication.class, args);
		Student st = context.getBean(Student.class);

		StudentService sc= context.getBean(StudentService.class);
		st.setId(104);
		st.setName("Deva");
		st.setMarks(88);
		sc.addStudent(st);
		List<Student> students =sc.getStudents();
		System.out.println(students);


	}

}
