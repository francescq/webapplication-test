package com.francesc.webapplication.spring.controller.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.francesc.webapplication.controller.HelloController;

public class HelloControllerTest {

	@Test
	public void testHandleRequestView() {
		try {
			HelloController controller = new HelloController();
			ModelAndView modelAndView;
			// modelAndView = controller.list(null, null);

		} catch (Exception e) {

			fail(e.getMessage());
		}
	}
}