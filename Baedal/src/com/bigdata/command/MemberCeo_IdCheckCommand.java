package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MemberCeoDAO;

public class MemberCeo_IdCheckCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		
		MemberCeoDAO ceoDAO = new MemberCeoDAO();
		boolean hasSameId = ceoDAO.IdCheck(id);
		request.setAttribute("hasSameId", hasSameId);
	}

}
