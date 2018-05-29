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
import com.bigdata.DTO.OrderReportDTO;

public class CeoHomeDAO {
	public DataSource dataSource = null;
	
	public CeoHomeDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<OrderReportDTO> OrderReportSearch(String restaurant_code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<OrderReportDTO> orderReportDTOs = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT o.code, c.name, c.mobile, c.address, f.name, m.number\n" + 
					"FROM \n" + 
					"(SELECT `code`, startdate, `time`, customer_code FROM baedal.order WHERE restaurant_code=?) o,\n" + 
					"(SELECT code, name, mobile, address FROM baedal.customer) c,\n" + 
					"(SELECT code, name FROM baedal.food WHERE restaurant_code=?) f,\n" + 
					"(SELECT order_code, food_code, number FROM baedal.menu) m\n" + 
					"WHERE o.`customer_code`=c.`code`\n" + 
					"AND o.code=m.`order_code`\n" + 
					"AND f.`code`=m.`food_code`;";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, restaurant_code);
			preparedStatement.setString(2, restaurant_code);
			resultSet = preparedStatement.executeQuery();
			
			orderReportDTOs = new ArrayList<>();
			if(resultSet.next()) {
				OrderReportDTO orderReportDTO = new OrderReportDTO();
				orderReportDTO.setOrder_code(resultSet.getString("o.code"));
				orderReportDTO.setCustomer_name(resultSet.getString("c.name"));
				orderReportDTO.setCustomer_mobile(resultSet.getString("c.mobile"));
				orderReportDTO.setCustomer_address(resultSet.getString("c.address"));
				orderReportDTO.setFood_name(resultSet.getString("f.name"));
				orderReportDTO.setMenu_number(resultSet.getString("m.number"));
				
				orderReportDTOs.add(orderReportDTO);
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
		
		return orderReportDTOs;
	}
	
	public void OrderOK() {
		
	}
	
	public ArrayList<FoodDTO> MenuInfoSearch(String restaurant_code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<FoodDTO> foodDTOs = null;
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT code, name, price FROM food WHERE restaurant_code=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, restaurant_code);
			resultSet = preparedStatement.executeQuery();
			
			foodDTOs = new ArrayList<>();
			if(resultSet.next()) {
				FoodDTO foodDTO = new FoodDTO();
				foodDTO.setCode(resultSet.getString("code"));
				foodDTO.setName(resultSet.getString("name"));
				foodDTO.setPrice(resultSet.getInt("price"));
				
				foodDTOs.add(foodDTO);
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
		
		return foodDTOs;
	}
	
	public void MenuInfoDelete() {
		
	}
	
	
	
	
}
