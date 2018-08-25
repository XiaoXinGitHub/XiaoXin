<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益网</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/video-js.min.css" type="text/css" rel="stylesheet" />
<link href="css/common.css" type="text/css" rel="stylesheet" />
<link href="css/activity.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="new">
		<div class="new_content">
			<div class="new_title">
				<p>${activity.aActivity}</p>
				<table class="table">
					<tr>
						<td>负责人 ： ${activity.aManager}</td>
						<td>时间 ： ${activitytime}</td>
					</tr>
					<tr>
						<td>报名邮箱：${email}</td>
						<td>地点 ： ${activity.aAddress}</td>
					</tr>
				</table>
			</div>
			<div class="new_detail">
				<p>${activity.aContent }</p>
			</div>
				<jsp:include page="discuss.jsp"></jsp:include>
			<div class="new_list">
				<table class="table">
					<tr>
						<td><p>20余次漂流母亲河 环保先锋变身民间河长</p> <span>2018-01-11</span></td>
						<td><p>"公益进校园 爱心大义卖"活动情暖交通路小学</p>
							<span>2018-01-11</span></td>
					</tr>
					<tr>
						<td><p>新机遇、新挑战与新思考</p>
							<span>2018-01-11</span></td>
						<td><p>润进留守儿童心中的“春雨”</p>
							<span>2018-01-11</span></td>
					</tr>
					<tr>
						<td><p>青年志愿者服务项目大赛文化宣传类获奖项目合集</p>
							<span>2018-01-11</span></td>
						<td><p>青年志愿者服务项目大赛文化宣传类获奖项目合集</p>
							<span>2018-01-11</span></td>
					</tr>
					<tr>
						<td><p>服务过程即是成长过程</p>
							<span>2018-01-11</span></td>
						<td><p>世界无童工日 苦难生活抹不去他们纯真的微笑</p>
							<span>2018-01-11</span></td>	
					</tr>
				</table>
			</div>
		</div>
	</div>
	<div class="new_boot"></div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
</body>
</html>
