package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CeoUpdateDAO {
	public DataSource dataSource = null;
	
	public CeoUpdateDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void CeoUpdate(String password, String name, String type, String address, String phone, String image, String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update restaurant set password = ?, name = ?, type = ?, address = ?, phone = ?, image = ? where id = " + id;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);;
			preparedStatement.setString(2, name);;
			preparedStatement.setString(3, type);;
			preparedStatement.setString(4, address);;
			preparedStatement.setString(5, phone);;
			preparedStatement.setString(6, image);;
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
