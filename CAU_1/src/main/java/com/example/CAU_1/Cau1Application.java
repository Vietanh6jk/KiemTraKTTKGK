package com.example.CAU_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Cau1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cau1Application.class, args);
	}

}
