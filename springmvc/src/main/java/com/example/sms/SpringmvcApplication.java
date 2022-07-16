package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Abhay", "Lad", "18bmiit119@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2 = new Student("Zeel", "Patel", "zp123@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student("Shrey", "Patel", "sp123@gmail.com");
//		studentRepository.save(s3);
	}

}
