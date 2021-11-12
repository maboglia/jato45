package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Babbo;
import model.Dono;

public interface DonoDAO {
	
	String FIND_ALL = "select * from doni";
	String FIND_ONE = "select * from doni where id = ?";
	String INSERT = "insert into doni(descrizione) values(?)";
	String UPDATE = "update doni set descrizione = ? where id = ?";
	String DELETE = "delete from doni where id = ?";
	
	void addDono(Dono dono) throws SQLException;
	void updateDono(Dono dono) throws SQLException;
	void deleteDono(int id) throws SQLException;
	Dono getDono(int id) throws SQLException;
	ArrayList<Dono> getDoni() throws SQLException;
	
	
}
