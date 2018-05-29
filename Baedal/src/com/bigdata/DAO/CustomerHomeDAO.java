package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.bigdata.DTO.RestaurantDTO;

public class CustomerHomeDAO {
	public DataSource dataSource = null;
	
	public CustomerHomeDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<RestaurantDTO> list(String typeCompare){
		ArrayList<RestaurantDTO> dtos = new ArrayList<RestaurantDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select name, image, tip, type from restaurant where type=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, typeCompare);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				String name = resultSet.getString("name");
				String image = resultSet.getString("image");
				String tip = resultSet.getString("tip");
				String type= resultSet.getString("type");
				
				
				RestaurantDTO dto = new RestaurantDTO(name, image, tip, type);
				dtos.add(dto);			
				
			}
			}
		catch(Exception e) {
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
	
	
	public RestaurantDTO RestaurantView(String restaurant_type) {
		RestaurantDTO dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT image, name, tip FROM restaurant WHERE type = " + restaurant_type;
			
			
			preparedStatement = connection.prepareStatement(query);
			//preparedStatement.setString(1, restaurant_type);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				String name = resultSet.getString("name");
				String image = resultSet.getString("image");
				String tip = resultSet.getString("tip");
				String type = resultSet.getString("type");
				
				dto = new RestaurantDTO(name, image, tip, type);
			
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
		return dto;
		
	
	}
}