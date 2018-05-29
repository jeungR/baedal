package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CustomerUpdateDAO {
	public DataSource dataSource = null;
	
	public CustomerUpdateDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/mvc");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	 
	public void CustomerUpdate(String password, String address, String mobile, String name, String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update customer set password = ?, address = ?, mobile = ?, name = ? where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);;
			preparedStatement.setString(2, address);;
			preparedStatement.setString(3, mobile);;
			preparedStatement.setString(4, name);;
			preparedStatement.setString(5, id);;
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
