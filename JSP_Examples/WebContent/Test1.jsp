<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="Income" scope="session" value="${4000*4}" />
	<c:out value="${Income}" />
	<c:remove var="Income" />
	<p>After changes</p>
	<c:out value="${Income}" />
	<c:out value="${'welcome to java project'}"></c:out>



	<p>Catch Example Changes</p>
	<c:catch var="catchexception">
		<% int x = 0/0; %>
	</c:catch>
	<c:if test="${catchexception != null}">
		<p>The type of the exception ${catchexception}</p>
		<p>There is an exception: ${catchexception.message}
	</c:if>

	<p>Case Statements in Java</p>

	<c:set var="income" scope="session" value="${4000*4}"></c:set>
	<p>
		Your Income Is :
		<c:out value="${income}"></c:out>

		<c:choose>
			<c:when test="${income == 160400}">
			Shashikumar
		</c:when>
			<c:otherwise>
			Income not ok
		</c:otherwise>
		</c:choose>
	<p>Forloop Data</p>

	<c:forEach var="j" begin="0" end="3">
		Item : <c:out value="${j}"></c:out>
	</c:forEach>


	<p> For Deliminators </p>
	<c:forTokens items="Shashi-Kumar-Jakkali" delims="-" var="name">
		 <c:out value="${name}"></c:out>
	</c:forTokens>
	
	<p> Checking redirect Job </p>
	
	 <c:set var="url" value="0" scope="request"/>  
	 
	 <c:if test="${url > 1}">
	 	 <c:redirect url="http://javatpoint.com"/>  
	 </c:if>
	 <c:if test="${url < 1}">
	 	<c:redirect url="www.google.com"></c:redirect>
	 </c:if>

</body>
</html>