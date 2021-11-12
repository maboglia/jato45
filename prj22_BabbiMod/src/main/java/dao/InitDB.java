package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

import database.DB;

public class InitDB {
	
	static DB db = new DB();
	static Connection connessione;
	static Statement stat;
	
	public static void creaTabellaBabbi() {
		String query = "create table if not exists babbi("
				+ "id INT AUTO_INCREMENT,"
				+ "nome varchar(10),"
				+ "password varchar(10),"
				+ "PRIMARY KEY(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaTabellaDoni() {
		String query = "create table if not exists doni("
				+ "id INT AUTO_INCREMENT,"
				+ "descrizione varchar(10),"
				+ "PRIMARY KEY(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void creaTabellaConsegne() {
		String query = "create table if not exists consegne("
				+ "id INT AUTO_INCREMENT,"
				+ "id_babbo INT,"
				+ "id_dono INT,"
				+ "bambino varchar(10),"
				+ "PRIMARY KEY(id) )";
		
		connessione = db.getConnection();
		try {
			stat = connessione.createStatement();
			stat.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		creaTabellaBabbi();
		creaTabellaDoni();
		creaTabellaConsegne();
	}
}
