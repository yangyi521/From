package com.trial.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Computerstate1 {
	private int id;
	private String dev_SN;
	private Date release_date;
	private String date_length;
	private Date release_end;
	private Date repair_start;
	private Date repair_end;
	private String supervision;
	private String dev_remark;
	@Id
    @GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDev_SN() {
		return dev_SN;
	}
	public void setDev_SN(String dev_SN) {
		this.dev_SN = dev_SN;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public String getDate_length() {
		return date_length;
	}
	public void setDate_length(String date_length) {
		this.date_length = date_length;
	}
	public Date getRelease_end() {
		return release_end;
	}
	public void setRelease_end(Date release_end) {
		this.release_end = release_end;
	}
	public Date getRepair_start() {
		return repair_start;
	}
	public void setRepair_start(Date repair_start) {
		this.repair_start = repair_start;
	}
	public Date getRepair_end() {
		return repair_end;
	}
	public void setRepair_end(Date repair_end) {
		this.repair_end = repair_end;
	}
	public String getSupervision() {
		return supervision;
	}
	public void setSupervision(String supervision) {
		this.supervision = supervision;
	}
	public String getDev_remark() {
		return dev_remark;
	}
	public void setDev_remark(String dev_remark) {
		this.dev_remark = dev_remark;
	}
	@Override
	public String toString() {
		return "Computerstate1 [dev_SN=" + dev_SN + ", release_date="
				+ release_date + ", date_length=" + date_length
				+ ", release_end=" + release_end + ", repair_start="
				+ repair_start + ", repair_end=" + repair_end
				+ ", supervision=" + supervision + ", dev_remark=" + dev_remark
				+ "]";
	}
	
	
	
	

}
