package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoHomeDAO;
import com.bigdata.DAO.OrderDAO;

public class Order_BasketDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		
		OrderDAO orderDAO = new OrderDAO();
		orderDAO.BasketDelete(code);
	}

}
