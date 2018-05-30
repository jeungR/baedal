package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CustomerUpdateDAO;
import com.bigdata.DAO.MemberCustomerDAO;
import com.bigdata.DTO.CustomerDTO;

public class CustomerUpdate_CustomerUpdateCommnad implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = (String) request.getSession().getAttribute("customerId");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String name = request.getParameter("name");
		
		CustomerUpdateDAO cDao = new CustomerUpdateDAO();
		cDao.CustomerUpdate(name, id, password, mobile, address);
	
	}

}
