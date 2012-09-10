package com.francesc.webapplication.spring.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class BaseDao  extends HibernateDaoSupport{

    public BaseDao() { }

    public void saveOrUpdate(Object obj) {
        getHibernateTemplate().saveOrUpdate(obj);
    }

    public void delete(Object obj) {
        getHibernateTemplate().delete(obj);
    }

    public Object find(Class clazz, Long id) {
        return getHibernateTemplate().load(clazz, id);
    }

    public List findAll(Class clazz) {
        return getHibernateTemplate().find("from " + clazz.getName());
    }
}
