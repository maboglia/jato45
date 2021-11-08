<%@page import="model.Libro"%>
<%@page import="dao.LibroDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Libreria</h1>

<table>

	<%
		LibroDAO ld = new LibroDAO();
		for (Libro l :  ld.getLibri()){
			%>
			<tr>
				<td><%= l.getTitolo() %></td>
			</tr>		
			<%
		}
	
	
	%>


</table>

</body>
</html>