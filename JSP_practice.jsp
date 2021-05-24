<%@ page language = "java" contentType = "text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Hello World!</title>
</head>
<body>
<%! int runRows = 3; %>
<table>
	<% for(int i = 1; i<=numRows; i++){%>
		<tr>
			<td>This is row: </td>
			<td><%= i %></td>
		</tr>
	<% } %>
</table>
<%@ include = file="JSP_practice.jsp" %>
</body>
</html>
