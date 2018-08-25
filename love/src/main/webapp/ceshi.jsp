<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/functions' prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>校园微公益</title>
<script src="js/jquery.min.js"></script>  
<script src="js/jquery.Jcrop.min.js"></script>  
<link rel="stylesheet" href="css/jquery.Jcrop.min.css" type="text/css" />   
</head>
<body>
<form action="upfile.action" method="post"  enctype="multipart/form-data">
<input type="file" name="File">
<input type="submit">
</form>
</body>

