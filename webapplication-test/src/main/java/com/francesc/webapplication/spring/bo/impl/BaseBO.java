package com.francesc.webapplication.spring.bo.impl;

import org.apache.commons.logging.Log;

import com.francesc.webapplication.spring.dao.Dao;

public abstract class BaseBO {

	private Dao dao = null;
	private Log log = null;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	} 

}
