package com.bigdata.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class CeoHomeDAO {
	public DataSource dataSource = null;
	
	public CeoHomeDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/mvc");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void OrderReportInit() {
		
	}
	
	public void OrderReportSearch() {
		
	}
	
	public void OrderOK() {
		
	}
	
	public void MenuInfoInit() {
		
	}
	
	public void MenuInfoSearch() {
		
	}
	
	public void MenuInfoDelete() {
		
	}
	
	
	
	
}
