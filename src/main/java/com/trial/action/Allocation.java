package com.trial.action;

import com.opensymphony.xwork2.ActionSupport;
import com.trial.bean.Dev_allocation;
import com.trial.daoimpl.Method;

@SuppressWarnings("serial")
public class Allocation extends ActionSupport {
	private String dev_id;
	private String dev_SN;
	private String menber_no;
	private String given_person;
	public String getDev_id() {
		return dev_id;
	}
	public void setDev_id(String dev_id) {
		this.dev_id = dev_id;
	}
	public String getDev_SN() {
		return dev_SN;
	}
	public void setDev_SN(String dev_SN) {
		this.dev_SN = dev_SN;
	}
	public String getMenber_no() {
		return menber_no;
	}
	public void setMenber_no(String menber_no) {
		this.menber_no = menber_no;
	}
	public String getGiven_person() {
		return given_person;
	}
	public void setGiven_person(String given_person) {
		this.given_person = given_person;
	}
	public String execute(){
		
		Dev_allocation dev = new Dev_allocation();
		dev.setDev_id(dev_id);
		dev.setDev_SN(dev_SN);
		dev.setGiven_person(given_person);
		dev.setMenber_no(menber_no);
		Method m = new Method();
		boolean flag = m.insert(dev);
		if(flag){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
		
	}
}
