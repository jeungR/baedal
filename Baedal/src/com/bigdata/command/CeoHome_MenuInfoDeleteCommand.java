package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoHomeDAO;

public class CeoHome_MenuInfoDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String restaurant_code = (String) request.getSession().getAttribute("ceoCode");
		String code = request.getParameter("code");
		
		CeoHomeDAO ceoHomeDAO = new CeoHomeDAO();
		ceoHomeDAO.MenuInfoDelete(code, restaurant_code);
		
	}

}
