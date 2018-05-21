<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Design_page.jsp"%>
	<div class="container">
		<div class="jumbotron">
			<p>Here we showed how controller will work and also what is the
				use of the controller.</p>
			<p class="text-warning">Please click on any of the link below to
				understand code in realastic way</p>

			<ul class="fa-ul">
				<li><i class="fa-li fa fa-check-square"></i>Controller is the
					code in which only URL Mapped between the XMl and Controller
					Mapping</li>
				<li><i class="fa-li fa fa-check-square"></i>Most of the
					developers will prefer to use the Request URL Mapping Style</li>
				<li><i class="fa-li fa fa-spinner fa-spin"></i>URL
					COnfiguration</li>
				<li><i class="fa-li fa fa-square"></i>Mapping Data</li>
			</ul>
		</div>
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong>1. Controoler Complete Information</strong>
				</div>
				<div class="panel-body">
					<p>We Can setup the Default Page By setting Root Path in URL
						mapping Code. Example : RequestMapping(value="/").</p>

					<p>We Have so Many Annotation, For Example to Identify the
						Controller use
					<pre>@Controller</pre>
					So that Maped XMl can guess this is the Controller easily.
					</p>

					<p>Beauty of the Spring is everything in PoJO Class Way so that
						it's good check</p>
				</div>
			</div>
		</div>
		<p>
			<Strong>2. Here We Are Doing the Controller Post Request
				Work</Strong>
		</p>
		<br />
		<p>Below code we implementted using the ModelAttribute, but keep
			it mind we need send path CommandName , (same name as the
			ModelAttribute Name)</p>
		<form action="Spring_controller_request_mapping_post" method="Post">
			<label> First Name : </label> <input type="text" name="first_name"
				id="first_name"> <label> Last Name : </label> <input
				type="text" name="last_name" id="last_name">
			<button class="btn btn-primary" value="Submit" type="submit">
				try It Once</button>
		</form>


		<p>
			<Strong>3. Summary Of Controller</Strong>
		<p>Controller duties</p>
		<p>Annotations like
		<ul>
			<li>Controller</li>
			<li>RequestMapping</li>
			<li>ModelAttribute</li>
		</ul>
		</p>
	</div>
</body>
</html>