package com.startech.jenkins_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsDemoApplicationTests {

	private static final Logger LOGGER =LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Test case executing...");
		LOGGER.info("Test case executing...second log statement");
		assertEquals(true, true);
	}

}
