package com.francesc.webapplication.spring.bo.impl;

import com.francesc.webapplication.spring.dao.Dao;

public abstract class BaseBO {

	private Dao dao = null;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	} 

}
