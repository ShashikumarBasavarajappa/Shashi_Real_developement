<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="test_example" method="post">
		<label> First Name : </label> <input type="text" name="first_name"
			id="first_name" /> <input type="submit" value="register" />
	</form>

	<form action="Send_Redirect" method="post">
		<label> Search Param : </label> <input type="text" name="last_name"
			id="last_name" /> <input type="submit" value="search_data" />

	</form>

	<br />
	<br />

	<h1>Welcome to Login App by Cookie</h1>
	<a href="login.jsp">Login</a>
	<a href="LogoutServlet"> Logout</a>|
	<a href="ProfileView"> Profile View</a>|
	<a href="hidden_parameter.jsp"> Hidden data checking</a>

	<br />
	<br />

	<h1>Login App using HttpSession</h1>
	<a href="session_login_logout.jsp">Login</a>|
	<a href="LogoutSessionServlet">Logout</a>|
	<a href="ProfileServlet">Profile</a>

	<h1>Checking Filter</h1>
	<form action="servlet12">
		Name:<input type="text" name="name" /><br /> Password:<input
			type="password" name="password" /><br /> <input type="submit"
			value="login">

	</form>

	<br />
	<br />

	<a href="EV"> Shashi click</a>
	<a href="Single_threaded"> check thread</a>

	<br />
	<br />

	<form action="SendMail" method="get">
		To:<input type="text" name="to" /><br /> Subject:<input type="text"
			name="subject"><br /> Text:
		<textarea rows="10" cols="70" name="msg"></textarea>
		<br /> <input type="submit" value="send" />
	</form>
</body>
</html>