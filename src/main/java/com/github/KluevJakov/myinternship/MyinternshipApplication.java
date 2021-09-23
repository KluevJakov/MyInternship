package com.github.KluevJakov.myinternship;

import com.github.KluevJakov.myinternship.tasks.DatatypesTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyinternshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyinternshipApplication.class, args);
		DatatypesTask dt = new DatatypesTask();
		dt.startTask();
	}

}
