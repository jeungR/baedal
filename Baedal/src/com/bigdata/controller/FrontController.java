package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.command.CeoHome_MenuInfoDeleteCommand;
import com.bigdata.command.CeoHome_MenuInfoSearchCommand;
import com.bigdata.command.CeoHome_OrderOkCommand;
import com.bigdata.command.CeoHome_OrderReportSearchCommand;
import com.bigdata.command.Command;
import com.bigdata.command.CustomerHome_RestaurantViewCommand;
import com.bigdata.command.Login_LoginCheckCommand;
import com.bigdata.command.MemberCeo_CeoInsertCommand;
import com.bigdata.command.MemberCeo_IdCheckCommand;
import com.bigdata.command.MemberCustomer_IdCheckCommand;
import com.bigdata.command.MemberCustomer_UserInsertCommand;
import com.bigdata.command.MenuAdd_MenuInfoUpdateCommand;
import com.bigdata.command.MenuAdd_MenuInsertCommand;

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
		case("/LoginCheck.do"): //회원가입 클릭시 이동, 확인 클릭시 고객홈 또는 사장홈으로 가야함
			Command = new Login_LoginCheckCommand();
			Command.execute(request, response);
			viewPage = "CutomerHome.jsp";
			break;
		case("/MemberType.do"): // 클릭에따라 viewpage가 달라짐
			Command.execute(request, response);
			viewPage = "MemberType.jsp";
			break;
		case("/MemberCeo_IdCheck.do"):
			Command = new MemberCeo_IdCheckCommand();
			Command.execute(request, response);
			viewPage = "MemberCEO.jsp";
			break;
		case("/MemberCeo_CeoInsert.do"):
			Command = new MemberCeo_CeoInsertCommand();
			Command.execute(request, response);
			viewPage = "Login.jsp";
			break; 
		case("/MemberCustomer_IdCheck.do"):
			Command = new MemberCustomer_IdCheckCommand();
			Command.execute(request, response);
			viewPage = "MemberCustomer.jsp";
			break; 
		case("/MemberCustomer_UserInsert.do"):
			Command = new MemberCustomer_UserInsertCommand();
			Command.execute(request, response);
			viewPage = "Login.jsp";
			break; 
		case("/CEOHome_OrderReportSearch.do"):
			Command = new CeoHome_OrderReportSearchCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CEOHome_OrderOk.do"):
			Command = new CeoHome_OrderOkCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CEOHome_MenuInfoSearch.do"):
			Command = new CeoHome_MenuInfoSearchCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CEOHome_MenuInfoDelete.do"):
			Command = new CeoHome_MenuInfoDeleteCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CEOHome_Update.do"): //회원정보수정 클릭시 CeoUpdate창으로 넘어가야함
			Command.execute(request, response);
			viewPage = "CeoUpdate.jsp";
			break; 
		case("/CEOHome_MenuAdd.do"): //메뉴추가 클릭시 MenuAdd창으로 넘어가야함
			Command.execute(request, response);
			viewPage = "MenuAdd.jsp";
			break; 
		case("/MenuAdd_MenuInsert.do"):
			Command = new MenuAdd_MenuInsertCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/MenuAdd_MenuInfoUpdate.do"): // CEOHome 수정 클릭시 MenuAdd창으로 가야하는데, 이부분확인
			Command = new MenuAdd_MenuInfoUpdateCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CustomerHome_.do"): //클릭메서드가 있어야하는지 확인
			Command = new CustomerHome_RestaurantViewCommand();
			Command.execute(request, response);
			viewPage = ".jsp";
			break; 
//		case("/Order_.do"):
////			Command = new Order_();
//			Command.execute(request, response);
//			viewPage = ".jsp";
//			break; 

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
