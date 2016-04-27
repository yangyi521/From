package com.trial.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Computerstate {
	private int id;
 private String dev_id;
 private String dev_SN;
 private String dev_brand;
 private String dev_model;
 private String dev_type;
 private String dev_condition;
 private String dev_OS;
 @Id 
 @GeneratedValue
public String getDev_id() {
	return dev_id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getDev_brand() {
	return dev_brand;
}
public void setDev_brand(String dev_brand) {
	this.dev_brand = dev_brand;
}
public String getDev_model() {
	return dev_model;
}
public void setDev_model(String dev_model) {
	this.dev_model = dev_model;
}
public String getDev_type() {
	return dev_type;
}
public void setDev_type(String dev_type) {
	this.dev_type = dev_type;
}
public String getDev_condition() {
	return dev_condition;
}
public void setDev_condition(String dev_condition) {
	this.dev_condition = dev_condition;
}
public String getDev_OS() {
	return dev_OS;
}
public void setDev_OS(String dev_OS) {
	this.dev_OS = dev_OS;
}
@Override
public String toString() {
	return "Computerstate [dev_id=" + dev_id + ", dev_SN=" + dev_SN
			+ ", dev_brand=" + dev_brand + ", dev_model=" + dev_model
			+ ", dev_type=" + dev_type + ", dev_condition=" + dev_condition
			+ ", dev_OS=" + dev_OS + "]";
}
 
 
}
