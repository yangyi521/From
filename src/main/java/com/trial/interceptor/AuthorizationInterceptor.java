package com.trial.interceptor;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.trial.bean.Manager;

@SuppressWarnings("serial")
public class AuthorizationInterceptor extends AbstractInterceptor {
	 //Object object = ActionContext.getContext().get("manager");
	 

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//Manager manager = (Manager) ActionContext.getContext().getSession().get("manager");
		/*ActionContext ctx = actionInvocation.getInvocationContext();
		Map session = ctx.getSession();
		 Manager manager=(Manager) session.get("manager");*/
		  ActionContext ctx = invocation.getInvocationContext();  
	        Map session = ctx.getSession();  
	        Manager manager  =  (Manager) session.get("manager111");  
		 System.out.println("lanjieqizhong:"+manager);
		if(manager!=null){
			  return invocation.invoke();
		  }else{
			 // addActionError("请输入正确的用户名跟密码");
			  ((ActionSupport)invocation.getAction()).addActionError("请登录系统");
			  return Action.LOGIN;
			 // return "login";
		  }
	}

}
