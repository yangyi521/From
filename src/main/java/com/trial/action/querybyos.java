package com.trial.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.trial.bean.Computerstate;
import com.trial.daoimpl.Method;

public class querybyos extends ActionSupport {
	private String os;

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	public String execute(){
		List<Computerstate> list = new ArrayList<Computerstate>();
		Method m = new Method();
		list = m.querybyos(os);
		System.out.println("list中元素"+list);
		//ActionContext.getContext().put("list", list);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list",list);
		
		
		return SUCCESS;
	}

}
