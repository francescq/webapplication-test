package com.francesc.webapplication.spring.bo.impl;

import com.francesc.webapplication.model.User;
import com.francesc.webapplication.spring.bo.UserBO;

public class UserImpl extends BaseBO implements UserBO{

	@Override
	public void saveUser(User user) {
		getDao().saveOrUpdate(user);	
	}

	

}
