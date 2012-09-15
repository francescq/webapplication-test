package com.francesc.webapplication.spring.bo.impl;

import java.util.List;

import com.francesc.webapplication.model.User;
import com.francesc.webapplication.spring.bo.UserBO;

public class UserImpl extends BaseBO implements UserBO{

	@Override
	public void saveUser(User user) {
		getDao().saveOrUpdate(user);	
	}

	@Override
	public List<User> listUser() {
		List<User> userList = getDao().findAll(User.class);
		return userList;
	}

	@Override
	public void saveOrUpdateUser(User user) {
		getDao().saveOrUpdate(user);	
		
	}

	@Override
	public void deleteUser(User user) {
		getDao().delete(user);	
	}
}
