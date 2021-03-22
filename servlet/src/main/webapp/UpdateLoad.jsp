<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
<form action="Upload_Servlet" method="post" enctype="multipart/form-data">
    文件上传<input type="file" name="upload">
    <input type="submit"/>
</form>
</body>
</html>