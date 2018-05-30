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

public class MenuCheckDAO {
	public DataSource dataSource = null;
	
	public MenuCheckDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public FoodDTO selectMenuView(String codeCompare) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "select * from baedal.food where code = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, codeCompare);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String code = resultSet.getString("code");
				String name = resultSet.getString("name");
				int price = resultSet.getInt("price");
				String date = resultSet.getString("date");
				String image = resultSet.getString("image");
				String type = resultSet.getString("type");
				String restaurantcode = resultSet.getString("restaurant_code");
				String cookingtime = resultSet.getString("cookingtime");
				
				FoodDTO dto = new FoodDTO(code, name, price, date, image, type, restaurantcode, cookingtime);
				return dto;
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
		return null;
		
		
	}
	
	public void SumPrice() {
		
	}
	
	public void BasketInsert(String food_code, String food_restaurant_code, String number,
			String customer_code) {
		// 주문하기, 장바구니 담기 클릭시 Insert 되어야함
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into basket(food_code, food_restaurant_code, customer_code, number) values (?, ?, ?, ?) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, food_code);
			preparedStatement.setString(2, food_restaurant_code);
			preparedStatement.setString(3, customer_code);
			preparedStatement.setString(4, number);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
