<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益</title>
</head>
<body>
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="campusnews">
		<div class="wrap" style="padding-top: 40px;">
			<c:forEach items="${pageInfo.list}" var="post">
				<div class="newsunit" style="width: 800px; height: 250px">
					<a href="postInfo.action?id=${post.id}">
						<div class="fl news-text">
							<h2>${post.postTitle}</h2>
							<p class="ct">${post.postContent}</p>
							<c:forEach items="${times}" var="time" begin="${s.index}" end="${s.index}">
							<p style="text-align: right;">发帖时间:${time}</p>
							</c:forEach>
							
							<br>
							<p style="text-align: right;">发帖人:${post.postName}</p>
							<br>
						</div>
					</a>
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
							href="${pageContext.request.contextPath}/showAllPost.action?pn=1">首页</a></li>

						<!--上一页-->
						<li><c:if test="${pageInfo.hasPreviousPage}">
								<a
									href="${pageContext.request.contextPath}/showAllPost.action?Spn=${pageInfo.pageNum-1}"
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
									href="${pageContext.request.contextPath}/showAllPost.action?pn=${page_num}">${page_num}</a></li>
							</c:if>
						</c:forEach>

						<!--下一页-->
						<li><c:if test="${pageInfo.hasNextPage}">
								<a
									href="${pageContext.request.contextPath}/showAllPost.action?pn=${pageInfo.pageNum+1}"
									aria-label="Next"> <span aria-hidden="true">»</span>
								</a>
							</c:if></li>

						<li><a
							href="${pageContext.request.contextPath}/showAllPost.action?pn=${pageInfo.pages}">尾页</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
</html>
