package com.trial.daoimpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;

import com.trial.bean.Computerstate;
import com.trial.bean.Computerstate1;
import com.trial.bean.ConcreteComputer;
import com.trial.bean.Dev_allocation;
import com.trial.bean.Manager;
@Transactional
public class Method {
	
	  private SessionFactory sessionFactory;//通过对象进行操作
	  //创建sessionFactory，使用sessionfactory进行操作	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	// 管理员登陆方法
	public Manager manager_login_maneger(String username, String password) {
		Manager manager = new Manager();
		manager = (Manager) sessionFactory.getCurrentSession()
        		.createQuery("from Manager where username=:username and password = :password")
        		.setString("username", username).setString("password", password).uniqueResult();
		         return manager;
	}

	// 根据某一台电脑的id号查询电脑的所有信息
	public ConcreteComputer queryConcrete(String id) {
		ConcreteComputer concretecomputer = new ConcreteComputer();
		concretecomputer= (ConcreteComputer) sessionFactory.getCurrentSession()
				          .createQuery("from ConcreteComputer where dev_id=:dev_id")
				          .setString("dev_id",id).uniqueResult();
		return concretecomputer;
	}

	// 获取全部电脑的状态，即查询电脑状态
	@SuppressWarnings("unchecked")
	public List<Dev_allocation> querycmpborrow() {
		List<Dev_allocation> list = new ArrayList<Dev_allocation>();
		list=sessionFactory.getCurrentSession().createQuery("from Dev_allocation").list();
		return list;
	}

	// 电脑的回收方法
	public boolean returncmp(String menber, String person) {
		boolean flag = false;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(date);
		int a = sessionFactory.getCurrentSession().createQuery("update allocation_person set recover_time=:recover_time ,recover_person =:recover_person where dev_id=:dev_id")
		.setString("recover_time", time).setString("recover_person", person).setString("dev_id", menber).executeUpdate();
		int b = sessionFactory.getCurrentSession().createQuery("update Computerstate set dev_condition='no-using' where dev_id=:dev_id").setString("dev_id", menber).executeUpdate();
		if(a>0&&b>0){
			flag=true;
		}
		return flag;
	}

	// 对电脑进行分配，及对表进行插入
	public boolean insert(Dev_allocation allocation) {
		boolean flag = false;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(date);
		allocation.setRecover_time(time);
	    Integer i=(Integer) sessionFactory.getCurrentSession().save(allocation);
			if (i > 0) {
				flag = true;
			}
		return flag;
	}

	// 根据电脑的操作系统查看电脑的属性，为员工分配新的电脑
	@SuppressWarnings("unchecked")
	public List<Computerstate> querybyos(String os) {
		List<Computerstate> list = new ArrayList<Computerstate>();
		list = sessionFactory.getCurrentSession().createQuery("from Computerstate").list();
		return list;
	}

	// 根据sn获取电脑编号及其电脑的属性相关的value
	public Computerstate1 querysn(String sn) {
		Computerstate1 com =new Computerstate1();
		com=(Computerstate1) sessionFactory.getCurrentSession()
        .createQuery("from Computerstate1 where dev_SN=:dev_SN")
        .setString("dev_SN",sn).uniqueResult();
		
		return com;
	}

	// 获取全部电脑的状态，即查询电脑状态
	@SuppressWarnings("unchecked")
	public List<Computerstate> querycmpstate() {
		List<Computerstate> list = new ArrayList<Computerstate>();
		list = sessionFactory.getCurrentSession().createQuery("from Computerstate").list();
	
		return list;
	}

	// 管理员登陆方法
	public boolean manager_login(String username, String password) {
		boolean flag = false;
		System.out.println(sessionFactory);
		Manager manager = new Manager();
		manager = (Manager) sessionFactory.getCurrentSession()
        		.createQuery("from Manager where username=:username and password = :password")
        		.setString("username", username).setString("password", password).uniqueResult();
		if(manager.getUsername()!=null){
			flag = true;
		}
		
		return flag;
	}

}
