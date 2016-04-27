package com.trial.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Dev_allocation {
	private int id;
	private String dev_id;
	private String dev_SN;
	private String menber_no;
	private String given_time;
	private String given_person;
	private String recover_time;
	private String recover_person;
	@Id
    @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGiven_time() {
		return given_time;
	}
	public void setGiven_time(String given_time) {
		this.given_time = given_time;
	}
	public String getRecover_time() {
		return recover_time;
	}
	public void setRecover_time(String recover_time) {
		this.recover_time = recover_time;
	}
	public String getRecover_person() {
		return recover_person;
	}
	public void setRecover_person(String recover_person) {
		this.recover_person = recover_person;
	}
	@Id
	@GeneratedValue
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
	
	

}
