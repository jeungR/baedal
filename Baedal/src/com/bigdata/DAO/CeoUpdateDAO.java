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
	
	public void CeoUpdate(String password, String name, String type, String address, String mobile, String image, String ceoid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "update restaurant set password = ?, name = ?, type = ?, address = ?, phone = ?, image = ? where id = " + ceoid;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, type);
			preparedStatement.setString(4, address);
			preparedStatement.setString(5, mobile);
			preparedStatement.setString(6, image);
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
	
	public ArrayList<RestaurantDTO> CeoUpdateView(String ceo_code){
		ArrayList<RestaurantDTO> dtos = new ArrayList<RestaurantDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select id, password, name, address, phone, type, tip, image from baedal.restaurant where ceo_code = "+ ceo_code;
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
				
				RestaurantDTO dto = new RestaurantDTO(id, password, name, address, phone, type, tip, image);
				dtos.add(dto);
				
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
