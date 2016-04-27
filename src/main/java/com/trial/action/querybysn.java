package com.trial.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.trial.bean.Computerstate1;
import com.trial.daoimpl.Method;

@SuppressWarnings("serial")
public class querybysn extends ActionSupport {
  private String dev_SN;


  public String getDev_SN() {
	return dev_SN;
}


public void setDev_SN(String dev_SN) {
	this.dev_SN = dev_SN;
}

public String snquery(){
	  Method m = new Method();
	  Computerstate1 com = new Computerstate1();
	  com=m.querysn(dev_SN);
	 System.out.println(com);
	 System.out.println("adfasdda"+dev_SN);
	  ActionContext.getContext().put("com", com);//
	  return SUCCESS;
  }
}
