package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootProjectWithJenkinIntegrationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Test case executing=========");
		assertEquals(true,true);
	}

}
