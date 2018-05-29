package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CustomerUpdateDAO;
import com.bigdata.DAO.MemberCustomerDAO;

public class CustomerUpdate_CustomerUpdateCommnad implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = (String) request.getSession().getAttribute("customerid");
		String password = request.getParameter("pw");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String name = request.getParameter("name");
		
		CustomerUpdateDAO cDao = new CustomerUpdateDAO();
		cDao.CustomerUpdate(password, address, mobile, name, id);
	}

}
