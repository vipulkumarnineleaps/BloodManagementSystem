package com.examplegroup7.BloodManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BloodManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodManagementSystemApplication.class, args);
	}

}
