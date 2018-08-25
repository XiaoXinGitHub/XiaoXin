<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>考题查询</title>
<link rel="stylesheet" type="text/css" href="css/guanli/main.css">
</head>
<body class="sidebar-mini fixed">
	<header class="main-header hidden-print">
		<a class="logo" href="index.jsp">校园微公益</a>
	</header>
	<aside class="main-sidebar hidden-print">
		<section class="sidebar">
			<div class="user-panel">
				<div class="pull-left image">
					<c:if test="${empty user.uImage}">
						<img class="img-circle" src="images/gallery/g10.jpg"
							alt="User Image">
					</c:if>
					<c:if test="${!empty user.uImage}">
						<img class="img-circle" src="${user.uImage}" alt="User Image">
					</c:if>
				</div>
				<div class="pull-left info">
					<p>${user.uUsername}</p>
					<p class="designation">管理员</p>
				</div>
			</div>
			<!-- Sidebar Menu-->
			<ul class="sidebar-menu">
				<li class="treeview"><a href="adminUser.action"><i
						class="fa fa-laptop"></i> <span>账户管理</span><i
						class="fa fa-angle-right"></i></a></li>
				<li class="treeview"><a href="#"><i class="fa fa-laptop"></i>
						<span>团队管理</span><i class="fa fa-angle-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="teamcheck.action"><i class="fa fa-circle-o"></i>团队审核</a></li>
					</ul>
					<ul class="treeview-menu">
						<li><a href="showTeamAlreadychecked.action"><i
								class="fa fa-circle-o"></i>已有团队</a></li>
					</ul></li>
				<li class="treeview"><a href="#"><i class="fa fa-laptop"></i>
						<span>活动管理</span><i class="fa fa-angle-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="showSchoolmateNotChecked.action"><i class="fa fa-circle-o"></i>随手拍管理</a></li>
					</ul>
					<ul class="treeview-menu">
						<li><a href="showActivityNotChecked.action"><i class="fa fa-circle-o"></i>校园活动管理</a></li>
					</ul></li>
			</ul>
		</section>
	</aside>
	<script src="js/jquery-2.1.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/pace.min.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript"
		src="js/plugins/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="js/plugins/dataTables.bootstrap.min.js"></script>
<body>
</html>