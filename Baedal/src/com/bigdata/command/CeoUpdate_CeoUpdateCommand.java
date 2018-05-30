package com.bigdata.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.CeoUpdateDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class CeoUpdate_CeoUpdateCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String ceoid = (String)request.getSession().getAttribute("ceoId");

		String uploadPath = request.getSession().getServletContext().getRealPath("/resources/image/");
		MultipartRequest multipartRequest = null;
		try {
			multipartRequest = new MultipartRequest(request, uploadPath, 1024*1024*20, "utf-8",  new DefaultFileRenamePolicy());
		} catch (IOException e) {
			e.printStackTrace();
		}

		String password = multipartRequest.getParameter("password");
		String name = multipartRequest.getParameter("name");
		String type = multipartRequest.getParameter("type");
		String address = multipartRequest.getParameter("address");
		String phone = multipartRequest.getParameter("phone");
		String tip = multipartRequest.getParameter("tip");
		String image = multipartRequest.getFilesystemName("image") == null ? "default_restaurant.jpg" : multipartRequest.getFilesystemName("image");
		System.out.println("command ceoid" + ceoid);
		System.out.println("command" + password);
		
		CeoUpdateDAO cUDao = new CeoUpdateDAO();
		cUDao.CeoUpdate(ceoid, password, name, address, phone, type, tip, image);
		
	}

}
