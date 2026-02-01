package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootProjectWithJenkinIntegrationApplication {
	
	@PostConstruct
	public void init() {
		System.out.println("Application started=======");
		System.out.println("Application stared 2========");
		System.out.println("Application stared 3========");
	}

	public static void main(String[] args) {
		System.out.println("Application started in amin function=======");
		SpringApplication.run(SpringBootProjectWithJenkinIntegrationApplication.class, args);
	}

}
