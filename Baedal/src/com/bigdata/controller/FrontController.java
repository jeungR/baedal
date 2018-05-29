package com.bigdata.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.command.CeoHome_MenuInfoDeleteCommand;
import com.bigdata.command.CeoHome_OrderMenuViewCommand;
import com.bigdata.command.CeoHome_OrderOkCommand;
import com.bigdata.command.CeoUpdate_CeoUpdateCommand;
import com.bigdata.command.Command;
import com.bigdata.command.CustomerHome_RestaurantViewCommand;
import com.bigdata.command.CustomerUpdate_CustomerUpdateCommnad;
import com.bigdata.command.Login_LoginCeoCommand;
import com.bigdata.command.Login_LoginCustomerCommand;
import com.bigdata.command.MemberCeo_CeoInsertCommand;
import com.bigdata.command.MemberCeo_IdCheckCommand;
import com.bigdata.command.MemberCustomer_IdCheckCommand;
import com.bigdata.command.MemberCustomer_UserInsertCommand;
import com.bigdata.command.MenuAdd_MenuInsertCommand;
import com.bigdata.command.MenuCheck_ViewCommand;
import com.bigdata.command.MenuSelect_MenuViewCommnad;
import com.bigdata.command.MyPage_HistorySearchCommand;
import com.bigdata.command.Order_BasketSearchCommand;

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
		case("/logout.do"):
			request.getSession().invalidate();
			viewPage = "Login.jsp";
			break;
		case("/Login_LoginCustomer.do"):
			Command = new Login_LoginCustomerCommand();
			Command.execute(request, response);
			viewPage = "CustomerHome_RestaurantView.do";
			break;
		case("/CustomerHome_RestaurantView.do"):
			Command = new CustomerHome_RestaurantViewCommand();
			Command.execute(request, response);
			viewPage = "CustomerHome.jsp";
			break; 
		case("/Login_LoginCeo.do"):
			Command = new Login_LoginCeoCommand();
			Command.execute(request, response);
			viewPage = "CeoHome_OrderMenuView.do";
			break;
		case("/MemberType.do"): // 클릭에따라 viewpage가 달라짐
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
			break; 
		case("/MemberCeo_CeoUpdate.do")://ceo 정보수정 클릭시 ceo홈으로 
			Command = new CeoUpdate_CeoUpdateCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/MemberCustomer_CustomerUpdate.do"):
			Command = new CustomerUpdate_CustomerUpdateCommnad();
			Command.execute(request, response);
			viewPage = "Mypage.jsp";
			break; 
		case("/MemberCustomer_IdCheck.do"):
			Command = new MemberCustomer_IdCheckCommand();
			Command.execute(request, response);
			viewPage = "MemberCustomer_IdCheck.jsp";
			break; 
		case("/MemberCustomer_UserInsert.do"):
			Command = new MemberCustomer_UserInsertCommand();
			Command.execute(request, response);
			viewPage = "Login.jsp";
			break; 
		case("/CeoHome_OrderMenuView.do"):
			Command = new CeoHome_OrderMenuViewCommand();
			Command.execute(request, response);
			viewPage = "CEOHome.jsp";
			break; 
		case("/CEOHome_OrderOk.do"):
			Command = new CeoHome_OrderOkCommand();
			Command.execute(request, response);
			viewPage = "CeoHome_OrderMenuView.do";
			break; 
		case("/CEOHome_MenuInfoDelete.do"):
			Command = new CeoHome_MenuInfoDeleteCommand();
			Command.execute(request, response);
			viewPage = "CeoHome_OrderMenuView.do";
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
			viewPage = "CeoHome_OrderMenuView.do";
			break;
		case("/MyPage_HistorySearch.do"):
			Command = new MyPage_HistorySearchCommand();
			Command.execute(request, response);
			viewPage = "MyPage.jsp";
			break;
		case("/Order_BasketSearch.do"):
			Command = new Order_BasketSearchCommand();
			Command.execute(request, response);
			viewPage = "Order.jsp";
			break;
		case("/MenuSelect_MenuView.do"):
			Command = new MenuSelect_MenuViewCommnad();
			Command.execute(request, response);
			viewPage = "MenuSelect.jsp";
		case("/MenuCheck_View.do"):
			Command = new MenuCheck_ViewCommand();
			Command.execute(request, response);
			viewPage = "MenuCheck.jsp";
		break;
		default:
			break;
		}
		
		if(viewPage.endsWith(".do")) {
			response.sendRedirect(viewPage);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);  //보냄. controller 역할 끝
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
