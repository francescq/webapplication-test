package com.francesc.webapplication.controller;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.francesc.webapplication.model.base.User;
import com.francesc.webapplication.spring.bo.UserBO;

@Controller
public class HelloController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	UserBO userBO;

	@Autowired
	Comparator<String> comparator;

	@RequestMapping(value = "/hello")
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "hello";
	}

	@RequestMapping(value = "/initUser")
	public String addUser(@ModelAttribute("user") User user,
			BindingResult result, Model model) {
		user = new User();
		user.setName("Francesc");
		model.addAttribute("user", user);
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String testUser(@ModelAttribute("user") User user,
			BindingResult result, Model model) {
		logger.info("USer arribat: " + user);
		userBO.saveOrUpdateUser(user);
		List<User> userList = userBO.listUser();
		model.addAttribute("userList", userList);

		for (User u : userList) {
			logger.info("Users: " + u);
		}
		return "addUser";
	}

	@RequestMapping(value = "/compare", method = RequestMethod.GET)
	public String compare(@RequestParam("input1") String input1,
			@RequestParam("input2") String input2, Model model) {

		int result = comparator.compare(input1, input2);
		String inEnglish = (result < 0) ? "less than"
				: (result > 0 ? "greater than" : "equal to");

		String output = "According to our Comparator, '" + input1 + "' is "
				+ inEnglish + "'" + input2 + "'";

		model.addAttribute("output", output);
		model.addAttribute("today", new Date());
		return "compareResult";
	}
}