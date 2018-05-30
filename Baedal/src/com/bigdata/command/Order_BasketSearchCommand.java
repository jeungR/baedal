package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.OrderDAO;
import com.bigdata.DTO.BasketDTO;
import com.bigdata.DTO.CustomerDTO;

public class Order_BasketSearchCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		
		OrderDAO orderDAO = new OrderDAO();//데이터베이스 어세스(연결)
		ArrayList<BasketDTO> dtos = orderDAO.BasketSearch(customer_code); //읽은 데이터를 배열로 저장
		CustomerDTO dto = orderDAO.UserInfoSearch(customer_code);
		String tip = orderDAO.selectTip(customer_code);
		
		request.setAttribute("BasketSearch", dtos); //리턴값 설정
		request.setAttribute("Order", dto);
		request.setAttribute("tip", tip);
	}
			
}
