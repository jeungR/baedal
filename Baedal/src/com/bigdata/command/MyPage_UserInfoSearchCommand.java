package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MyPageDAO;
import com.bigdata.DTO.CustomerDTO;

public class MyPage_UserInfoSearchCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customerId = (String) request.getSession().getAttribute("customerId");
		String vip = request.getParameter("vip");
		
		MyPageDAO dao = new MyPageDAO();
		CustomerDTO dto = dao.UserInfoSearch(customerId, vip);
		
		request.setAttribute("MyPage", dto);
	}

}
