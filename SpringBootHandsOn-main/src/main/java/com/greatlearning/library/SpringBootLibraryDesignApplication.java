package com.greatlearning.library;

import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
    	System.out.println("Hi Spring Boot");
	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("Java");
		gl.setCourseType("Programming Language");
		gl.setCourseTutor("JK");
		System.out.println("Course details:"+gl.toString());
//		GreatLearning gl2= new GreatLearning("Backend","Lombok Testing","JK");
//		System.out.println("Course details:"+gl2.toString());
		GreatLearning gl3 = GreatLearning.builder().courseName("Lombok Builder").courseType("Telescopic Constructor")
				.courseTutor("JK").build();
		System.out.println("Course details:"+gl3.toString());
		GreatLearning gl2 = GreatLearning.builder().courseName("Complex Objects").courseType("Lombok")
				.courseTutor("JK")
				.fullName(FullName.builder().firstName("JayaKrishna").lastName("Malleboyena").build())
				.build();
//		System.out.println("Course details:"+gl2.toString());
        log.info("Course Details of gl2 ->{}",gl2);
	}

}
