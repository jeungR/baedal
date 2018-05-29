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
		String food_code = request.getParameter("food_code");
		String food_restaurant_code = request.getParameter("food_restaurant_code");
		String number = request.getParameter("number");
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		
		OrderDAO orderDAO= new OrderDAO();
		orderDAO.BasketInsert(code, food_code, food_restaurant_code, number, customer_code);
	}

}
