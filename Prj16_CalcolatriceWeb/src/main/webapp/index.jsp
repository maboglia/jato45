<%@page import="controller.Calcolatrice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String titolo = "Mia Calcolatrice"; %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= titolo %></title>
<style type="text/css">
	#result {width:150px; height: 150px; border: 5px solid red; padding: 10px;
	font-size: 3em;
	}
</style>
</head>
<body>
	<h1><%= titolo %></h1>
	
	<form method="post" action="">
		<input type="number" name="op1"  placeholder="inserisci operando 1">
		<br>
		<input type="number" name="op2" placeholder="inserisci operando 2">
		<br>
		+ <input type="radio" name="operazione" value="+">
		- <input type="radio" name="operazione" value="-">
		* <input type="radio" name="operazione" value="*">
		/ <input type="radio" name="operazione" value="/">
		<br>
		<input type="submit" value="Calcola">
	</form>
	
	<%
			double risultato = 0;
		if (request.getParameter("op1") != null && request.getParameter("op2") != null ){
			
			double op1 = Double.parseDouble(request.getParameter("op1"));
			double op2 = Double.parseDouble(request.getParameter("op2"));
			
			String operazione = request.getParameter("operazione");
			
			switch(operazione){
				case "+":
					risultato = Calcolatrice.addizione(op1, op2);
				break;
				case "-":
					risultato = Calcolatrice.sottrazione(op1, op2);
				break;
				case "*":
					risultato = Calcolatrice.moltiplicazione(op1, op2);
				break;
				case "/":
					risultato = Calcolatrice.divisione(op1, op2);
				break;
					
			}

			
		}
	
	
	%>
	
	<div id="result">
	
		<%= risultato %>
	</div>
	
	
	
</body>
</html>