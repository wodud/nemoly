<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>css를 이용한 layout</title>
<script type="text/javascript" src="${initParam.root}js/jquery-1.11.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="${initParam.root}css/home.css">
</head>
<body>
<div id="container">
	<div id="header"><tiles:insertAttribute name="header"/></div>
	<div id="left"><tiles:insertAttribute name="left"/></div>
	<div id="main"><tiles:insertAttribute name="main"/></div>
	<div id="footer"><tiles:insertAttribute name="footer"/></div>
</div>
</body>
</html>