package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.bigdata.DTO.CustomerDTO;
import com.bigdata.DTO.RestaurantDTO;

public class LoginDAO {
public DataSource dataSource = null;
	
	public LoginDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public String loginCustomerCheck(String id, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT code FROM customer WHERE id=? AND password=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) return resultSet.getString("code");
			
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
		
		return "fail";
		
	}
	
	public String loginCeoCheck(String id, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT code FROM restaurant WHERE id=? AND password=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) return resultSet.getString("code");
			
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
		
		return "fail";
	}
	
}
