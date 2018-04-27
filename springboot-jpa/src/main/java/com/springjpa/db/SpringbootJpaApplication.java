package com.springjpa.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springjpa*")
@EnableJpaRepositories(basePackages = "com.springjpa.db.repository")
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
}
