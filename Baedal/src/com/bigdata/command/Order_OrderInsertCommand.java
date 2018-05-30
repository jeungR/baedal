package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.OrderDAO;

public class Order_OrderInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String payment = request.getParameter("payment");
		String totaltipprice = request.getParameter("totaltipprice");
		String cookingtime = request.getParameter("cookingtime");
		String restaurant_code = request.getParameter("restaurant_code");
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		
		OrderDAO orderDAO= new OrderDAO();
		orderDAO.OrderInsert(mobile, address, payment, totaltipprice, cookingtime, restaurant_code, customer_code);
		String order_code = orderDAO.selectOrderCode(customer_code, restaurant_code);
		orderDAO.insertBasketToMenu(order_code, customer_code, restaurant_code);
		orderDAO.BasketAllDelete(customer_code);
	}

}
