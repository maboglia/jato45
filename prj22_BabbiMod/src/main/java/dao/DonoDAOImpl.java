package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.DB;
import model.Dono;

public class DonoDAOImpl implements DonoDAO {
	
	DB db = new DB();
	Connection connection;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public void addDono(Dono dono) throws SQLException {
		
		this.connection = this.db.getConnection();
		this.ps = this.connection.prepareStatement(INSERT);
		this.ps.setString(1, dono.getDesc());
		this.ps.execute();
	}

	@Override
	public void updateDono(Dono dono) throws SQLException {

	}

	@Override
	public void deleteDono(int id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Dono getDono(int id) throws SQLException {
		this.connection = this.db.getConnection();
		this.ps = this.connection.prepareStatement(FIND_ONE);
		this.ps.setInt(1, id);
		this.rs = this.ps.executeQuery();
		this.rs.next();
		
		Dono dono = new Dono();
		dono.setId(this.rs.getInt("id"));
		dono.setDesc(this.rs.getString("descrizione"));
		return dono;
	}

	@Override
	public ArrayList<Dono> getDoni() throws SQLException {
		
		ArrayList<Dono> doni = new ArrayList<Dono>();
		
		this.connection = this.db.getConnection();
		this.ps = this.connection.prepareStatement(FIND_ALL);
		this.rs = this.ps.executeQuery();
		while (rs.next()) {
			Dono dono = new Dono();
			dono.setId(this.rs.getInt("id"));
			dono.setDesc(this.rs.getString("descrizione"));
			
			doni.add(dono);
		}
		
		return doni;
	}

}
