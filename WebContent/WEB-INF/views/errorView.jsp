<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Andrew's PetStore- błąd</title>
	<style>
		.main {
			color: #F00;
			background-color: #A00;
			border: 2px solid #700;
			text-align: center;
		}
	</style>
</head>
<body style="background-color: #FAA">
	<div class="main">
		<h2>${title}</h2>
	</div>
	<c:forEach items="${errorsList}" var="error">
		${error} <br />
	</c:forEach>
</body>
</html>