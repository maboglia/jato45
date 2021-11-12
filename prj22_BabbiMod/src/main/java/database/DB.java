package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	//the specific name of the database
	private final String DB_NAME = "Its2020";
	private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;
	private final String USERNAME = "Its2020";
	private final String PASSWORD = "Its2020";
	private Connection connessione = null;
	
	private Connection connect() {
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}			
				this.connessione = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
				System.out.println("Connected to database");
				
		} catch (SQLException e) {
			System.err.println("Connection failed");
			e.printStackTrace();
		}
		
		return this.connessione;
	}
	
	public void disconnect() {
		if (this.connessione != null) {
			try {
				this.connessione.close();
				System.out.println("Disconnected from database");
			} catch (SQLException e) {
				System.err.println("Disconnection failed");
			}
		}
	}
	
	public Connection getConnection() {
		if (this.connessione == null) {
			this.connessione = this.connect();
		}
		
		return this.connessione;
	}
}