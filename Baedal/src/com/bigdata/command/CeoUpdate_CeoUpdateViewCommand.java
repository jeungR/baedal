package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoUpdateDAO;
import com.bigdata.DTO.RestaurantDTO;

public class CeoUpdate_CeoUpdateViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String ceocode = (String)request.getSession().getAttribute("ceoCode");
		CeoUpdateDAO dao = new CeoUpdateDAO();
		RestaurantDTO dto = dao.CeoUpdateView(ceocode);
		
		request.setAttribute("CeoUpdateView", dto);
	}

}

