package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MemberCeoDAO;
import com.bigdata.DAO.MemberCustomerDAO;

public class MemberCustomer_IdCheckCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		
		MemberCustomerDAO cDAO = new MemberCustomerDAO();
		boolean hasSameId = cDAO.IdCheck(id);
		request.setAttribute("hasSameId", hasSameId);
		
	}

}
