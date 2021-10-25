
<% if (request.getParameter("username")!=null && 
request.getParameter("password")!=null
		){ 
		
		if (request.getParameter("username").equals("mauro")  
				&& 
				request.getParameter("password").equals("12345")	
				){
			session.setAttribute("userLogged", "loggato");
		}
		
		%>



<%@ include file="riservato.jsp" %>


<% } else { %>

	<form method="post">
		<input type="text" name="username" placeholder="username">
		<br>
		<input type="password" name="password" placeholder="password">
		<br>
		<input type="submit" value="login">
	</form>
<% } %>