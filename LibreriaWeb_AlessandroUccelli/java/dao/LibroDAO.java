package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connessione.DB;
import model.Libro;

public class LibroDAO {   //Data Access Object
	
	private Connection conn;
	private Statement stat;
	private ResultSet rs;
	
	private DB database = new DB();
	
	public ArrayList<Libro> getLibri(){
		ArrayList<Libro> libri = new ArrayList<Libro>();
		this.conn = database.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.rs = this.stat.executeQuery("select id, titolo, prezzo from libro;");
			while(rs.next()) {
				int id = rs.getInt("id");
				String titolo = rs.getString("titolo");
				Double prezzo = rs.getDouble("prezzo");
				
				Libro libro = new Libro(id, titolo, prezzo);
				libri.add(libro);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		return libri;
	}
	

}
