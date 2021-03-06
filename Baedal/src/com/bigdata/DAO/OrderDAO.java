package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.bigdata.DTO.BasketDTO;
import com.bigdata.DTO.CustomerDTO;
import com.bigdata.DTO.RestaurantDTO;

public class OrderDAO {
	public DataSource dataSource = null;

	public OrderDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}



	public ArrayList<BasketDTO> BasketSearch(String customer_code) {
		ArrayList<BasketDTO> dtos = null;
		Connection connection = null; // 연결
		PreparedStatement preparedStatement = null; // 준비
		ResultSet resultSet = null; // 가져오는 것

		try {
			connection = dataSource.getConnection();

			String query = "select baedal.food.name, baedal.food.cookingtime, baedal.basket.code, baedal.basket.number, (basket.number * food.price) subtotalprice "
					+ "from baedal.food, baedal.basket "
					+ "where baedal.basket.customer_code=? and baedal.food.code = baedal.basket.food_code ";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			resultSet = preparedStatement.executeQuery();

			dtos = new ArrayList<BasketDTO>();
			while (resultSet.next()) { // 보안사항 추가
				String food_name = resultSet.getString("food.name");
				String food_cookingtime = resultSet.getString("food.cookingtime");
				String basket_number = resultSet.getString("basket.number");
				int food_price = resultSet.getInt("subtotalprice");
				String code = resultSet.getString("basket.code");
				BasketDTO dto = new BasketDTO(food_name, basket_number, food_price, code, food_cookingtime);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 보안사항 추가 - 보안 뚫리기가 쉬움
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
		return dtos;

	}

	public boolean BasketDelete(String code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "DELETE FROM basket WHERE code=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, code);
			int result = preparedStatement.executeUpdate();

			if (result != 0) {
				return true;
			}

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

		return false;
	}

	public CustomerDTO UserInfoSearch(String customer_Code) {
			CustomerDTO dto = null; //데이터 한줄씩 보임
			Connection connection = null; //연결
			PreparedStatement preparedStatement = null; //준비
			ResultSet resultSet = null; //가져오는 것 
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select mobile, address from customer where code = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, customer_Code);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					String mobile = resultSet.getString("mobile");
					String address = resultSet.getString("address");
					dto = new CustomerDTO();
					dto.setMobile(mobile);
					dto.setAddress(address);
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

	public RestaurantDTO selectTip(String customer_code) {
		Connection connection = null; 
		PreparedStatement preparedStatement = null; 
		ResultSet resultSet = null; 
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT code, tip FROM restaurant WHERE code=(SELECT food_restaurant_code FROM basket WHERE customer_code =? LIMIT 1);";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			resultSet = preparedStatement.executeQuery();
			
			RestaurantDTO restaurantDTO = new RestaurantDTO();
			if(resultSet.next()) {
				restaurantDTO.setCode(resultSet.getString("code"));
				restaurantDTO.setTip(resultSet.getString("tip"));
				
				return restaurantDTO;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
	

	public void OrderInsert(String mobile, String address, String payment, String totalprice, String cookingtime, String restaurant_code, String customer_code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into baedal.order(mobile, address, startdate, payment, totalprice, cookingtime, restaurant_code, customer_code) values (?, ?, now(), ?, ?, ?, ?, ?) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, mobile);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, payment);
			preparedStatement.setString(4, totalprice);
			preparedStatement.setString(5, cookingtime);
			preparedStatement.setString(6, restaurant_code);
			preparedStatement.setString(7, customer_code);
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

	public String selectOrderCode(String customer_code, String restaurant_code) {
		Connection connection = null; 
		PreparedStatement preparedStatement = null; 
		ResultSet resultSet = null; 
		
		try {
			connection = dataSource.getConnection();
			
			String query = "SELECT code FROM baedal.order WHERE customer_code=? AND restaurant_code=? ORDER BY startdate DESC LIMIT 1";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			preparedStatement.setString(2, restaurant_code);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				String order_code = resultSet.getString("code");
				
				return order_code;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { 
				if(resultSet != null) resultSet.close(); 
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
	
	public void insertBasketToMenu(String order_code, String customer_code, String restaurant_code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "INSERT INTO baedal.menu( order_code, food_code, number) SELECT ?, food_code, number FROM basket WHERE customer_code=? AND food_restaurant_code=?;";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, order_code);
			preparedStatement.setString(2, customer_code);
			preparedStatement.setString(3, restaurant_code);
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
	
	public boolean BasketAllDelete(String customer_code) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "DELETE FROM basket WHERE customer_code=? ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			int result = preparedStatement.executeUpdate();

			if (result != 0) {
				return true;
			}

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

		return false;
	}
	
}
