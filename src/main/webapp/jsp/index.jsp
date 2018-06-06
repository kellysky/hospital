<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
<html>
<body>
<h2>Hello World!</h2>
<table>
<tr>
    <td>账户</td>
    <td>密码</td>
    <td>姓名</td>
    <td>性别</td>
    <td>年龄</td>
</tr>

<c:forEach items="${docotrList}" var = "doctor">
<tr>
    <td>${doctor.doctor_id }</td>
    <td>${doctor.password }</td>
    <td>${doctor.name}</td>
    <td>${doctor.gender}</td>
    <td>${doctor.age}</td>
    <td><a href="${pageContext.request.contextPath }/doctor/editDoctor.action?id=${doctor.doctor_id}">修改</a></td>
</tr>
</c:forEach> 
</table>
</body>
</html>
