package com.bigdata.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MenuAddDAO {
	public DataSource dataSource = null;
	
	public MenuAddDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void MenuInsert(String ceoCode, String menuname, String price, String foodtype, String cookingtime, String image) {
		Connection connection = null; //연결
		PreparedStatement preparedStatement = null; //준비
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into food(restaurant_code, name, price, type, cookingtime, image, date) values (?,?,?,?,?,?, now())";
			
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, ceoCode);
			preparedStatement.setString(2, menuname);
			preparedStatement.setString(3, price);
			preparedStatement.setString(4, foodtype);
			preparedStatement.setString(5, cookingtime);
			preparedStatement.setString(6, image);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { //보안사항 추가 - 보안 뚫리기가 쉬움
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
}
