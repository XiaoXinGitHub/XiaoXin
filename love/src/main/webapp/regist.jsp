<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>申请</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/commons.css" />
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
	<script src="js/jquery.min.js" type="text/javascript"></script>
</head>
<body>
	<div class="wrap login_wrap">
		<div class="content">
			<div class="logo"></div>
			<div class="login_box">
				<div class="login_form">
					<div class="login_title">申请成为志愿者</div>
					<form method="post" id="registform">
						<div class="form_text_ipt">
							<input name="uUsername" id="username" type="text"
								placeholder="用户名"><label style="color: red"></label>
						</div>
						<div class="form_text_ipt">
							<input name="uPwd" id="pwd1" type="password" placeholder="密码">
							<label style="color: red"></label>
						</div>
						<div class="form_text_ipt">
							<input name="pwdagin" id="pwdagin" type="password"
								placeholder="重复密码"><label style="color: red"></label><label style="color: red"></label>
						</div>
						<div class="form_text_ipt">
							<input name="uTruename" type="text" placeholder="姓名"><label style="color: red"></label>
						</div>
						<div class="form_text_ipt">
							<input name="uEmail" id="email" type="email" placeholder="邮箱"><label style="color: red"></label>
						</div>
						<div class="form_text_ipt">
							<input name="uSId" id="sid" type="text" placeholder="学号"><label style="color: red"></label>
						</div>
						<div style="margin: 20px; text-align: center">
							<input type="checkbox"  name="check" value="同意"><a href="#"
								 font-size: 20px" class="check">《志愿者申请需知》</a>
						</div>
						<div class="form_btn">
							<button type="submit">申请</button>
						</div>
					</form>
					<div class="form_reg_btn">
						<span>已有帐号？</span><a href="login.jsp">马上登录</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 查看注册须知 -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title text-center" id="myModalLabel">志愿者宣誓</h4>
				</div>
				<div class="modal-body" align="center">
				<p>我愿意成为一名光荣的志愿者</p>
				<p>我承诺：</p>
				<p>尽己所能，不计报酬，帮助他人，</p>
				<p>服务社会，践行志愿精神，</p>
				<p>传播先进文化，</p>
　　　　			<p>为建设团结互助、平等友爱</p>
				<p>共同前进的美好社会贡献力量。</p>
				</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<script type="text/javascript" src="js/jquery.serializejson.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#registform').validate({
				//debug : true, 只会校验表单不会提交表单
				onkeyup : false,/*取消键盘监听校验*/
				/*当所有的表单校验通过之后执行提交的功能*/
				submitHandler : function(form) {
					var datas = $(form).serializeJSON();
					//删除了datas中json对象的pwdagin的属性
					delete datas['pwdagin'];
					delete datas['check'];
					//采用ajax形式发送
					 $.post('regist.action', {
						"datas" : JSON.stringify(datas)
					}, function(data) {
						alert("欢迎您加入我们志愿者的大家庭!");
						location.href = 'login.jsp';
					}, 'json'); 	
				},
				errorPlacement : function(error, element) {
					error.appendTo(element.next());	
				},
				rules : {
					uUsername : {
						required : true,
						/*发送ajax请求校验用户名是否存在:服务器直接响应true或者false*/
						remote : {
							url : "checkname.action",
							type : "post",
							data : {
								username : function() {
									return $('#username').val();
								}
							}
						}
					}, /*name值*/
					uEmail : {
						required : true,
						email : true,
						remote : {
							url : "checkemail.action",
							type : "post",
							data : {
								username : function() {
									return $('#email').val();
								}
							}
						}
					},
					uSId : {
						required : true,

						remote : {
							url : "checksid.action",
							type : "post",
							data : {
								username : function() {
									return $('#sid').val();
								}
							}
						}
					},
					uPwd : {
						required : true,
						minlength : 6
					},
					pwdagin : {
						equalTo : '#pwd1'
					},
					uTruename : {
						required:true
					},
					check : {
						required:true
					}
				},
				messages : {
					uUsername : {
						required : "用户名必须填写",
						remote : jQuery.validator.format("该用户名被占用")

					},
					uEmail : {
						required : "邮箱必须填写",
						email : "邮箱格式错误",
						remote : jQuery.validator.format("该邮箱已经注册")
					},
					uPwd : {
						required : "密码必须填写",
						minlength : "长度不能少于6位"
					},
					uSId : {
						required : "学号必须填写",
						remote : jQuery.validator.format("该学号已经注册")
					},
					pwdagin : {
						equalTo : "重复密码不正确"
					},
					uTruename : {
						required : "姓名必须填写"
					},check : {
						required:"请认真阅读并同意"
					}
					
				},
				/*设置成功的消息*/
				success : function(label) {
					// set &nbsp; as text for IE
					label.html("&nbsp;").addClass("checked");
					label.text('ok');
					}
			});
		});
	</script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script >
	$(".check").click(function() {
		$('#myModal').modal('show');
	})
	</script>
</body>
</html>

