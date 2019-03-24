package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.User;

@SpringBootApplication
public class BuilderPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternApplication.class, args);
		
		User student = User.builder()
                .name("tom")
                .contact("010123456789")
                .grade(3)
                .studentBuild();
        User teacher = User.builder()
                .name("justin")
                .contact("010987654321")
                .subject("math")
                .teacherBuild();
        
        System.out.println(student.toString());
        System.out.println(teacher.toString());
	}

}
