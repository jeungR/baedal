package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MemberCustomerDAO;
import com.bigdata.DAO.OrderDAO;

public class Order_BasketInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		String restaurant_code = request.getParameter("restaurant_code");
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		String number = request.getParameter("number");
		
		OrderDAO orderDAO= new OrderDAO();
		orderDAO.BasketInsert(code, restaurant_code, number, customer_code);
	}

}
