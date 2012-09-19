package com.francesc.webapplication.spring.bo;

import java.util.Iterator;

import com.francesc.webapplication.model.User;

public interface UserBO {
	public void saveUser(User user);

	public void saveOrUpdateUser(User user);

	public void deleteUser(User user);

	public Iterator<User> listUser();

	public User getUser(User u);

}
