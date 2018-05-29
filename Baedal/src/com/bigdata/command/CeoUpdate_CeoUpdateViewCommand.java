package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoUpdateDAO;
import com.bigdata.DAO.MenuSelectDAO;
import com.bigdata.DTO.FoodDTO;
import com.bigdata.DTO.RestaurantDTO;

public class CeoUpdate_CeoUpdateViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		CeoUpdateDAO dao = new CeoUpdateDAO();
		String ceocode = (String)request.getSession().getAttribute("ceoCode");
		ArrayList<RestaurantDTO> dto = dao.CeoUpdateView(ceocode);
		request.setAttribute("CeoUpdateView", dto);
	}

}

