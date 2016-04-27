package com.trial.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.trial.bean.Manager;
import com.trial.daoimpl.Method;

@SuppressWarnings("serial")
public class ManagerLogin extends ActionSupport {
 private String username;
 private String password;
  public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String login(){
	  Method m = new Method();
	  boolean fa = m.manager_login(username,password);
	  Manager manager = m.manager_login_maneger(username, password);
	  System.out.println("manager:"+manager.getUsername()+manager.getPassword());
	 ActionContext.getContext().getSession().put("manager111", manager);
	 System.out.println(manager.getUsername()+":"+manager.getPassword());
	  if(fa){
		  System.out.print(fa);
		  return SUCCESS;
	  }else{
		  addActionError("请输入正确的用户名跟密码");
		  return ERROR;
	  }
	 
	
  }
}
