<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益</title>
<jsp:include page="header-leader.jsp"></jsp:include>
<style type="text/css">
tr:nth-child(2n-1) {
	background: #fa8072;
}
</style>
</head>
<body>
	<div class="wrap">
		<p style="padding-top: 20px;" class="title_words">
			${team.teamName}</p>
	</div>
	<div class="wrap member">

		<div class="member_info1"
			style="float: right; width: 85%; height: 700px">
			<table class="table"
				style="float: right; margin: 10px 10%; width: 80%;">
				<tr>
					<td>用户名</td>
					<td>姓名</td>
					<td>学号</td>
					<td>性别</td>
					<td>邮箱</td>
					<td>操作</td>
				</tr>
				<c:forEach items="${pageInfo.list}" var="user">
					<tr>
						<td>${user.uUsername}</td>
						<td>${user.uTruename}</td>
						<td>${user.uSId}</td>
						<td>${user.uSex}</td>
						<td>${user.uEmail}</td>
						<td>
						<c:if test="${user.uPeopletypes=='负责人'}"><a href="#">负责人</a></c:if>
						<c:if test="${user.uPeopletypes!='负责人'}"><a href="#">设为负责人</a></c:if>
						||<a href="deleteTeamMember.action?username=${user.uUsername}">删除</a></td>
					</tr>
				</c:forEach>
			</table>
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
								href="${pageContext.request.contextPath}/showAllMember.action?teamName=${teamName}&&pn=1">首页</a></li>

							<!--上一页-->
							<li><c:if test="${pageInfo.hasPreviousPage}">
									<a
										href="${pageContext.request.contextPath}/showAllMember.action?teamName=${teamName}&&pn=${pageInfo.pageNum-1}"
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
										href="${pageContext.request.contextPath}/showAllMember.action?teamName=${teamName}&&pn=${page_num}">${page_num}</a></li>
								</c:if>
							</c:forEach>

							<!--下一页-->
							<li><c:if test="${pageInfo.hasNextPage}">
									<a
										href="${pageContext.request.contextPath}/showAllMember.action?teamName=${teamName}&&pn=${pageInfo.pageNum+1}"
										aria-label="Next"> <span aria-hidden="true">»</span>
									</a>
								</c:if></li>

							<li><a
								href="${pageContext.request.contextPath}/showAllMember.action?teamName=${teamName}&&pn=${pageInfo.pages}">尾页</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	</div>
	<div class="boot text-center" style="width: 100%; float: right;">
		<p>&copy; 2017-2018 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
</body>
<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
</html>
