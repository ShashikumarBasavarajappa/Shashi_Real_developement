<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Checking
		<%
		out.print(2 * 5);
	%>
	</h1>
	<form action="welcome.jsp">
		<input type="text" name="uname"> <input type="submit"
			value="submit" />
	</form>
	<br />
	<form action="welcome">
		<input type="text" name="uname"> <input type="submit"
			value="go"><br />
	</form>
</body>
</html>