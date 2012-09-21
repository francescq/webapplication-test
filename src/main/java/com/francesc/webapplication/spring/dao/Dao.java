package com.francesc.webapplication.spring.dao;

import java.util.List;

import org.hibernate.Session;

import com.francesc.webapplication.model.base.BaseEntity;

public interface Dao {
	public void saveOrUpdate(BaseEntity obj);

	public void delete(BaseEntity obj);

	public Object load(BaseEntity clazz);

	public List<? extends BaseEntity> findAll(Class<? extends BaseEntity> clazz);

	public Session getCurrentSession();

}
