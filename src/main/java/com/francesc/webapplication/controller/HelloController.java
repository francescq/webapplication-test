package com.francesc.webapplication.controller;

import java.util.Comparator;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.francesc.webapplication.model.User;
import com.francesc.webapplication.model.UserForm;
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
	public String initUser(@ModelAttribute("user") User user,
			BindingResult result, Model model) {
		user = new User();
		user.setName("Francesc");
		model.addAttribute("user", user);
		return "addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public ModelAndView addUser(@Valid User user, BindingResult result,
			Model model) {
		ModelAndView m = new ModelAndView("addUser", "User", user);
		if (result.hasErrors()) {
			return m;
		}
		logger.info("User arribat: " + user);
		userBO.saveOrUpdateUser(user);

		List<User> userList = userBO.listUser();
		UserForm userForm = new UserForm();
		userForm.setUserList(userList);

		for (User u : userList) {
			logger.info("Users: " + u);
		}
		return new ModelAndView("addUser", "userForm", userForm);
	}
}