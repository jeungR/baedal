package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoHomeDAO;
import com.bigdata.DTO.FoodDTO;
import com.bigdata.DTO.OrderReportDTO;

public class CeoHome_OrderMenuViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String restaurant_code = (String) request.getSession().getAttribute("ceoCode");
		
		CeoHomeDAO ceoHomeDAO = new CeoHomeDAO();
		ArrayList<OrderReportDTO> orderReportDTOs = ceoHomeDAO.OrderReportSearch(restaurant_code);
		ArrayList<FoodDTO> foodDTOs = ceoHomeDAO.MenuInfoSearch(restaurant_code);
		
		request.setAttribute("orderReportDTOs", orderReportDTOs);
		request.setAttribute("foodDTOs", foodDTOs);
	}

}
