package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Gatto;

@WebServlet("/gatti")
public class GattiCtrl extends HttpServlet {
	
	UtenteCtrl utenti = new UtenteCtrl();
	DBGatti gatti = new DBGatti();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Gatto> elenco =  gatti.getGatti();
		
		request.setAttribute("elenco", elenco);
		request.getRequestDispatcher("elenco_gatti.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("username")!=null && request.getParameter("password")!=null) {
			boolean logged = utenti.login(request.getParameter("username"), request.getParameter("password"));
			if (logged) {
				response.getWriter().append("loggato");
			} else {
				response.getWriter().append("NON loggato");
			}
		}
		
	}

}
