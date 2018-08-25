<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/video-js.min.css" type="text/css" rel="stylesheet" />
<link href="css/common.css" type="text/css" rel="stylesheet" />
<link href="css/index.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="head_top">
			 <div class="logo">
				<div class="logo_bg">						  
					<img src="images/index/logo.gif" width="250px">						
				</div>
			 </div>
			 
			 <div class="login">
				<div id="userImg">
				<c:if test="${empty user}">
				<a href="login.jsp">登录</a>
				</c:if>
				<c:if test="${!empty user}">
				<c:if test="${empty user.uImage}">
					<a href="member.action?uUsername=${user.uUsername}"><img
						src="images/gallery/g10.jpg" class="img-circle" alt="Cinque Terre"
						width="50" height="40"></a>
					</c:if>
					<c:if test="${!empty user.uImage}">
						<a href="member.action?uUsername=${user.uUsername}"><img
						src="${user.uImage}" class="img-circle" alt="Cinque Terre"
						width="50" height="40"></a>
					</c:if> 
				<a href="login.jsp" id="logout">退出</a>
				</c:if>
				</div>
				
			</div> 
			<div class="search">
				<form class="form-inline">
				  <div class="form-group">
					<div class="input-group">
					  <input type="text" class="form-control" id="searchContent" placeholder="">
					  <div class="input-group-addon"><span class="glyphicon glyphicon-search"></span></div>
					</div>
				  </div>
				</form>
			</div>	
		</div>
	<div class="header">
		<div class="Indextitle" id="J_m_nav">
			<div class="cc_c">
				<div class="menu">
					<ul>
						<li><a href="index.jsp"> <span
								class="name_ch">首页</span>
						</a></li>
						<li><a href="showAllTeam.action"> <span class="#">团队</span>
						</a></li>
						<li><a href="showAllActivity.action"> <span class="#">活动</span>
						</a></li>
						<li><a href="showAllPost.action"> <span class="#">讨论社区</span>
						</a></li>
						<li><a href="gallery.action"> <span class="#">公益墙</span>
						</a></li>
						<li><a href="#"> <span class="name_ch">支援活动</span>
						</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/video.min.js" type="text/javascript"></script>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/ZoomPic.js" type="text/javascript"></script>
</html>
