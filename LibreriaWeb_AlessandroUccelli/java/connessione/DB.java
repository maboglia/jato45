package connessione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {   //L'oggetto DB ha il compito di connettere	

	private final String HOST = "jdbc:mysql://localhost:3306/generation"; 
	private final String USER = "app_generation"; 
	private final String PASS = "generation_2021"; 
	
	private Connection conn = null;
	
	public Connection connetti() {
		
		try {
			
			try {
				Class.forName("com.mysql.cj.jdbc.driver");  //la classe class ha un metodo statico che ritorna la classe presa una stringa
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
				
			if(this.conn == null)
				this.conn = DriverManager.getConnection(HOST, USER, PASS);
		} catch (SQLException e) {
			System.err.println("Si è verificato un problema nella connessione " + e.getMessage());
		}
		
		return conn;
	}
	
	public void disconnetti() {
		if(this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				System.err.println("Si è verificato un problema nella disconnessione " + e.getMessage());
			}
		}
	}
}
	
				
