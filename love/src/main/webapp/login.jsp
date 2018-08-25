<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>login </title>

<link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<body >
<div class="login" style="background-image: url('images/zig-zag.png');">
    <div class="box png">
		<div class="logo png"><h1 style="text-align: center; color:#FF8F90; font-style:oblique; ;">校园微公益</h1></div>
		<div class="input">
			<div class="log">
			<form action="login.action" method="post">
				<div class="name">
					<label>用户名</label><input type="text" class="text" id="value_1" placeholder="用户名" name="uUsername" tabindex="1">
				</div>
				<div class="pwd">
					<label>密　码</label><input type="password" class="text" id="value_2" placeholder="密码" name="uPwd" tabindex="2">
					<c:if test="${!empty err}">
						<p style="text-align: center;color: red">${err}</p>
						</c:if>
				<input type="submit" class="submit" tabindex="3" value="登录">
				<div style="float: left;position:absolute;">
				<a href="regist.jsp" style="text-decoration:none" >成为志愿者</a>
				</div>
				</div>
				</form>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="js/jQuery.js"></script>
<script type="text/javascript" src="js/fun.base.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
</body>
</html>