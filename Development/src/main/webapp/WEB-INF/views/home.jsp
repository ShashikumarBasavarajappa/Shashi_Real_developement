<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check the Speed</title>
</head>
<body>
	<%@ include file="Design_page.jsp"%>

	<div class="container">
		<p>Checking the Speed Of the Different collection in Java ${Greeting}</p>
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<form class="form-inline" action="/action_page.php">
			<input class="form-control mr-sm-2" type="text" placeholder="Search">
			<button class="btn btn-success" type="submit">Search</button>
		</form>
		</nav>
		<br/>
		<br/>
		<div class="jumbotron">
			<h4> Collections</h4>
			<h4> <a href="spring_main">Spring Concepts</a></h4>
			<h4> <a href="spring_security">Spring Security Concepts</a></h4>
		</div>
		
	</div>
</body>
</html>