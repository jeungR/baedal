package com.bigdata.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CustomerUpdateDAO;
import com.bigdata.DTO.CustomerDTO;

public class CustomerUpdate_CustomerSelectCommnad implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String custid = (String) request.getSession().getAttribute("customerId");
		
		CustomerUpdateDAO cDao = new CustomerUpdateDAO(); //db연결
	//	ArrayList<CustomerDTO> dtos = cDao.list(custid);
		CustomerDTO dto = cDao.CustomerSelect(custid);
	
		
	//	request.setAttribute("list", dtos);
		request.setAttribute("search", dto);
	}

}
