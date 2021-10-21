<!DOCTYPE html>
<%@page import="model.Bicicletta"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<% //scriptlet
		String s = "ciao java";
		Bicicletta b = new Bicicletta();
		
		String[] settimana = {
				"lunedì",
				"martedì",
				"mercoledì",
				"giovedì",
				"venerdì",
				"sabato",
				"domenica",
		};
		
		out.print("<ul>");
		for(String giorno: settimana){
			out.print("<li>" + giorno + "</li>");
		}
		out.print("</ul>");
		
	%>

<h1><%= b.colore %></h1>

<script>console.log('funge');</script>

</body>
</html>