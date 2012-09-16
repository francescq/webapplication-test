package com.francesc.webapplication.spring.bo.impl;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francesc.webapplication.spring.dao.Dao;

@Service
public abstract class BaseBO {

	@Autowired
	private Dao dao;

	@Autowired
	private Log log;

	protected Dao getDao() {
		return dao;
	}

	protected Log getLog() {
		return log;
	}

}
