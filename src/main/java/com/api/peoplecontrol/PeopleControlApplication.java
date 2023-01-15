package com.api.peoplecontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PeopleControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleControlApplication.class, args);
	}
}
