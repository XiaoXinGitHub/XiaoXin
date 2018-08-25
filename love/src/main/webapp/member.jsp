<%@page import="edu.hunau.love.pojo.User"%>
<%@page import="java.text.SimpleDateFormat"%>
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
<link href="css/member.css" type="text/css" rel="stylesheet" />
<script src="js/jquery.min.js" type="text/javascript"></script>
<script>
	//图片上传预览    IE是用了滤镜。
	function previewImage(file) {
		var MAXWIDTH = 90;
		var MAXHEIGHT = 90;
		var div = document.getElementById('preview');
		if (file.files && file.files[0]) {
			div.innerHTML = '<img id=imghead onclick=$("#previewImg").click()>';
			var img = document.getElementById('imghead');
			img.onload = function() {
				var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT,
						img.offsetWidth, img.offsetHeight);
				img.width = rect.width;
				img.height = rect.height;
				//                 img.style.marginLeft = rect.left+'px';
				img.style.marginTop = rect.top + 'px';
			}
			var reader = new FileReader();
			reader.onload = function(evt) {
				img.src = evt.target.result;
			}
			reader.readAsDataURL(file.files[0]);
		} else //兼容IE
		{
			var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
			file.select();
			var src = document.selection.createRange().text;
			div.innerHTML = '<img id=imghead>';
			var img = document.getElementById('imghead');
			img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth,
					img.offsetHeight);
			status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width
					+ ',' + rect.height);
			div.innerHTML = "<div id=divhead style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
		}
	}
	function clacImgZoomParam(maxWidth, maxHeight, width, height) {
		var param = {
			top : 0,
			left : 0,
			width : width,
			height : height
		};
		if (width > maxWidth || height > maxHeight) {
			rateWidth = width / maxWidth;
			rateHeight = height / maxHeight;

			if (rateWidth > rateHeight) {
				param.width = maxWidth;
				param.height = Math.round(height / rateWidth);
			} else {
				param.width = Math.round(width / rateHeight);
				param.height = maxHeight;
			}
		}
		param.left = Math.round((maxWidth - param.width) / 2);
		param.top = Math.round((maxHeight - param.height) / 2);
		return param;
	}
</script>
<script>
	//图片上传预览    IE是用了滤镜。
	function previewImage2(file) {
		var MAXWIDTH = 90;
		var MAXHEIGHT = 90;
		var div = document.getElementById('preview2');
		if (file.files && file.files[0]) {
			div.innerHTML = '<img id=imghead2 onclick=$("#previewImg2").click()>';
			var img = document.getElementById('imghead2');
			img.onload = function() {
				var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT,
						img.offsetWidth, img.offsetHeight);
				img.width = rect.width;
				img.height = rect.height;
				//                 img.style.marginLeft = rect.left+'px';
				img.style.marginTop = rect.top + 'px';
			}
			var reader = new FileReader();
			reader.onload = function(evt) {
				img.src = evt.target.result;
			}
			reader.readAsDataURL(file.files[0]);
		} else //兼容IE
		{
			var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
			file.select();
			var src = document.selection.createRange().text;
			div.innerHTML = '<img id=imghead2>';
			var img = document.getElementById('imghead2');
			img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth,
					img.offsetHeight);
			status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width
					+ ',' + rect.height);
			div.innerHTML = "<div id=divhead style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;"+sFilter+src+"\"'></div>";
		}
	}
	function clacImgZoomParam(maxWidth, maxHeight, width, height) {
		var param = {
			top : 0,
			left : 0,
			width : width,
			height : height
		};
		if (width > maxWidth || height > maxHeight) {
			rateWidth = width / maxWidth;
			rateHeight = height / maxHeight;

			if (rateWidth > rateHeight) {
				param.width = maxWidth;
				param.height = Math.round(height / rateWidth);
			} else {
				param.width = Math.round(width / rateHeight);
				param.height = maxHeight;
			}
		}
		param.left = Math.round((maxWidth - param.width) / 2);
		param.top = Math.round((maxHeight - param.height) / 2);
		return param;
	}
</script>
</head>
<body>
	<div class="head_top">
		<div class="logo">
			<div class="logo_bg">
				<img src="images/index/logo.gif" width="250px">
			</div>
		</div>

		<div class="login">
			<div id="userImg">
				<c:if test="${empty user}">
					<a href="login.jsp">登录</a>
				</c:if>
				<c:if test="${!empty user}">
					<!-- 	<a href="member.jsp"><img src="images/index/user.png"></a> -->
					<c:if test="${empty user.uImage}">
					<a href="member.action?uUsername=${user.uUsername}"><img
						src="images/gallery/g10.jpg" class="img-circle" alt="Cinque Terre"
						width="50" height="40"></a>
					</c:if>
					<c:if test="${!empty user.uImage}">
						<a href="member.action?uUsername=${user.uUsername}"><img
						src="${user.uImage}" class="img-circle" alt="Cinque Terre"
						width="50" height="40"></a>
					</c:if>
					<a href="login.jsp" id="logout">退出</a>
				</c:if>
			</div>

		</div>

		<div class="search">
			<form class="form-inline">
				<div class="form-group">
					<div class="input-group">
						<input type="text" class="form-control" id="searchContent"
							placeholder="">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-search"></span>
						</div>
					</div>
				</div>
			</form>
		</div>

	</div>
	<div class="header">

		<div class="Indextitle" id="J_m_nav">
			<div class="cc_c">
				<div class="menu">
					<ul>
						<li><a href="index.jsp"> <span class="name_ch">首页</span>
						</a></li>
						<li><a href="showAllTeam.action"> <span class="name_ch">团队</span>
						</a></li>
						<li><a href="showAllActivity.action"> <span
								class="name_ch">活动</span>
						</a></li>
						<li><a href="showAllPost.action"> <span class="name_ch">讨论社区</span>
						</a></li>
						<li><a href="gallery.action"> <span class="name_ch">公益墙</span>
						</a></li>
						<li><a href="html/"> <span class="name_ch">支援活动</span>
						</a></li>
					</ul>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>

	<div class="wrap">
		<p style="padding-top: 20px;">
			<span class="title_dot">&bull;</span> <span class="title_words">个人中心</span>
		</p>
	</div>

	<div class="wrap member">
		<div class="member_img">
			<div class="editPhoto">
				<p>修改头像</p>
			</div>
			<!-- <img src="images/member/member_photo.png"> -->
			<c:if test="${empty user.uImage}">
			<a href="#"><img src="images/gallery/g10.jpg" class="img-rounded"
				alt="Cinque Terre" width="150" height="150"></a>
			</c:if>
			<c:if test="${!empty user.uImage}">
			<a href="#"><img src="${user.uImage}" class="img-rounded"
				alt="Cinque Terre" width="150" height="150"></a>
			</c:if>
		</div>
		<div class="member_info1" style="margin: 0px 10px">
			<table class="table">
				<tr>
					<td><img src="images/member/member1.png">
						姓名：${user.uTruename}</td>
				</tr>
				<tr>
					<td><img src="images/member/member3.png"> <span
						id="dotime">邮箱: ${user.uEmail}</span></td>
				</tr>
				<tr>
					<td><img src="images/member/member5.png">
						性别：${user.uSex}</td>
				</tr>
			</table>
		</div>
		<div class="member_info1">
			<table class="table">
				<tr>
					<td><img src="images/member/member2.png">
						学号：${user.uSId}</td>
				</tr>
				<tr>
					<c:if test="${empty user.uTeamName}">
						<td><img src="images/member/member4.png"> 团队：<span
							style="color: red">暂无加入任何协会</span></td>
					</c:if>
					<c:if test="${!empty user.uTeamName}">
						<td><img src="images/member/member4.png">
							团队：${user.uTeamName}</td>
					</c:if>
				</tr>
				<tr>
					<td><img src="images/member/member6.png">
						职位：${user.uPeopletypes}<c:if test="${user.uPeopletypes=='负责人'}">
							<a href="team.action?teamName=${user.uTeamName}"
								style="color: red; border: 1px solid red;">团队管理</a>
						</c:if></td>
				</tr>
			</table>
		</div>
		<div style="float: right">
			<c:if test="${!empty user}">
				<a href="#"
					style="border: 1px solid #fa8072; border-radius: 5px; background-color: #fa8072; color: white" class="modifyModel">修改个人信息</a>
				<a href="#"
					style="border: 1px solid #fa8072; border-radius: 5px; background-color: #fa8072; color: white" class="tieziModel">发帖子</a>
				<a href="#"
					style="border: 1px solid #fa8072; border-radius: 5px; background-color: #fa8072; color: white" class="schoolmateModel">上传随手拍</a>
			</c:if>
		</div>
	</div>
	<!--个人活动墙-->
	<div class="activity">
		<p class="text-center">
			<img src="images/member/member_title1.png">
		</p>
		<div class="activity_row1">
			<div class="activity_col">
				<div class="activity_bg1">
					<p>保护水环境</p>
				</div>
				<div class="activity_bg2">
					<p>每天雷打不动的出现在东沙古井旁，引导居民文明打水，不让井水受到污染，44岁的黄太天喝着古井井水长大，对其有着深厚感情的他也自发成为护井人，昨日接过“民间井长”聘书的黄天天连称“担子更重，干劲更足”</p>
				</div>
			</div>
			<div class="activity_col">
				<img src="images/member/member_active1.png">
			</div>
			<div class="activity_col">
				<div class="activity_bg1">
					<p>关爱自闭症儿童</p>
				</div>
				<div class="activity_bg2">
					<p>每天雷打不动的出现在东沙古井旁，引导居民文明打水，不让井水受到污染，44岁的黄太天喝着古井井水长大，对其有着深厚感情的他也自发成为护井人，昨日接过“民间井长”聘书的黄天天连称“担子更重，干劲更足”</p>
				</div>
			</div>
			<div class="activity_col">
				<img src="images/member/member_active2.png">
			</div>
		</div>
		<div class="activity_row1">
			<div class="activity_col" style="border: solid 1px #ff6666">
				<div class="activity_bg1_1">
					<p>317维序</p>
				</div>
				<div class="activity_bg2_2">
					<p>每天雷打不动的出现在东沙古井旁，引导居民文明打水，不让井水受到污染，44岁的黄太天喝着古井井水长大，对其有着深厚感情的他也自发成为护井人，昨日接过“民间井长”聘书的黄天天连称“担子更重，干劲更足”</p>
				</div>
			</div>
			<div class="activity_col">
				<img src="images/member/member_active3.png">
			</div>
			<div class="activity_col" style="border: solid 1px #ff6666">
				<div class="activity_bg1_1">
					<p>317维序</p>
				</div>
				<div class="activity_bg2_2">
					<p>每天雷打不动的出现在东沙古井旁，引导居民文明打水，不让井水受到污染，44岁的黄太天喝着古井井水长大，对其有着深厚感情的他也自发成为护井人，昨日接过“民间井长”聘书的黄天天连称“担子更重，干劲更足”</p>
				</div>
			</div>
			<div class="activity_col">
				<img src="images/member/member_active4.png">
			</div>
		</div>
	</div>
	<!--志愿感言-->
	<div class="note">
		<div class="text-center">
			<img src="images/member/member_title3.png">
		</div>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
		<p>青年志愿者活动提倡团结友爱，助人为乐，见义勇为的社会风气，是当代社会一项十分高尚的事业。体现了中华民族助人为乐，扶贫济困的传统美德，也是我们学习三个代表的具体表现。发奋做好这项事业，有利于全社会树立奉献、友爱、互助进步的新风尚。这是当代大学生的行动指南，是当代青年志愿者的使命，也是我们学习三个代表思想的具体表现</p>
	</div>



	<div class="boot text-center">
		<p>&copy; 2017-2018 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
	 <!-- 上传随手拍 -->
	<div class="modal fade" id="schoolmateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="schoolmateModalLabel">上传公益随手拍</h4>
				</div>
				<form action="upschoolmate.action" method="post"  enctype="multipart/form-data">
				<div class="modal-body">
					<div class="input-group row">
						<div class="col-sm-3">
							<label>请选择照片</label>
						</div>
						<div class="col-sm-9 big-photo">
							<div id="preview">
								<img id="imghead" border="0" src="images/photo_icon.png" width="90"
									height="90" onclick="$('#previewImg').click();">
							</div>
							<input type="file" onchange="previewImage(this)"
								style="display: none;" id="previewImg" name="image">
							<input id="uploaderInput" class="uploader__input" style="display: none;" type="file" accept="" multiple="">
						</div>
						<div class="col-sm-3">
							<label>照片描述</label>
						</div>
						<div class="col-sm-9 big-photo">
						<textarea rows="3" cols="" name="schoolmateInfo"></textarea>
						</div>
					</div>
					<img alt="" src="">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="submit" class="btn btn-primary">上传</button>
				</div>
				</form>
			</div>
		</div>
	</div>

	<!-- 修改头像 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="myModalLabel">修改头像</h4>
				</div>
				<form action="upimage.action?uUsername=${user.uUsername}" method="post"  enctype="multipart/form-data">
				<div class="modal-body">
					<div class="input-group row">
						<div class="col-sm-3">
							<label>请选择头像</label>
						</div>
						<div class="col-sm-9 big-photo">
							<div id="preview2">
								<img id="imghead2" border="0" src="images/photo_icon.png" width="90"
									height="90" onclick="$('#previewImg2').click();">
							</div>
							<input type="file" onchange="previewImage2(this)"
								style="display: none;" id="previewImg2" name="image">
							<!--<input id="uploaderInput" class="uploader__input" style="display: none;" type="file" accept="" multiple="">-->
						</div>
					</div>
					<img alt="" src="">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="submit" class="btn btn-primary">修改</button>
				</div>
				</form>
			</div>
		</div>
	</div>

		<!-- 修改信息 -->
	<div class="modal fade" id="userModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="myModalLabel">修改个人信息</h4>
				</div>
				<form action="modifyUser.action" method="post" class="form-horizontal"
					role="form" id="applyform" >
					<div class="modal-body">
						<div class="form-group">
							<input type="hidden" value="null" id="repair" /> <label
								for="inputEmail3" class="col-sm-2 control-label">用户名</label>
							<div class="col-sm-8">
								<input class="form-control" id="projectname" name="uUsername"
									value="${user.uUsername}" placeholder="" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<input type="hidden" value="null" id="repair" /> <label
								for="inputEmail3" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-8">
								<input class="form-control" id="projectname" name="uTruename"
									value="${user.uTruename}" placeholder="" >
							</div>
						</div>
						
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">学号</label>
							<div class="col-sm-5">
								<input class="form-control" id="name" name="uSId"
									value="${user.uSId}">
							</div>
						</div>

						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">邮箱</label>
							<div class="col-sm-8">
								<input type="email" class="form-control" id="address"
									name="uEmail" placeholder="" value="${user.uEmail}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">性别</label>
							<div class="col-sm-5">
								<input class="form-control" id="budget" name="uSex"
									type="text" placeholder="" value="${user.uSex}">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">修改</button>
					</div>
				</form>
			</div>
		</div>
	</div>
		<!-- 发送帖子 -->
	<div class="modal fade" id="fatieModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="myModalLabel">发帖</h4>
				</div>
				<form action="fatie.action" method="post" class="form-horizontal"
					role="form" id="applyform" >
					<div class="modal-body">	
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">标题</label>
							<div class="col-sm-5">
								<input class="form-control" id="budget" name="postTitle"
									type="text" placeholder="" value="">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">内容</label>
							<div class="col-sm-5">
								<textarea rows="5" cols="30" name="postContent"></textarea>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="submit" class="btn btn-primary">发帖</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script>
	$(".member_img").mouseover(function() {
		$(".editPhoto").show();
	})
	$(".member_img").mouseout(function() {
		$(".editPhoto").hide();

	})
	$(".member_img").click(function() {
		$('#myModal').modal('show');
	})
	$(".modifyModel").click(function() {
		$('#userModal').modal('show');
	})
	$(".tieziModel").click(function() {
		$('#fatieModal').modal('show');
	})
	$(".schoolmateModel").click(function() {
		$('#schoolmateModal').modal('show');
	})
</script>

</html>
