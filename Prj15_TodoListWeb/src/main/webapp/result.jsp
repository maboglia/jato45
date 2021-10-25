<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Todo list</h1>
<ul>
<%
	ArrayList<String> cose = (ArrayList<String>) session.getAttribute("todolist");
	
	for(String c : cose){
		out.print("<li>");
		out.print(c);
		out.print("</li>");
	}

%>
</ul>


</body>
</html>