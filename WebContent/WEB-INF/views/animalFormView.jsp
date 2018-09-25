<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Andrew's PetStore- nowe zwierzę</title>
	<style>
		.main {
			background-color: blue;
			border: 2px solid #009;
			text-align: center;
		}
	</style>
</head>
<body style="background-color: #AAF">
	<div class="main">
		<h2>${title}</h2>
	</div>
	<form:form method="POST" action="/PetStore/newAnimal" 
		modelAttribute="animal">
	
		<table>
			<tr>
				<td><form:label path="id">ID zwierzaka:</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Imię zwierzaka:</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>
					<form:label path="sound">
						Jaki dźwięk wydaje zwierzę:
					</form:label>
				</td>
				<td><form:input path="sound" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Dodaj" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>