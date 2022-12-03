package com.startech.jenkins_demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		LOGGER.info("Application started.....");
	}

	public static void main(String[] args) {
		LOGGER.info("Application executed.....");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
