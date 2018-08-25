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
<link href="css/team.css" type="text/css" rel="stylesheet" />

</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>

	<div class="wrap">
		<p style="padding-top: 20px;" class="title_words">
			${team.teamName}</p>
	</div>
	<div class="wrap member">
		<div class="member_img">
			<c:if test="${empty team.teamImage}">
			<img src="images/team/img.png" class="img-rounded"
				alt="Cinque Terre" width="435" height="256">
			</c:if>
			<c:if test="${!empty team.teamImage}">
			<img src="${team.teamImage}" class="img-rounded"
				alt="Cinque Terre" width="435" height="256">
			</c:if>
		</div>
		<div class="member_info1" style="margin: 0px 10px">
			<table class="table" >
				<tr>
					<td><img src="images/team/list.png">
						团队名称：${team.teamName}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png"> 成立时间：${teamtime}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						成立人：${team.foundName}</td>
				</tr>
			</table>
		</div>
		<div class="member_info2">
			<table class="table">
				<tr>
					<td><img src="images/team/list.png">
						指导老师：${team.teacher}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						学生代表：${team.teamLeader}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						团队邮箱：${team.teamEmail}</td>
				</tr>
			</table>
		</div>
		<div style="float: right;">
		<c:if test="${empty user.uTeamName}">
			<a href="jointeam.action?uUsername=${user.uUsername}&&teamName=${team.teamName}" style="border: 1px solid #fa8072; border-radius: 5px;background-color: #fa8072;color: white">申请加入</a>
		</c:if>
		<c:if test="${user.uUsername==team.teamLeader}">
		<a href="leader.action?teamName=${team.teamName}" style="border: 1px solid #fa8072; border-radius: 5px;background-color: #fa8072;color: white">进入团队管理页面</a>
		</c:if>
		</div>
	</div>
	<!--长期服务基地-->
	<div class="base">
		<div class="base_list">
			<div class="more1">
				<a href="showThisTeamActivity.action?teamName=${team.teamName}">查看更多 &gt;</a>
			</div>
			<p>
				<img src="images/team/base_list.png"> 社团活动
			</p>

			<ul>
			<c:forEach items="${allActivity}" var="activity" varStatus="s" end="6">
			<c:forEach items="${activitytime}" var="time" begin="${s.index}" end="${s.index}">
			<li><a href="showActivity.action?activityid=${activity.id}"><img src="images/team/list.png">${activity.aActivity}||<span style="color: red">举办时间:${time}</span></a></li>
			</c:forEach>
			</c:forEach>
			<!-- 	<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li>
				<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li>
				<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li>
				<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li>
				<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li>
				<li><img src="images/team/list.png">长沙市儿童福利院志愿者服务基地
					每周二14:00-16:00</li> -->
			</ul>
		</div>
		<div class="base_member">
			<div class="more1">
				<a href="#">查看更多 &gt;</a>
			</div>
			<p>
				<img src="images/team/base_member.png"> 志愿者成员
			</p>
			<div class="base_mHeight">
				<div class="base_row">
					<div>
						<img src="images/member/member_photo.png">
					</div>
					<div>
						<img src="images/member/member_photo.png">
					</div>
					<div>
						<img src="images/member/member_photo.png">
					</div>
				</div>
				<div class="base_row">
					<div>
						<img src="images/member/member_photo.png">
					</div>
					<div>
						<img src="images/member/member_photo.png">
					</div>
					<div>
						<img src="images/member/member_photo.png">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--团队荣誉-->
	<div class="honor">
		<p class="text-center">
			<img src="images/team/title1.png">
		</p>
		<div class="honor_content">
			<div class="honor_date"></div>
			<div class="honor_list">
				<p class="p1">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p2">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p3">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p4">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p5">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p6">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p7">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
				<p class="p8">
					<span class="honor_color">2018-12-12</span>
					荣获湖南农业大学2017年度信息科学技术学院优秀志愿者称号
				</p>
			</div>
			<div class="honor_img">
				<div class="T_img1">
					<img src="images/member/member_active4.png">
				</div>
				<div class="T_img2">
					<img src="images/member/member_active4.png">
				</div>
			</div>
		</div>
	</div>
	<!--志愿感言-->
	<div class="note">
		<div class="text-center">
			<img src="images/team/title2.png">
		</div>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
		<div class="note_img">
			<img src="images/team/dream1.png">
		</div>
		<div class="note_img">
			<img src="images/team/dream2.png">
		</div>
		<div class="note_img">
			<img src="images/team/dream3.png">
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2017-2018 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
	
</body>
<script src="js/bootstrap.min.js" type="text/javascript"></script>

</html>
