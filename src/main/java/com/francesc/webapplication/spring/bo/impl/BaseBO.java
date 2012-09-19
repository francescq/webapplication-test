package com.francesc.webapplication.spring.bo.impl;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.francesc.webapplication.spring.dao.Dao;

@Service
@Repository
public abstract class BaseBO {

	@Autowired
	private Dao dao;

	@Autowired
	private Log log;

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
