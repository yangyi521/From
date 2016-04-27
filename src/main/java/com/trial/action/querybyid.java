package com.trial.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.trial.bean.ConcreteComputer;
import com.trial.daoimpl.Method;

@SuppressWarnings("serial")
public class querybyid extends ActionSupport {
private String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
public String execute(){
	Method m = new Method();
	ConcreteComputer computer = new  ConcreteComputer();
	computer=m.queryConcrete(id);
	System.out.println(computer);
	ActionContext.getContext().put("computer", computer);
	
	return SUCCESS;
}
}
