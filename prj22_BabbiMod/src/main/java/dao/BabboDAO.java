package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Babbo;

public interface BabboDAO {
	
	String FIND_ALL = "select * from babbi";
	String FIND_ONE = "select * from babbi where id = ?";
	String INSERT = "insert into babbi(nome, password) values(?,?)";
	String UPDATE = "update babbi set nome = ? , password = ? where id = ?";
	String DELETE = "delete from babbi where id = ?";
	
	void addBabbo(Babbo babbo) throws SQLException;
	void updateBabbo(Babbo babbo) throws SQLException;
	void deleteBabbo(int id) throws SQLException;
	Babbo getBabbo(int id) throws SQLException;
	ArrayList<Babbo> getBabbi() throws SQLException;
	
}
