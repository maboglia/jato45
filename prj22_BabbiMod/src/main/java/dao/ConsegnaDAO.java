package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Babbo;
import model.Consegna;

public interface ConsegnaDAO {
	
	String FIND_ALL = "select * from consegne";
	String FIND_ONE = "select * from consegne where id = ?";
	String INSERT = "insert into consegne(id_babbo, id_dono, bambino) values(?,?,?)";
	String UPDATE = "update consegne set id_babbo = ? , id_dono = ?, bambino = ? where id = ?";
	String DELETE = "delete from consegne where id = ?";
	
	void addConsegna(Consegna consegna) throws SQLException;
	void updateConsegna(Consegna consegna) throws SQLException;
	void deleteConsegna(int id) throws SQLException;
	Consegna getConsegna(int id) throws SQLException;
	ArrayList<Consegna> getConsegne() throws SQLException;
	
}
