<%@page import="com.neusoft.bean.Person"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<style type="text/css">
body, html {
	margin: 0;
}

table {
	width: 550px;
	height: 60px;
	margin: 0 auto;
}

td {
	width: 100px;
	height: 30px;
	text-align: center;
}

h3 {
	margin: 0;
}
tr .t4{
  width: 150px
}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="5" align="center">
				<h3>梁山英雄座次表</h3>
			</td>
		</tr>

		<tr>
			<th>排行</th>
			<th>绰号</th>
			<th>姓名</th>
			<th>事件</th>
			<th>生日</th>
		</tr>
   	<c:forEach items="${Person}" var="p">
   	  
   	    <tr>
			<td>${p.id}</td>
			<td>${p.nickName }</td>
			<td>${p.realName }</td>
			<td class="t4">${p.showTime }</td>
			<td>${p.birthday }</td>
		</tr>
		
   	</c:forEach>	
		
	</table>
	
	
	
</body>
</html>