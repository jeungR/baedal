package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuSelectDAO;
import com.bigdata.DTO.FoodDTO;

public class MenuSelect_MenuViewCommnad implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String restaurant_code = request.getParameter("code");
		MenuSelectDAO dao = new MenuSelectDAO();
		ArrayList<FoodDTO> mainMenuDTOs = dao.MenuView(restaurant_code);
		ArrayList<FoodDTO> subMenuDTOs = dao.SubMenuView(restaurant_code);
		request.setAttribute("mainMenuDTOs", mainMenuDTOs);
		request.setAttribute("subMenuDTOs", subMenuDTOs);
	}

}
