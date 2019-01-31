<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Student page</title>
</head>
<body>

	<h1>Student Page</h1>
	<form action="createQuestion" method="post">
		<label for="userId">User Id</label>
		<input type="text" name="userId" value = '${userId}'/><br>
		<label for="question">Question</label>
		<input type="text" name="question" /><br><br>
		
		<input type='submit' value='question' />
	</form>

</body>
</html>