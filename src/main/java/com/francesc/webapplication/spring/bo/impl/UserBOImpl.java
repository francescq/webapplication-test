package com.francesc.webapplication.spring.bo.impl;

import java.util.Iterator;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.francesc.webapplication.model.User;
import com.francesc.webapplication.spring.bo.UserBO;

@Service
public class UserBOImpl extends BaseBO implements UserBO {

	@Override
	@Transactional(readOnly = false)
	public void saveUser(User user) {
		getDao().saveOrUpdate(user);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterator<User> listUser() {
		Iterator<User> userList = (Iterator<User>) getDao().findAll(User.class);
		return userList;
	}

	@Override
	@Transactional(readOnly = true)
	public User getUser(User u) {
		u = (User) getDao().load(User.class, u.getId());
		return u;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveOrUpdateUser(User user) {
		getDao().saveOrUpdate(user);

	}

	@Override
	@Transactional(readOnly = false)
	public void deleteUser(User user) {
		getDao().delete(user);
	}
}
