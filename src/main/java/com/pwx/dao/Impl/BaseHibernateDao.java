package com.pwx.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @描述
 * @创建人 pengweixiang
 * @创建时间 2018/12/2 13:45
 */
@Component
public class BaseHibernateDao
{
    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }
}
