package com.bigdata.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyPageDAO {
	public DataSource dataSource = null;
	
	public MyPageDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void HistoryInit() {
		
	}
	
	public void HistorySearch() {
		
	}
	
	public void UserInfoSearch() {
		
	}
	
	
	
	
}
