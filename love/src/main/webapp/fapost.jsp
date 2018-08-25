<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益</title>
<style type="text/css">
#post1 {
width: 100%;
height: auto;
text-align: center;
margin: 10px;
}
</style>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div id="post1">
		<form action="">
		<div>
		<label style="font-size: 25px;color: #fa8072">标题</label>
		<input type="text" style="width: 40%;height: 50px;margin: 10px;border:1px solid #fa8072;color:#fa8072;border-radius: 10px">
		</div>
		<div style="border: 1px solid color:#fa8072;border-radius: 40px">
		<textarea rows="20" cols="100" style="border:1px solid #fa8072;color:#fa8072;border-radius: 10px"></textarea>
		</div>
		<input type="submit" style="width: 48%;height: 40px;border-radius: 40px;background-color: #fa8072;color: white;">
		</form>
	</div>
</html>
