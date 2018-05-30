package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.bigdata.DTO.FoodDTO;
import com.bigdata.DTO.RestaurantDTO;

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
	
	public void CeoUpdate(String id, String password, String name, String address, String phone,
			String type, String tip, String image) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update baedal.restaurant set password = ?, name = ?, address = ?, phone = ?, type = ?, tip = ?, image = ? where id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, phone);
			preparedStatement.setString(5, type);
			preparedStatement.setString(6, tip);
			preparedStatement.setString(7, image);
			preparedStatement.setString(8, id);
			preparedStatement.executeUpdate();
			
			System.out.println("dao" + password);
			System.out.println("dao" + name);
			System.out.println("dao" + address);
			
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
	
	public RestaurantDTO CeoUpdateView(String ceo_code){
		RestaurantDTO dtos = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select id, password, name, address, phone, type, tip, image from baedal.restaurant where code = ? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, ceo_code);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String id = resultSet.getString("id");
				String password = resultSet.getString("password");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String phone = resultSet.getString("phone");
				String type = resultSet.getString("type");
				String tip = resultSet.getString("tip");
				String image = resultSet.getString("image");
				
				dtos = new RestaurantDTO(id, password, name, address, phone, type, tip, image);
				
			}
			
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
		return dtos;
	}
	
	
}
