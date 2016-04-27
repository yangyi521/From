package com.trial.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.trial.bean.Manager;

public class Svaetest {
	Configuration configuration=null;
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	@SuppressWarnings("deprecation")
	@Before
	public void before(){
		 configuration = new Configuration().configure();//初始化hibernate的配置文件
		 sessionFactory = configuration.buildSessionFactory();//创建sessionFactory
		 session = sessionFactory.openSession();//创建Session
		 transaction = session.beginTransaction();//开启事务
		
	}
	@Test
	public void test() {
	Manager manager = new Manager();
	manager.setUsername("yangyi");
	manager.setPassword("trial");
	session.save(manager);
	}
	@After
	public void after(){
		transaction.commit();
		session.close();
	}

}
