package com.example.learnJPAandHibernet.JDBCCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseJDBCCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJDBCRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.insert(new Course(1, "farhanulla", "tasmiya"));
		repository.insert(new Course(2, "farhanulla", "tasmiya"));
		repository.insert(new Course(3, "farhanulla", "tasmiya"));
		
		repository.DeleteById(1);
	}

}
