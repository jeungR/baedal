package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.LoginDAO;
import com.bigdata.DAO.MemberCeoDAO;
import com.bigdata.DTO.CustomerDTO;

public class Login_LoginCustomerCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		LoginDAO loginDAO = new LoginDAO();
		String code = loginDAO.loginCustomerCheck(id, password);
		
		if(!code.equals("fail")) {
			request.getSession().setAttribute("customerCode", code);
			request.getSession().setAttribute("customerId", id);
		}
		
	}

}
