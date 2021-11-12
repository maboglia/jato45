package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Babbo;
import model.Consegna;
import model.Dono;

public class ConsegnaDAOImpl implements ConsegnaDAO {

	DB db = new DB();
	DonoDAO donoDAO = new DonoDAOImpl();
	BabboDAO babboDAO = new BabboDAOImpl();
	
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public void addConsegna(Consegna consegna) throws SQLException {
		
		this.connection = this.db.getConnection();
		this.ps = this.connection.prepareStatement(INSERT);
		this.ps.setInt(1, consegna.getBabbo().getId());
		this.ps.setInt(2, consegna.getDono().getId());
		this.ps.setString(3, consegna.getBambino());
		this.ps.execute();
	}

	@Override
	public void updateConsegna(Consegna consegna) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteConsegna(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Consegna getConsegna(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Consegna> getConsegne() throws SQLException {
		
		ArrayList<Consegna> consegne = new ArrayList<Consegna>();
		
		this.connection = this.db.getConnection();
		this.ps = this.connection.prepareStatement(FIND_ALL);
		this.rs = this.ps.executeQuery();
		while (rs.next()) {
			Consegna consegna = new Consegna();
			consegna.setId(rs.getInt("id"));
			
			Babbo babbo = babboDAO.getBabbo(rs.getInt("id_babbo"));
			consegna.setBabbo(babbo);
			
			Dono dono = donoDAO.getDono(rs.getInt("id_dono"));
			consegna.setDono(dono);
			
			consegna.setBambino(rs.getString("bambino"));
			
			consegne.add(consegna);
		}
		
		return consegne;
	}

}
