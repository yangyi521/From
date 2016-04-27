<%@ page language="java" import="java.util.*,com.trial.bean.*,com.trial.daoimpl.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
  <script type="text/javascript">
  function click(){
	  document.getElementById('dev_SN').submit();
  }
  </script>
    <title>电脑状态页面</title>
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
		background-color: #EEF2FB;
	}
	#addSubjectForm table  td{
		font-size:12px;
	}
	-->
	</style>
	<link href="images/skin.css" rel="stylesheet" type="text/css">
  </head>
  <% 
	Computerstate  cps= new Computerstate();
	Method method = new Method();
	List<Computerstate> list = method.querycmpstate();
	request.setAttribute("list", list);
	System.out.println(list);
	%>
<body> 
 <table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif"><table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">电脑状态</div></td>
      </tr>
    </table></td>
    <td width="16" valign="top" background="images/mail_rightbg.gif"><img src="images/nav-right-bg.gif" width="16" height="29" /></td>
  </tr>
  <tr>
    <td valign="middle" background="images/mail_leftbg.gif">&nbsp;</td>
    <td valign="top" bgcolor="#F7F8F9"><table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td width="53%" valign="top">&nbsp;</td>
        </tr>
      <tr>
        <td valign="middle"><span class="left_txt">
			<div id="addSubjectForm" align="center"><!--录入试题表单-->
				<table cellpadding="0" cellspacing="0" border="0" width="100%"
		class="table">
			<tr>
				<td>设备Id</td>
				<td>设备SN号</td>
				<td>品牌</td>
				<td>型号</td>
				<td>类型</td>
				<td>使用状态</td>
				<td>操作系统</td>
				
			</tr>
			
			<%-- <s:param name="sn">${id}</s:param> --%>
			<c:forEach var="cps" items="${list}">
     		<tr>
     			<td>${cps.dev_id}</td>
				<td>
				<form action="querybySN.action" method ="post" id=${ cps.dev_SN } name=${ cps.dev_SN }>
				<input type="hidden" name="dev_SN" id = "dev_SN" value=${ cps.dev_SN }><a href ="javascript:${ cps.dev_SN }.submit()"><font color="red">${ cps.dev_SN}</font></a></form></td>
				<%-- <td><s:param name="sn">${cps.dev_SN}</s:param></td> --%>
				<td>${ cps.dev_brand}</td>
				<td>${ cps.dev_model}</td>
				<td>${ cps.dev_type}</td>
				<td>${ cps.dev_condition}</td>
				<td>${ cps.dev_OS}</td>
     		</tr>
     		</c:forEach>
				
		</table>
			</div>
		</td>
        </tr>
      
    </table></td>
    <td background="images/mail_rightbg.gif">&nbsp;</td>
  </tr>
  <tr>
    <td valign="bottom" background="images/mail_leftbg.gif"><img src="images/buttom_left2.gif" width="17" height="17" /></td>
    <td background="images/buttom_bgs.gif"><img src="images/buttom_bgs.gif" width="17" height="17"></td>
    <td valign="bottom" background="images/mail_rightbg.gif"><img src="images/buttom_right2.gif" width="16" height="17" /></td>
  </tr>
</table>

</body>
</html>
