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
<h1>Scheda Libro</h1>

<%
	int idLibro = 1;
	if (request.getParameter("libroCercato") != null){
		idLibro = Integer.parseInt(request.getParameter("libroCercato"));  ;
	}

	LibroDAO ld = new LibroDAO();
	Libro l = ld.getLibroById(idLibro);

	out.print(l);
%>


</body>
</html>