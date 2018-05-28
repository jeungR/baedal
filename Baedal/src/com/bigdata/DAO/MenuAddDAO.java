package com.bigdata.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MenuAddDAO {
	public DataSource dataSource = null;
	
	public MenuAddDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/mvc");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void MenuInsert() {
		
	}
	
	public void MenuInfoUpdate() {
		
	}
	
	
	
}
