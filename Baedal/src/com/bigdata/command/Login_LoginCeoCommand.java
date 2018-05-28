package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.LoginDAO;

public class Login_LoginCeoCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		LoginDAO loginDAO = new LoginDAO();
		String code = loginDAO.loginCeoCheck(id, password);
		
		if(!code.equals("fail")) {
			request.getSession().setAttribute("ceoCode", code);
			request.getSession().setAttribute("ceoId", id);
		}

	}

}
