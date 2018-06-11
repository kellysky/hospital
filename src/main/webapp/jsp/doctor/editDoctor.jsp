<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账户消息</title>
</head>
<body>
<font size="5" >账户信息</font><br/>
<form id="doctorForm" action="editDoctorSubmit.action" method="post" >
<input type="hidden" id="password" name="password" value="${doctorCustom.password }"/>
<table>
<tr>
<td><font size="3" >账户</font></td>
<td><input type="text" id="id" name="id" value="${doctorCustom.id}" /></td>
</tr>
<!-- <tr>
<td><font size="3" >密码</font></td>
<td><input type="text" name="password" value=${accountCustom.password} /></td>
</tr> -->
<tr>
<td><font size="3" >姓名</font></td>
<td><input type="text" id="name" name="name" value="${doctorCustom.name}" /></td>
</tr>
<tr>
<td><font size="3" >性别</font></td>
<td><input type="text" id="balance" name="gender" value="${doctorCustom.gender}" /></td>
</tr>
<tr>
<td><font size="3" >年龄</font></td>
<td><input type="text" id="balance" name="age" value="${doctorCustom.age}"/></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="提交"/>
</tr>
</table>
</form>
</body>
</html>