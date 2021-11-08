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
	
	public Libro getLibroById(int id) {
		
		Libro l = null;
		this.conn = database.connetti();
		try {
			this.stat = this.conn.createStatement();
			
			this.rs = this.stat.executeQuery("select * from libro where id = " + id);
			
			this.rs.next();//mi sposto sul primo record dela query
			
			int idLibro = rs.getInt("id");
			String titolo = rs.getString("titolo");
			Double prezzo = rs.getDouble("prezzo");
			
			l = new Libro(idLibro, titolo, prezzo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
		
	}
	
	public void addLibro(Libro l) {
		this.conn = database.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.stat.executeUpdate("insert into libro (titolo, prezzo, prezzo_iva ) values ("
					+ "'"+l.getTitolo()+"', "+l.getPrezzo()+", 11)");
			System.out.println("libro aggiunto");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delLibro(Libro l) {
		this.conn = database.connetti();
		try {
			this.stat = this.conn.createStatement();
			this.stat.executeUpdate("delete from libro where id=" +l.getId());
			System.out.println("libro eliminato");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public static void main(String[] args) {
		Libro l = new Libro(31, "I promessi sposi", 10);
		LibroDAO ld = new LibroDAO();
		//ld.addLibro(l);
		ld.delLibro(l);
	}
	
}
