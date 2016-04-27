package com.trial.action;

import com.opensymphony.xwork2.ActionSupport;
import com.trial.daoimpl.Method;

@SuppressWarnings("serial")
public class ComputerReturn extends ActionSupport {
	private String menber_no;
	private String supervision;

	public String getMenber_no() {
		return menber_no;
	}

	public void setMenber_no(String menber_no) {
		this.menber_no = menber_no;
	}
	
	public String getSupervision() {
		return supervision;
	}

	public void setSupervision(String supervision) {
		this.supervision = supervision;
	}

	public String execute(){
		Method  m = new Method();
		System.out.println(menber_no+supervision);
		boolean flag = m.returncmp(menber_no, supervision);
		if(flag){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}

}
