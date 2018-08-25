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
				<p>${post.postTitle}</p>
				<table class="table">
					<tr>
						<td>发帖人 ： ${post.postName}</td>
						<td>发帖时间 ： ${time}</td>
					</tr>
				</table>
			</div>
			<div class="new_detail">
				<p>${post.postContent }</p>
			</div>
			<div style="padding: 20px">
				<div class="new_content">
					<form action="liuyan.action?postid=${post.id}" method="post">
						<table>
							<tr>
								<td><textarea rows="2" cols="100" name="discussContent"></textarea></td>
								<td style="padding: 0px 10px"><button type="submit"
										class="btn btn-danger" style="height: 45px;">留言</button></td>
							</tr>
						</table>
					</form>
				</div>
				<div class="new_content">
					<h3>留言列表</h3>
					<c:forEach items="${pageInfo.list}" var="discusss" varStatus="s">
						<p>-------------------------------------------------------------------------------------------------------------------------------------------------------</p>
						<p style="color: #bebebe">第${s.index+1}楼</p>
						<p>${discusss.discussContent}</p>
						<c:forEach items="${times}" var="times" begin="${s.index}" end="${s.index}">
						<p style="text-align: right;">留言时间:${times}</p>
						</c:forEach>
						<p style="text-align: right;">留言人:${discusss.discusssUsername}</p>
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
									href="${pageContext.request.contextPath}/postInfo.action?pn=1&&id=${post.id}">首页</a></li>

								<!--上一页-->
								<li><c:if test="${pageInfo.hasPreviousPage}">
										<a
											href="${pageContext.request.contextPath}/postInfo.action?Spn=${pageInfo.pageNum-1}&&id=${post.id}"
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
											href="${pageContext.request.contextPath}/postInfo.action?pn=${page_num}&&id=${post.id}">${page_num}</a></li>
									</c:if>
								</c:forEach>

								<!--下一页-->
								<li><c:if test="${pageInfo.hasNextPage}">
										<a
											href="${pageContext.request.contextPath}/postInfo.action?pn=${pageInfo.pageNum+1}&&id=${post.id}"
											aria-label="Next"> <span aria-hidden="true">»</span>
										</a>
									</c:if></li>

								<li><a
									href="${pageContext.request.contextPath}/postInfo.action?pn=${pageInfo.pages}&&id=${post.id}">尾页</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
</body>
</html>
