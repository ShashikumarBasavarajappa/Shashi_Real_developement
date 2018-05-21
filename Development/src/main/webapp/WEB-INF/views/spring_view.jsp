<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Design_page.jsp"%>

<div class="container">
	<div class="jumbotron">
		<p><strong>These are the Below concept we learned as part of the spring development</strong></p>
		<ul>
			<li> Views are How we are displaying data from the MInddle tier(Controller).</li>
			<li> All Best developer will place the JSP in seperate folder. </li>
			<li> Main view declaration bean clas="org.springframework.web....INternalviewREsolver" and specify the prefix and suffix here.</li>
			<li> We can create our own viewresolver because this is custom One </li>
			<li> Many more view resolver are exist in a system eg : freemarkerview resolver, contentnegotiating resolver etc.. </li>
			<li>Chaining
			<ul>
				<li> Here we can do the chaining in the different server </li>
				<li> when we return 'forward:new_method_name'</li>
				<li> So this is one way of doing Chaining </li>
				<li> Main Advantage of the forward here is , it will Stop Submitting form Again and again so the No risk will we there </li>
				
			</ul>
			</li>
			
			<li><Strong>PLease see the example for Chaining Forward Example </Strong> </li>
		</ul>
		
		<p> <b>Overall Summary </b></p>
		<ul>
			<li>Different View technologies</li>
			<li>JSP Location</li>
			<li>View Resolvers</li>
			<li>Static Views </li>
			<li>Way to Redirect </li>
			
		</ul>
		
	</div>	
	
	
	<form action="spring_forward" method="Post">
		<input type="text" name="first_name" id="first_name">
		<input type="text" name="last_name" id="last_name">
		<input type="submit" value="submit" />
	</form>
	
		
</div>

</body>
</html>