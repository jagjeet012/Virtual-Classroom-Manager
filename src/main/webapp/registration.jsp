<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Virtual Classroom Manager</title>
</head>

<p>Virtual Classroom Manager</p>

<body>
	<div>${errorMessage}</div>
	<form:form method='post' action='register' modelAttribute='user'>
		<table>
			<tr>
				<td>Username: <font color='red'><form:errors
							path='userName' /></font></td>
			</tr>
			<tr>
				<td><form:input path='userName' /></td>
			</tr>
			<tr>
				<td>Password: <font color='red'><form:errors
							path='password' /></font></td>
			</tr>
			<tr>
				<td><form:password path='password' /></td>
			</tr>
			<tr>
				<td>Role: <font color='red'><form:errors path='role' /></font></td>
			</tr>
			<tr>
				<td><form:input path='role' /></td>

			</tr>
			<tr>
				<td>Please enter <br>
				0 = student
				1 = faculty</td>
			</tr>


			<tr>
				<td><input type='submit' value='Register' /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>