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

public class MenuSelectDAO {
	public DataSource dataSource = null;
	
	public MenuSelectDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	

	public ArrayList<FoodDTO> MenuView(){
		ArrayList<FoodDTO> dtos = new ArrayList<FoodDTO>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from food";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String code = resultSet.getString("code");
				String name = resultSet.getString("name");
				int price = resultSet.getInt("price");
				String date = resultSet.getString("date");
				String image = resultSet.getString("image");
				String type = resultSet.getString("type");
				String restaurant_code = resultSet.getString("restaurant_code");
				String cookingtime = resultSet.getString("cookingtime");
				
				FoodDTO dto = new FoodDTO(code, name, price, date, image, type, restaurant_code, cookingtime);
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
