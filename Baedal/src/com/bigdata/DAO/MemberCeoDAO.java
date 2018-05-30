package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberCeoDAO {
	public DataSource dataSource = null;
	
	public MemberCeoDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public boolean IdCheck(String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT id FROM restaurant WHERE id=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return false;
	}
	
	public void CeoInsert(String id, String password, String name, String type, String address, String phone, String tip, String image) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into restaurant(id, password, name, type, address, phone, tip, image) values (?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, name);
			preparedStatement.setString(4, type);
			preparedStatement.setString(5, address);
			preparedStatement.setString(6, phone);
			preparedStatement.setString(7, tip);
			preparedStatement.setString(8, image);
			preparedStatement.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	
}
