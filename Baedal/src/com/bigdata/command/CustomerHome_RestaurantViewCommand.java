package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CustomerHomeDAO;
import com.bigdata.DTO.RestaurantDTO;

public class CustomerHome_RestaurantViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String type = request.getParameter("type");
		
		CustomerHomeDAO cHDao = new CustomerHomeDAO();
		ArrayList<RestaurantDTO> dtos = cHDao.list(type);
		request.setAttribute("list", dtos);
		
		//RestaurantDTO dto = cHDao.RestaurantView(type);
	//	request.setAttribute("CustomerHome", dto);
		
	}

}
