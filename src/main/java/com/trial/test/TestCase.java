package com.trial.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trial.bean.Manager;
import com.trial.daoimpl.Method;

public class TestCase {
	 ApplicationContext ctx;

	@Before
	public  void before() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}


	@Test
	public void test() {
		Method method = (Method) ctx.getBean("method");
	/*	Manager manager = new Manager();
		manager.setUsername("yangyi");
		manager.setPassword("123456");*/
		boolean b = method.manager_login("yangyi", "trial");
		System.out.println(b);
	}

}
