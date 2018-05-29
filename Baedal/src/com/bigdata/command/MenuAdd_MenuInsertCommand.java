package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuAddDAO;

public class MenuAdd_MenuInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String ceoCode = (String) request.getSession().getAttribute("ceoCode");
		String menuname = request.getParameter("menuname");
		String price = request.getParameter("price");
		String foodtype = request.getParameter("foodtype");
		String cookingtime = request.getParameter("cookingtime");
		String image = request.getParameter("image");
		
		MenuAddDAO dao = new MenuAddDAO();
		dao.MenuInsert(ceoCode, menuname, price, foodtype, cookingtime, image);
	}

}
