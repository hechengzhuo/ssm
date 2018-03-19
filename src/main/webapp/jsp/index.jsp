<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table width="80%" align="center">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>电话</td>
		</tr>
		<c:forEach items="${list }" var="bean">
			<tr>
				<td>${bean.id }</td>
				<td>${bean.name }</td>
				<td>${bean.phone }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>