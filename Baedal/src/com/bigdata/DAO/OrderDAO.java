package com.bigdata.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class OrderDAO {
	public DataSource dataSource = null;
	
	public OrderDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/baedal");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void BasketInit() {
		
	}
	
	public void BasketInsert() {
		
	}
	
	public void BasketSearch() {
		
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
