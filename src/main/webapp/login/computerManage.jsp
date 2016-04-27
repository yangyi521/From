<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<link href="images/skin.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #EEF2FB;
}
#manageSubject table  td{
	font-size:12px;
}
-->
</style>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="17" valign="top" background="images/mail_leftbg.gif"><img src="images/left-top-right.gif" width="17" height="29" /></td>
    <td valign="top" background="images/content-bg.gif"><table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
      <tr>
        <td height="31"><div class="titlebt">管理电脑</div></td>
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
			<div id="manageSubject" align="center"><!--管理电脑-->
			<table width="95%" cellspacing="10">
			  <tr align="center">
				<td>设备id</td>
				<td>设备sn</td>
				<td>设备品牌</td>
				<td>设备型号</td>
				<td>设备类型</td>
				<td>设备状态</td>
				<td>操作系统</td>
				<td>操作</td>
			  </tr>
			  <s:iterator value="#request.list">
			  <tr align="center">
				<td><s:property value="dev_id"/></td>
				<td><s:property value="dev_SN"/></td>
				<td><s:property value="dev_brand"/></td>
				<td><s:property value="dev_model"/></td>
				<td><s:property value="dev_type"/></td>
				<td><s:property value="dev_condition"/></td>
				<td><s:property value="dev_OS"/></td>
				<td> <a href="computeruse.jsp"><font color="blue">使用</font></a></td>
			  </tr>
			  </s:iterator>
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
