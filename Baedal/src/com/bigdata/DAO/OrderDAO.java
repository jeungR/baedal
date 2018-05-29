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

	public void BasketInsert(String code, String food_code, String food_restaurant_code, String number,
			String customer_code) {
		// 주문하기, 장바구니 담기 클릭시 Insert 되어야함
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = dataSource.getConnection();

			String query = "insert into customer(code, food_code, food_restaurant_code, customer_code, number) values (?, ?, ?, ?, ?) ";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, code);
			preparedStatement.setString(2, food_code);
			preparedStatement.setString(3, food_restaurant_code);
			preparedStatement.setString(4, customer_code);
			preparedStatement.setString(5, number);
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

	public ArrayList<BasketDTO> BasketSearch(String customer_code) {
		ArrayList<BasketDTO> dtos = null;
		Connection connection = null; // 연결
		PreparedStatement preparedStatement = null; // 준비
		ResultSet resultSet = null; // 가져오는 것

		try {
			connection = dataSource.getConnection();

			String query = "select baedal.food.name, baedal.basket.number, (basket.number * food.price) "
					+ "from baedal.food, baedal.basket "
					+ "where baedal.basket.customer_code=? and baedal.food.code = baedal.basket.food_code ";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			resultSet = preparedStatement.executeQuery();

			dtos = new ArrayList<BasketDTO>();
			while (resultSet.next()) { // 보안사항 추가
				String food_name = resultSet.getString("food.name");
				String basket_number = resultSet.getString("basket.number");
				int food_price = resultSet.getInt(Integer.parseInt("basket.number * food.price"));
				BasketDTO dto = new BasketDTO(food_name, basket_number, food_price);
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

	public void BasketDelete() {

	}

	public void SumPrice() {

	}

	public void UserInfoSearch() {

	}

	public void SumTipPrice() {

	}

	public void OrderInsert() {

	}

	public void BasketAllDelete() {

	}

}
