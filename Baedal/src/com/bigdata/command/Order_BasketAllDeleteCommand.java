package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.OrderDAO;

public class Order_BasketAllDeleteCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		
		OrderDAO orderDAO = new OrderDAO();
		orderDAO.BasketAllDelete(customer_code);
	}

}
