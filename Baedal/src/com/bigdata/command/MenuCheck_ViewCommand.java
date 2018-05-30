package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuCheckDAO;
import com.bigdata.DAO.MenuSelectDAO;
import com.bigdata.DTO.FoodDTO;

public class MenuCheck_ViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		MenuCheckDAO dao = new MenuCheckDAO();
		
		FoodDTO foodDTO = dao.selectMenuView(code);
		request.setAttribute("foodDTO", foodDTO);
		
	}

}
