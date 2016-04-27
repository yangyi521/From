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
    <title>借出电脑页面</title>
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
  Dev_allocation  cps= new Dev_allocation();
	Method method = new Method();
	List<Dev_allocation> list = method.querycmpborrow();
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
			<div id="addSubjectForm" align="center">
				<table cellpadding="0" cellspacing="0" border="0" width="100%"
		class="table">
			<tr>
				<td>设备Id</td>
				<td>设备SN号</td>
				<td>社员号</td>
				<td>分配时间</td>
				<td>分配人</td>
				<td>回收时间</td>
				<td>回收人</td>
				
			</tr>
			
			<%-- <s:param name="sn">${id}</s:param> --%>
			<c:forEach var="cps" items="${list}">
     		<tr>
     			<td>${cps.dev_id}</td>
				<td>${cps.dev_SN}</td>
				<td>${ cps.menber_no}</td>
				<td>${ cps.given_time}</td>
				<td>${ cps.given_person}</td>
				<td>${ cps.recover_time}</td>
				<td>${ cps.recover_person}</td>
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
