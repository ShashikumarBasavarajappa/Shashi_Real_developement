<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
	.error{
		color : #ff000;
	}
	.errorblock{
		color : #0000;
		background-color: #ffEEEE;
		border: 3px solid #ff000;
		padding: 8px;
		margin: 16px;
	}
</style>
</head>
<body>
	<%@ include file="Design_page.jsp"%>

	<div class="container">
		<div class="jumbotron">
			<h5>Checking Validation code</h5>
			<ul>
				<li>Spring We can validate the Model code what ever passes.</li>
				<li>Business Logic Valdation and also password and reenter
					Validation and all</li>
				<li>We need Validate all these things in Model not in
					Controller or entity</li>
				<li><strong>Let See Below One example for the Error
						Handling</strong></li>

				<li>we Have Two ways of the Validation
					<ul>
						<li>Validator Interface</li>
						<li>Valdator Until Classes</li>
						<li>BInding Class</li>
						<li>Simplle form Controller</li>
						
					</ul>
				</li>
				<li>JSR Specification For the Java Validation not for the
					Spring</li>
					<li>JSR validation in Annotation Based Validator </li>
					<li> JSR also Has Hibernet Validator </li>
					<li> POJO based validation </li>
				<h3> Summary </h3>
				
				<li> Overall We Talk about the Validation Here </li>
				<li>Validator INterface </li>
				<li> We can Use Any of the validator JSR, or Hibernet Validator </li>		
			</ul>
			
		</div>
		
		<form action="Spring_validation_page" method="post">
			<form:errors path="*" cssClass="errorblock" element="div"></form:errors>
			<input type="number" name="ph_no" />
			<form:errors cssClass="error" path="ph_no"></form:errors>
			<button class="btn btn-info" value="Try Validator" type="submit"> Try Validator </button>
		</form>
		
		<form:form modelAttribute="reg_ph" action="Spring_validation_page">
			<form:input path="ph_no"/>
			<form:button > Check Validation</form:button>
		
		</form:form>
		
		
	</div>
</body>
</html>