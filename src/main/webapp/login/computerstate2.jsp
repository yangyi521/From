<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
    <title>试题详细显示页面</title>
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
		margin-right: 0px;
		margin-bottom: 0px;
		background-color: #EEF2FB;
	}
	#showSubject table  td{
		font-size:12px;
	}
	-->
	</style>
	<link href="images/skin.css" rel="stylesheet" type="text/css">
  </head>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif"><table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">查看状态</div></td>
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
			<div id="showSubject" align="center"><!--显示试题-->
			<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
				    <td>电脑SN号:</td>
				    <td>${com.dev_SN}<d>
			    </tr>
				  <tr>
					<td>生产日期:</td>
					<td>${com.release_date}
					</td>
				  </tr>
				  <tr>
					<td>保修时长:</td>
					<td>${com.date_length}</td>
				  </tr>
				   <tr>
					<td>保修截止:</td>
					<td>${com.release_end}</td>
				  </tr>
				   <tr>
					<td>维修时间:</td>
					<td>${com.repair_start}</td>
				  </tr>
				   <tr>
					<td>维修截止:</td>
					<td>${com.repair_end}</td>
				  </tr>
				   <tr>
					<td>负责人:</td>
					<td>${com.supervision}</td>
				  </tr>
				  <tr>
					<td valign="top">备注:</td>
					<td valign="top">${com.dev_remark}</td>
				  </tr>
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
