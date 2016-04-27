package com.trial.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trial_manager_ssh")
public class Manager {
private int id; 
private String username;
 private String password;
 @Id
 @GeneratedValue
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
}
