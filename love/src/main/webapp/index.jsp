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
	<jsp:include page="nav.jsp"></jsp:include>
	<!--图片轮播-->
	<div class="top banner_top_large">
		<div class=" carousel  slide" id="myCarousel">
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class=""></li>
				<li data-target="#myCarousel" data-slide-to="1" class=""></li>
			</ol>
			<div class="carousel-inner">
				<div class="item  active">
					<a href="#">
						<div style="background-image: url(images/index/datu.png)"></div>
					</a>
				</div>
				<div class="item">
					<a href="#">
						<div style="background-image: url(images/index/datu.png)"></div>
					</a>
				</div>
			</div>
		</div>
	</div>


	<div class="wrap third">
		<div class="third_one">
			<div class="wenzi">
				<span>公益花絮</span>
			</div>
			<div class="tubiao">
				<span class="glyphicon glyphicon-expand" data-toggle="modal"
					data-target="#myModal"></span>
			</div>
		</div>
		<div class="third_two">
			<div class="two_title">
				<p>志愿感谢墙</p>
			</div>
			<div class="two_content">
				<p>当踏上这边热土，来到偏远贫瘠但充满希望的萨尔托海乡，心里各种复杂的感受交织在一起，觉得自己像迷失的小鸟</p>
			</div>
		</div>
		<div class="third_three">
			<div class="three_content">
				<h3>头条</h3>
				<p>公益随行圣诞启程</p>
				<p>爱弥儿之行</p>
				<p>317公交维序</p>
				<p>周末清扫大活动</p>
				<p>折纸情系你我</p>
			</div>
		</div>
	</div>
	<div id="jswbox" class="text-center">
		<img src="images/index/title2.png">
		<pre class="prev">prev</pre>
		<pre class="next">next</pre>
		<ul>
			<c:forEach items="${schoolmates}" var="schoolmate" varStatus="s"
				begin="0" end="7">
				<li><img src="${schoolmate.schoolmateImg}" width="267"
					height="396" /></li>
			</c:forEach>
		</ul>
	</div>
	<!--视频弹出框-->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header" style="border-bottom: none">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body text-center">
					<div class="playVideo">
						<video id="example_video_2"
							class="video-js vjs-default-skin vjs-big-play-centered vjs-fullscreen-control"
							controls="none" width="565" height="410"
							poster="images/index/video.jpg" data-setup="{}">
							<source id="1" src="video/Untitled.mp4" type='video/mp4' />
						</video>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--活动推荐-->
	<div class="activity_title">
		<img src="images/index/title3.png">
	</div>
	<div class="campusnews">
		<div class="wrap" style="padding-top: 40px">
			<c:forEach items="${activitys}" var="activity" varStatus="s"
				begin="0" end="2">
				<div class="newsunit" style="height: 230px">
					<a href="showActivity.action?activityid=${activity.id}"> <c:forEach
							items="${teams}" var="team" begin="${s.index}" end="${s.index}">
							<c:if test="${empty team.teamImage}">
								<img src="images/team/img.png" alt="" class="fl img-rounded"
									alt="Cinque Terre" width="280" height="280">
							</c:if>
							<c:if test="${!empty team.teamImage}">
								<img src="${team.teamImage}" alt="" class="fl img-rounded"
									alt="Cinque Terre" width="280" height="280">
							</c:if>
						</c:forEach>
						<div class="fl news-text">
							<h2>${activity.aActivity}</h2>
							<p class="ct">${activity.aContent}</p>
							<c:forEach items="${times}" var="time" begin="${s.index}" end="${s.index}">
								<p class="text-right">活动时间:${time}</p>
							</c:forEach>
						</div>
					</a>
				</div>
			</c:forEach>
			<div class="fr moreNews">
				<p>
					<a href="showAllActivity.action">更多&gt;&gt;</a>
				</p>
			</div>
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
	<div>
		<form action="index.action" method="post" id="index"></form>
	</div>
	<c:if test="${empty activitys}">
		<script>
			window.onload = function() {
				$("#index").submit();
			}
		</script>
	</c:if>
</body>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/video.min.js" type="text/javascript"></script>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/ZoomPic.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		new ZoomPic("jswbox");
	})
</script>
<script>
	$().ready(function() {
		$.ajax({
			type : "post",
			url : "index.action"
		})
	})
</script>
</html>
