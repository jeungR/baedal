package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoUpdateDAO;
import com.bigdata.DAO.CustomerUpdateDAO;

public class CeoUpdate_CeoUpdateCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String ceoid = (String)request.getSession().getAttribute("ceoid");
		
		String password = request.getParameter("pw");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String image = request.getParameter("image");
		CeoUpdateDAO cUDao = new CeoUpdateDAO();
		cUDao.CeoUpdate(password, name, type, address, mobile, image, ceoid);
	}

}
