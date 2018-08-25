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
	<jsp:include page="header-leader.jsp"></jsp:include>
	<div class="campusnews">
		<div class="wrap" style="padding-top: 40px">
			<c:forEach items="${pageInfo.list}" var="activity" varStatus="s">
				<div class="newsunit" style="height: 230px">
					<a href="showActivity.action?activityid=${activity.id}">
					<c:forEach items="${teams}" var="team" begin="${s.index}" end="${s.index}">
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
							<h2>${activity.aActivity }<c:if
									test="${activity.aChecked=='未审核'}">
									<span style="color: red">${activity.aChecked}</span>
								</c:if>
								<c:if test="${activity.aChecked=='已审核'}">
									<span style="color: #fa8072">${activity.aOn}</span>
								</c:if>
							</h2>
							<p class="ct">${activity.aContent}</p>
							<p class="text-right">
								<!-- <span class="glyphicon glyphicon-folder-open gray"> 88</span> <span
									class="glyphicon glyphicon-thumbs-up red"> 127</span> -->
								${activity.aDotime}
							</p>
						</div> </a>
				</div>
			</c:forEach>
		</div>
		<!--显示分页信息-->
		<div class="row" style="text-align: center;">
			<!--文字信息-->
			<div class="col-md-6">当前第 ${pageInfo.pageNum} 页.总共
				${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</div>
			<!--点击分页-->
			<div class="col-md-6">
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<li><a
							href="${pageContext.request.contextPath}/showAllActivityOnTime.action?teamName=${user.uTeamName}&&pn=1">首页</a></li>

						<!--上一页-->
						<li><c:if test="${pageInfo.hasPreviousPage}">
								<a
									href="${pageContext.request.contextPath}/showAllActivityOnTime.action?teamName=${user.uTeamName}&&pn=${pageInfo.pageNum-1}"
									aria-label="Previous"> <span aria-hidden="true">«</span>
								</a>
							</c:if></li>

						<!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
						<c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
							<c:if test="${page_num == pageInfo.pageNum}">
								<li class="active"><a href="#">${page_num}</a></li>
							</c:if>
							<c:if test="${page_num != pageInfo.pageNum}">
								<li><a
									href="${pageContext.request.contextPath}/showAllActivityOnTime.action?teamName=${user.uTeamName}&&pn=${page_num}">${page_num}</a></li>
							</c:if>
						</c:forEach>

						<!--下一页-->
						<li><c:if test="${pageInfo.hasNextPage}">
								<a
									href="${pageContext.request.contextPath}/showAllActivityOnTime.action?teamName=${user.uTeamName}&&pn=${pageInfo.pageNum+1}"
									aria-label="Next"> <span aria-hidden="true">»</span>
								</a>
							</c:if></li>

						<li><a
							href="${pageContext.request.contextPath}/showAllActivityOnTime.action?teamName=${user.uTeamName}&&pn=${pageInfo.pages}">尾页</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
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
<script type="text/javascript">
	var p = function(data) {

	}
</script>
</html>
