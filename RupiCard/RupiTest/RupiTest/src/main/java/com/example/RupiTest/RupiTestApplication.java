package com.example.RupiTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RupiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RupiTestApplication.class, args);
	}
}
