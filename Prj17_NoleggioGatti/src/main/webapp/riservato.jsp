<% 

if (session.getAttribute("userLogged")!=null){
	
	out.print("contenuto riservato");
	
} else {
	response.sendRedirect("index.jsp");
}


%>