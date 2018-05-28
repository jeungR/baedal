package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MemberCustomerDAO;

public class MemberCustomer_UserInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("pw");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String name = request.getParameter("name");
		
		MemberCustomerDAO customerDAO = new MemberCustomerDAO();
		customerDAO.UserInsert(id, password, address, mobile, name);
	}

}
