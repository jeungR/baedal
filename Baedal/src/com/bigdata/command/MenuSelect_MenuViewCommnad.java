package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuSelectDAO;
import com.bigdata.DTO.FoodDTO;

public class MenuSelect_MenuViewCommnad implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MenuSelectDAO dao = new MenuSelectDAO();
		ArrayList<FoodDTO> dtos = dao.MenuView();
		request.setAttribute("MenuSelect", dtos);
	}

}
