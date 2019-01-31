<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Faculty page</title>
</head>
<body>

<h1>Faculty Page</h1>
	<form action="createAnswer" method="post">
		<label for="userId">User Id</label>
		<input type="text" name="userId" value = '${userId}'/><br>
		<label for="questionnaireId">Questionnaire Id</label>
		<input type="text" name="questionnaireId" value = '${questionnaireId}'/><br>
		<label for="answer">Answer</label>
		<input type="text" name="answer" /><br><br>
		
		<input type='submit' value='Answer' />
	</form>
	
	<form action="addStudyMaterial" method="post">
	    <label for="userId">User Id</label>
		<input type="text" name="userId" value = '${userId}'/><br>
		<label for="ppt">Ppt</label>
		<input type="text" name="ppt"/><br>
		<label for="videoLessons">Video Lessons</label>
		<input type="text" name="videoLessons"/><br>
		<input type='submit' value='submit' />
	</form>

</body>
</html>