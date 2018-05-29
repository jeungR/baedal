package com.bigdata.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MemberCeoDAO;
import com.bigdata.DAO.MenuAddDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class MenuAdd_MenuInsertCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String uploadPath = request.getSession().getServletContext().getRealPath("/resources/image/");
		MultipartRequest multipartRequest = null;
		try {
			multipartRequest = new MultipartRequest(request, uploadPath, 1024*1024*20, "utf-8",  new DefaultFileRenamePolicy());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String name = multipartRequest.getParameter("name");
		String price = multipartRequest.getParameter("price");
		String type = multipartRequest.getParameter("type");
		String cookingtime = multipartRequest.getParameter("cookingtime");
		String image = multipartRequest.getFilesystemName("image") == null ? "default_food.jpg" : multipartRequest.getFilesystemName("image");
		String restaurant_code = (String) request.getSession().getAttribute("ceoCode");
		
		
		MenuAddDAO menuAddDAO = new MenuAddDAO();
		menuAddDAO.MenuInsert(name, price, type, cookingtime, image, restaurant_code);
	}

}
