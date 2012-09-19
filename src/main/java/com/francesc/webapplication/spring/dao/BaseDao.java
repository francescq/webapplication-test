package com.francesc.webapplication.spring.dao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francesc.webapplication.model.base.BaseEntity;

@Service
public class BaseDao implements Dao {

	@Autowired
	private SessionFactory sessionFactory;

	public BaseDao() {
	}

	@Override
	public void saveOrUpdate(BaseEntity obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(obj);
	}

	@Override
	public void delete(BaseEntity obj) {
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public Object load(BaseEntity clazz) {
		return sessionFactory.getCurrentSession().load(clazz.getClass(),
				clazz.getId());
	}

	@Override
	public Iterator<? extends BaseEntity> findAll(
			Class<? extends BaseEntity> clazz) {
		return (Iterator<? extends BaseEntity>) sessionFactory
				.getCurrentSession().createQuery("from " + clazz.getName())
				.iterate();
	}

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
