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
import com.bigdata.DTO.HistoryDTO;

public class MyPageDAO {
	public DataSource dataSource = null;

	public MyPageDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HistoryDTO> HistorySearch(String customer_code) { // 데이터 쌓는 메소드
		ArrayList<HistoryDTO> dtos = null;
		Connection connection = null; // 연결
		PreparedStatement preparedStatement = null; // 준비
		ResultSet resultSet = null; // 가져오는 것

		try {
			connection = dataSource.getConnection();

			String query = "select baedal.order.code, baedal.restaurant.name, baedal.food.Name, baedal.menu.number, baedal.order.totalprice, baedal.order.startdate, baedal.order.ok "
					+ "from baedal.order, menu, food, restaurant "
					+ "where baedal.order.customer_code=? and baedal.order.code = menu.order_code and menu.food_code = food.code and food.restaurant_code = restaurant.code ";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customer_code);
			resultSet = preparedStatement.executeQuery();

			dtos = new ArrayList<HistoryDTO>();
			while (resultSet.next()) { // 보안사항 추가
				String order_code = resultSet.getString("order.code");
				String restaurtant_name = resultSet.getString("restaurant.name");
				String food_name = resultSet.getString("food.Name");
				String menu_number = resultSet.getString("menu.number");
				int totalprice = resultSet.getInt("order.totalprice");
				String startdate = resultSet.getString("order.startdate");
				String ok = resultSet.getString("order.ok");
				HistoryDTO dto = new HistoryDTO(order_code, restaurtant_name, food_name, menu_number, totalprice, startdate, ok);
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

	public CustomerDTO UserInfoSearch(String customerId) {
			CustomerDTO dto = null; //데이터 한줄씩 보임
			Connection connection = null; //연결
			PreparedStatement preparedStatement = null; //준비
			ResultSet resultSet = null; //가져오는 것 
			
			try {
				connection = dataSource.getConnection();
				
				String query = "select id, vip from customer where id = ?";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, customerId);
				resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					String vip = resultSet.getString("vip");
					dto = new CustomerDTO();
					dto.setVip(vip);
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
