package com.example.demo;

import com.example.demo.student.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
// makes class restful, serve rest endpoints
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	need out something from server - getmasspping
	@GetMapping
	public List<student> hello(){
		return List.of(
				new student(
						1L,
						"mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY,5),
						21
				)
		);
	}

}
