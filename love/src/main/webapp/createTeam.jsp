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
.team{
width: 40%;
height: 50px;
margin: 10px;
border:1px solid #fa8072;
color:#fa8072;
border-radius: 10px
}
</style>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div id="post1">
		<form action="">
		<div>
		<table style="width: 100%;text-align: center;">
		<tr>
		<td><label style="font-size: 25px;color: #fa8072">团队名字</label>
		<input type="text" class="team"></td>
		<td><label style="font-size: 25px;color: #fa8072">成立人</label>
		<input type="text" class="team" value="${user.uUsername}"></td>
		</tr>
		<tr>
		<td><label style="font-size: 25px;color: #fa8072">指导老师</label>
		<input type="text" class="team"></td>
		<td><label style="font-size: 25px;color: #fa8072">团队邮箱</label>
		<input type="text" class="team"></td>
		</tr>
		<tr>
		<td>	<label style="font-size: 25px;color: #fa8072">所属院校</label>
		<input type="text" class="team"></td>
		<td><label style="font-size: 25px;color: #fa8072">团队负责人</label>
		<input type="text" class="team" value="${user.uUsername}"></td>
		</tr>
		</table>
		</div>
		<div style="border: 1px solid color:#fa8072;border-radius: 40px">
		<textarea rows="10" cols="200" style="border:1px solid #fa8072;color:#fa8072;border-radius: 10px"> 团队简介...</textarea>
		</div>
		<div style="margin: 5px 50px">
		<input type="submit" style="width: 40%;height: 40px;border-radius: 40px;background-color: #fa8072;color: white;" value="创建">
		<input type="reset" style="width: 40%;height: 40px;border-radius: 40px;background-color: #fa8072;color: white;float: left">
		</div>
		</form>
	
	</div>
</html>
