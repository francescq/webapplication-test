package com.francesc.webapplication.model;

import java.util.List;

public class UserForm extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserForm() {
		super();
	}

	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
