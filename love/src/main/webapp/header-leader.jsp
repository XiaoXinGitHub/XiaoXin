<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>管理员</title>
<link rel="stylesheet" type="text/css" href="css/guanli/main.css">
</head>
<body class="sidebar-mini fixed">
	<div>
	<header class="main-header hidden-print">
		<a class="logo" href="index.jsp">校园微公益</a>
	</header>
		<aside class="main-sidebar hidden-print">
			<section class="sidebar">
				<div class="user-panel">
					<span style="color: white">团队名:</span><br><h4 style="color: white">${user.uTeamName}</h4>
				</div>
				<ul class="sidebar-menu">
					<li><a href="leader.action?teamName=${user.uTeamName}"><i class="fa fa-dashboard"></i> <span>团队信息管理</span></a></li>
					<li class="treeview"><a href="#"><i class="fa fa-laptop"></i>
							<span>团队成员管理</span> <i class="fa fa-angle-right"></i> </a>
						<ul class="treeview-menu">
							<li><a href="checkmember.action?teamName=${user.uTeamName}"><i class="fa fa-circle-o"></i>审核成员
							</a></li>
							<li><a href="showAllMember.action?teamName=${user.uTeamName}"><i class="fa fa-circle-o"></i>协会成员管理</a></li>
						</ul></li>
					<li class="treeview"><a href="#"><i class="fa fa-laptop"></i>
							<span>团队活动管理</span> <i class="fa fa-angle-right"> </i> </a>
						<ul class="treeview-menu">
							<li><a href="faactivity.jsp"><i class="fa fa-circle-o">
								</i>发起活动</a></li>
							<li><a href="showAllActivityFinished.action?teamName=${user.uTeamName}"><i
									class="fa fa-circle-o"> </i>历史活动</a></li>
							<li><a href="showAllActivityOnTime.action?teamName=${user.uTeamName}"><i class="fa fa-circle-o"></i>正在进行</a></li>
						</ul></li>
				</ul>
			</section>
		</aside>
	</div>
	<!-- Javascripts-->
	<script src="js/jquery-2.1.4.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/plugins/pace.min.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript"
		src="js/plugins/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="js/plugins/dataTables.bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<script type="text/javascript" src="js/jquery.serializejson.js"></script>
<body>
</html>