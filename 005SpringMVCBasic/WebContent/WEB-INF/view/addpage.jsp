<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body>
	Add Page: ${addmessage}
	
	<form:form action="saveFriend.spring" method="POST" >
		<table>
			<tr>
				<td>Id:</td>
				<td><form:input path="id" readonly="true"/> </td>
			</tr>	
		
			<tr>
				<td>Name:</td>
				<td><form:input path="friendName"/> </td>
			</tr>	
			<tr>
				<td>Location:</td>
				<td><form:input path="friendLocation"/> </td>
			</tr>	
			<tr>
				<td ><input type="submit"/> </td>
			</tr>	
			
		
		</table>
	</form:form>
	

	
	
	
</body>
</html>