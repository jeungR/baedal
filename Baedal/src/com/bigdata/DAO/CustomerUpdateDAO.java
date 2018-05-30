package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.bigdata.DTO.CustomerDTO;

public class CustomerUpdateDAO {
	public DataSource dataSource = null;
	
	public CustomerUpdateDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	 
	public void CustomerUpdate(String name, String id, String password,  String mobile, String address) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update baedal.customer set name = ?, password = ?, mobile = ?, address = ? where id = ?";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, mobile);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, id);
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
	
	
	
	public CustomerDTO CustomerSelect(String customerId) {
		CustomerDTO dto = null; //데이터 한줄씩 보임
		Connection connection = null; //연결
		PreparedStatement preparedStatement = null; //준비
		ResultSet resultSet = null; //가져오는 것 
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select name, id, password, mobile, address from baedal.customer where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customerId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String name = resultSet.getString("name");
				String id = resultSet.getString("id");
				String password = resultSet.getString("password");
				String mobile = resultSet.getString("mobile");
				String address = resultSet.getString("address");
				dto = new CustomerDTO(name, id, password, mobile, address);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { //보안사항 추가 - 보안 뚫리기가 쉬움
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}
	
}
