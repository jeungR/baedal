package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.OrderDAO;

public class Order_OrderInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String code = request.getParameter("code");
		String totalprice = request.getParameter("totalprice");
		String time = request.getParameter("time");
		String address = request.getParameter("address");
		String startdate = request.getParameter("startdate");
		String payment = request.getParameter("payment");
		String restaurant_code = request.getParameter("restaurant_code");
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		String food_code = request.getParameter("food_code");
		String number = request.getParameter("number");
		
		OrderDAO orderDAO= new OrderDAO();
		orderDAO.OrderInsert(code, totalprice, time, address, startdate, payment, restaurant_code, customer_code, food_code, number);
	}

}
