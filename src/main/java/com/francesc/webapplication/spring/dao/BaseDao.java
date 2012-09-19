package com.francesc.webapplication.spring.dao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseDao implements Dao {

	@Autowired
	private SessionFactory sessionFactory;

	public BaseDao() {
	}

	@Override
	public void saveOrUpdate(Object obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@Override
	public void delete(Object obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public Object load(Class clazz, Long id) {
		return sessionFactory.getCurrentSession().load(clazz, id);
	}

	@Override
	public Iterator findAll(Class clazz) {
		return sessionFactory.getCurrentSession()
				.createQuery("from " + clazz.getName()).iterate();
	}

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
