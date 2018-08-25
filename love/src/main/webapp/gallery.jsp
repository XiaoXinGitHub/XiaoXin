<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Gallery</title>
<link href="css/gallery/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<link href="css/gallery/style.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet" href="css/gallery/lightbox.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript">
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 




</script>

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<style>
.gallery-grid {
	position: relative;
}

.gallery-grid .textbox {
	position: absolute;
	top: 0px;
	left: 0px;
	-webkit-transform: scale(0);
	/*  transform: scale(0);*/
	background-color: rgba(0, 0, 0, 0.53);
}

.gallery-grid:hover .textbox {
	-webkit-transform: scale(1.5);
	transform: scale(1);
}

.textbox {
	-webkit-transition: all 0.5s ease;
	transition: all 0.5s ease;
	text-align: center;
}

.textbox h4 {
	font-size: 1em;
	color: #fff;
	margin: 3em 0 .5em;
	text-transform: capitalize;
}

.textbox p {
	color: #fff;
	font-size: 10px;
	width: 90%;
	line-height: 1.8em;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div class="header head-top">
		<div class="header-top">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<jsp:include page="nav.jsp"></jsp:include>
				</div>
			</nav>
		</div>
	</div>
	<div class="gallery" style="padding: 5% 14%">
		<div class="container">
			<div class="gallery-grids">
				<c:forEach items="${pageInfo.list}" var="img" varStatus="s">
					<div class="gallery-grids1"
						style="float: left; margin: 5px 5px 0px 5px;">
						<div class="gallery-grid animated wow slideInUp"
							data-wow-delay=".5s"
							style="width: 240px; height: 210px; border: #fa8072 solid 1px">
							<a href="${img.schoolmateImg}" class="big"> <img class="aaa"
								src="${img.schoolmateImg}" alt=" " title="${img.schoolmateInfo}" width="269" height="176"/>
								<div class="textbox">
									<p style="color: white">${img.schoolmateInfo}</p>
								</div>
							</a>
							<h4 style="color: black">上传人:${img.schoolmateUsername}</h4>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
		<script type="text/javascript" src="js/gallery2/simple-lightbox.min.js"></script>
			<script>
				$(function(){
					var gallery = $('.gallery a').simpleLightbox({navText:		['&lsaquo;','&rsaquo;']});
				});
			</script>
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
						href="${pageContext.request.contextPath}/gallery.action?pn=1">首页</a></li>

					<!--上一页-->
					<li><c:if test="${pageInfo.hasPreviousPage}">
							<a
								href="${pageContext.request.contextPath}/gallery.action?Spn=${pageInfo.pageNum-1}"
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
								href="${pageContext.request.contextPath}/gallery.action?pn=${page_num}">${page_num}</a></li>
						</c:if>
					</c:forEach>

					<!--下一页-->
					<li><c:if test="${pageInfo.hasNextPage}">
							<a
								href="${pageContext.request.contextPath}/gallery.action?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">»</span>
							</a>
						</c:if></li>

					<li><a
						href="${pageContext.request.contextPath}/gallery.action?pn=${pageInfo.pages}">尾页</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<script src="js/lightbox-plus-jquery.min.js"></script>
	<script>
		$(".gallery-grid").mouseover(function() {
			var w = $(".aaa").width();
			var h = $(".aaa").height();
			//alert(w+" "+h);
			$(".gallery-grid .textbox").css("width", w);
			$(".gallery-grid .textbox").css("height", h);
		})
		
	</script>

</body>
</html>
