package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertSame;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JustGifItApplicationTests {

//	@Test
//	public void contextLoads() {
//	}

	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertSame(result,"Welcome to the Spring Boot Session");
	}
}
