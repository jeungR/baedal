package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MyPageDAO;
import com.bigdata.DAO.OrderDAO;
import com.bigdata.DTO.CustomerDTO;
import com.bigdata.DTO.HistoryDTO;

public class Order_UserInfoSearchCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		
		OrderDAO orderDAO = new OrderDAO(); //데이터베이스 어세스(연결)
		CustomerDTO dto = orderDAO.UserInfoSearch(customer_code);
		String mobile = dto.getMobile();
		String address = dto.getAddress();
		
		request.setAttribute("Order", dto);
	}

}
