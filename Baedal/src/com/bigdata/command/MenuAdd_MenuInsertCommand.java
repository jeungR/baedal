package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuAddDAO;

public class MenuAdd_MenuInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String foodname = request.getParameter("foodname");
		String foodprice = request.getParameter("foodprice");
		String foodtype = request.getParameter("foodtype");
		String cookingtime = request.getParameter("cookingtime");
		String foodimage = request.getParameter("foodimage");
		
		MenuAddDAO dao = new MenuAddDAO();
		dao.MenuInsert(foodname, foodprice, foodtype, cookingtime, foodimage);
	}

}
