package integration;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BabboDAO;
import dao.BabboDAOImpl;
import dao.ConsegnaDAO;
import dao.ConsegnaDAOImpl;
import dao.DonoDAO;
import dao.DonoDAOImpl;
import model.Babbo;
import model.Consegna;
import model.Dono;

/**
 * Servlet implementation class Babbi
 */
@WebServlet("/api/babbi")
public class Babbi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BabboDAO repoBabbo;
    private DonoDAO repoDono;
    private ConsegnaDAO repoConsegna;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Babbi() {
        super();
        this.repoBabbo = new BabboDAOImpl();
        this.repoDono = new DonoDAOImpl();
        this.repoConsegna = new ConsegnaDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			ArrayList<Babbo> babbi = this.repoBabbo.getBabbi();
			response.getWriter().append(babbi.toString());
			
			response.getWriter().append(this.repoDono.getDoni().toString());
			
			response.getWriter().append(this.repoConsegna.getConsegne().toString());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Dono d1 = new Dono();
		d1.setDesc("ps4");
		
		Dono d2 = new Dono();
		d2.setDesc("switch");
		
		Babbo b1 = new Babbo();
		b1.setNome("babbo1");
		b1.setPassword("password");
		
		Babbo b2 = new Babbo();
		b2.setNome("babbo2");
		b2.setPassword("password2");

		try {
			this.repoBabbo.addBabbo(b1);
			this.repoBabbo.addBabbo(b2);
			
			this.repoDono.addDono(d1);
			this.repoDono.addDono(d2);
			
			Consegna consegna1 = new Consegna();
			consegna1.setBabbo(this.repoBabbo.getBabbo(1));
			consegna1.setDono(this.repoDono.getDono(1));
			consegna1.setBambino("ali");
			

			Consegna consegna2 = new Consegna();
			consegna2.setBabbo(this.repoBabbo.getBabbo(2));
			consegna2.setDono(this.repoDono.getDono(1));
			consegna2.setBambino("marco");

			
			Consegna consegna3 = new Consegna();
			consegna3.setBabbo(this.repoBabbo.getBabbo(1));
			consegna3.setDono(this.repoDono.getDono(2));
			consegna3.setBambino("pippo");
			
			this.repoConsegna.addConsegna(consegna1);
			this.repoConsegna.addConsegna(consegna2);
			this.repoConsegna.addConsegna(consegna3);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		doGet(request, response);
	}

}
