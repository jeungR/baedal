package com.bigdata.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberCeoDAO {
	public DataSource dataSource = null;
	
	public MemberCeoDAO() {
		try {
			Context ctx = new InitialContext();
			dataSource = (DataSource)ctx.lookup("java:/comp/env/jdbc/mvc");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public void IdCheck() {
		
	}
	
	public void CeoInsert() {
		
	}
	
	public void InsertFieldCheck() {
		
	}
	
}
