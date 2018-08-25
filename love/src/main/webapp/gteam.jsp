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
</head>
<body>
	<jsp:include page="header-leader.jsp"></jsp:include>
	<div class="wrap">
		<p style="padding-top: 20px;" class="title_words">
			${team.teamName}</p>
	</div>
	<div class="wrap member">
		<div class="member_img">
			<div class="editPhoto">
				<p>修改头像</p>
			</div>
			<c:if test="${empty team.teamImage}">
				<img src="images/team/img.png" alt="" class="fl img-rounded"
					alt="Cinque Terre" width="435" height="256">
			</c:if>
			<c:if test="${!empty team.teamImage}">
				<img src="${team.teamImage}" alt="" class="fl img-rounded"
					alt="Cinque Terre" width="435" height="256">
			</c:if>
		</div>
		<div class="member_info1">
			<table class="table">
				<tr>
					<td><img src="images/team/list.png">
						团队名称：${team.teamName}
				</tr>
				<tr>
					<td><img src="images/team/list.png"> 成立时间：${teamtime}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						成立人：${team.foundName}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						指导老师：${team.teacher}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						学生负责人：${team.teamLeader}</td>
				</tr>
				<tr>
					<td><img src="images/team/list.png">
						团队邮箱：${team.teamEmail}</td>
					<td><a href="#"
						style="border: 1px solid #fa8072; border-radius: 5px; background-color: #fa8072; color: white"
						class="modifyModel">修改团队信息</a></td>
				</tr>
			</table>
		</div>
	</div>
	<!--长期服务基地-->
	<div class="base">
		<div class="base_list">
			<div class="more1">
				<a href="#">查看更多 &gt;</a>
			</div>
			<p>
				<img src="images/team/base_list.png"> 团队活动
			</p>
			<ul>
				<c:forEach items="${allActivity}" var="activity" varStatus="s"
					end="6">
					<c:forEach items="${activitytime}" var="time" begin="${s.index}"
						end="${s.index}">
						<li><a href="showActivity.action?activityid=${activity.id}"><img
								src="images/team/list.png">${activity.aActivity}||<span
								style="color: red">举办时间:${time}</span></a></li>
					</c:forEach>
				</c:forEach>
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
					<h4 class="modal-title text-center" id="myModalLabel">修改团队头像</h4>
				</div>
				<form action="upteamimage.action?teamName=${team.teamName}"
					method="post" enctype="multipart/form-data">
					<div class="modal-body">
						<div class="input-group row">
							<div class="col-sm-3">
								<label>请选择头像</label>
							</div>
							<div class="col-sm-9 big-photo">
								<div id="preview">
									<img id="imghead" border="0" src="images/photo_icon.png"
										width="90" height="90" onclick="$('#previewImg').click();">
								</div>
								<input type="file" onchange="previewImage(this)"
									style="display: none;" id="previewImg" name="image">
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
	<div class="modal fade" id="teamModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="myModalLabel">修改团队信息</h4>
				</div>
				<form action="modifyTeam.action" method="post" class="form-horizontal"
					role="form" id="applyform" >
					<div class="modal-body">
						<div class="form-group">
							<input type="hidden" value="null" id="repair" /> <label
								for="inputEmail3" class="col-sm-2 control-label">团队名称</label>
							<div class="col-sm-8">
								<input class="form-control" id="projectname" name="teamName"
									value="${team.teamName}" placeholder="" readonly="readonly">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">成立人</label>
							<div class="col-sm-5">
								<input class="form-control" id="name" name="foundName"
									value="${team.foundName}">
							</div>
						</div>

						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">指导老师</label>
							<div class="col-sm-8">
								<input type="text" class="form-control" id="address"
									name="teacher" placeholder="" value="${team.teacher}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">学生负责人</label>
							<div class="col-sm-5">
								<input class="form-control" id="budget" name="teamLeader"
									placeholder="" value="${team.teamLeader}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">团队邮箱</label>
							<div class="col-sm-5">
								<input class="form-control" id="budget" name="teamEmail"
									type="email" placeholder="" value="${team.teamEmail}">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">团队简介</label>
							<div class="col-sm-8">
								<textarea class="form-control" rows="8" id="reason"
									name="teamIntroduce">${team.teamIntroduce}</textarea>
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
		$('#teamModal').modal('show');
	})
</script>
</html>
