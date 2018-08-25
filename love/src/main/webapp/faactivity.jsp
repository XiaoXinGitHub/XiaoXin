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
	<jsp:include page="header-leader.jsp"></jsp:include>
	<div class="new">
		<div class="new_content">

			<h2 class="text-center" style="padding: 20px 0px;">${user.uTeamName}</h2>
			<div class="new_title">

				<%-- <input type="text" name="aTeamname"  value="${user.uTeamName}" disabled class="form-control"> --%>

				<form action="post.action" method="post"
					class="form-horizontal"  role="form"
					id="applyform"  accept-charset="UTF-8">
					<div class="form-group">
						<input type="hidden" value="null" id="repair" /> <label
							for="inputEmail3" class="col-sm-2 control-label">活动标题<span
							class="setTag">*</span></label>
						<div class="col-sm-8">
							<input class="form-control" id="projectname" name="aActivity"
								placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">负责团队<span
							class="setTag">*</span></label>
						<div class="col-sm-5">
							<input class="form-control" name="aTeamname" value="${user.uTeamName}" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">负责人<span
							class="setTag">*</span></label>
						<div class="col-sm-5">
							<input class="form-control" id="name" name="aManager" value="">
						</div>
					</div>

					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">活动时间<span
							class="setTag">*</span></label>
						<div class="col-sm-8">
							<input type="date" class="form-control" id="address"
								name="aDotime" placeholder="">
						</div>
					</div>

					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">活动地点<span
							class="setTag">*</span></label>
						<div class="col-sm-5">
							<input class="form-control" id="budget" name="aAddress"
								placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">活动类型<span
							class="setTag">*</span></label>
						<div class="col-sm-5">
							<select class="form-control" id="baselist" style="height: 40px"
								name="aAtypes">
								<option id="baselistid">请选择</option>
								<option>长期服务基地</option>
								<option>特色活动</option>
								<option>普通活动</option>
							</select>
						</div>
					</div>

					<div class="form-group">
						<label for="inputPassword3" class="col-sm-2 control-label">活动详情<span
							class="setTag">*</span></label>
						<div class="col-sm-8">
							<textarea class="form-control" rows="16" id="reason"
								name="aContent"></textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-12 text-center">
							<button type="reset" class="btn btn-info">重置</button>
							<button type="submit" class="btn btn-danger">提交</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="boot text-center">
		<p>&copy; 2002-2017 湖南农业大学 Hunnan Agriculture University</p>
		<p>校园青年志愿者协会</p>
	</div>
</body>
</html>
