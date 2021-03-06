package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MyPageDAO;
import com.bigdata.DTO.CustomerDTO;
import com.bigdata.DTO.HistoryDTO;

public class MyPage_HistorySearchCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String customer_code = (String) request.getSession().getAttribute("customerCode");
		String customerId = (String) request.getSession().getAttribute("customerId");
		
		MyPageDAO dao = new MyPageDAO(); //데이터베이스 어세스(연결)
		ArrayList<HistoryDTO> dtos = dao.HistorySearch(customer_code); //읽은 데이터를 배열로 저장
		CustomerDTO dto = dao.UserInfoSearch(customerId);
		String vip = dto.getVip();
		
		request.setAttribute("HistorySearch", dtos); //리턴값 설정
		request.setAttribute("MyPage", dto);
	}

}
