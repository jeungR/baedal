package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.command.Command;
import com.bigdata.command.Login_LoginCheckCommand;
import com.bigdata.command.MemberCeo_CeoInsertCommand;
import com.bigdata.command.MemberCeo_IdCheckCommand;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		Command Command = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		switch (com) {
		case("/LoginCheck.do"):
			Command = new Login_LoginCheckCommand();
			Command.execute(request, response);
			viewPage = "Login.jsp";
			break;
		case("/MemberType.do"):
			Command.execute(request, response);
			viewPage = "MemberType.jsp";
			break;
		case("/MemberCeo_IdCheck.do"):
			Command = new MemberCeo_IdCheckCommand();
			Command.execute(request, response);
			viewPage = "MemberCEO_IdCheck.jsp";
			break;
		case("/MemberCeo_CeoInsert.do"):
			Command = new MemberCeo_CeoInsertCommand();
			Command.execute(request, response);
			viewPage = "Login.jsp";
			break; //여기까지
		case("/write.do"):
			//Command = new ****Command();
			Command.execute(request, response);
			viewPage = "list.do";
		break;

		default:
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);  //보냄. controller 역할 끝
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
