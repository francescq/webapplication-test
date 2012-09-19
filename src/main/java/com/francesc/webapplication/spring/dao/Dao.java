package com.francesc.webapplication.spring.dao;

import java.util.Iterator;

import org.hibernate.Session;

public interface Dao {
	public void saveOrUpdate(Object obj);

	public void delete(Object obj);

	public Object load(Class clazz, Long id);

	public Iterator findAll(Class clazz);

	public Session getCurrentSession();

}
