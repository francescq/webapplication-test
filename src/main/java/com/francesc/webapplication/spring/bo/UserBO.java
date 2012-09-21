package com.francesc.webapplication.spring.bo;

import java.util.List;

import com.francesc.webapplication.model.base.User;

public interface UserBO {
	public void saveUser(User user);

	public void saveOrUpdateUser(User user);

	public void deleteUser(User user);

	public List<User> listUser();

	public User getUser(User u);

}
