package com.springjpa.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springjpa.config.AppConfig;

@SpringBootApplication
@ComponentScan("com.springjpa*")
@EnableJpaRepositories(basePackages = "com.springjpa.db.repository")
@EnableConfigurationProperties(AppConfig.class)
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}
}
