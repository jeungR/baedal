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
	
	public void MenuInsert(String foodname, String foodprice, String foodtype, String cookingtime, String foodimage) {
		Connection connection = null; //연결
		PreparedStatement preparedStatement = null; //준비
		try {
			connection = dataSource.getConnection();
			
			String query = "insert into food(name, price, type, cookingtime, image) values (?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, foodname);
			preparedStatement.setString(2, foodprice);
			preparedStatement.setString(3, foodtype);
			preparedStatement.setString(4, cookingtime);
			preparedStatement.setString(5, foodimage);
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
