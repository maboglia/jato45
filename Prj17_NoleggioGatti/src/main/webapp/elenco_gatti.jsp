<%@page import="model.Gatto"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp" %>

<%
	ArrayList<Gatto> gatti = (ArrayList<Gatto>) request.getAttribute("elenco");

	if (gatti == null){
		out.print("devi passare da controller (servlet)");
	} else {
		for(Gatto g : gatti){
			out.print("<img src='" +g.getFoto() + "'><br>");
		}
	}

%>


<%@ include file="footer.jsp" %>
