package com.bigdata.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.DAO.MenuSelectDAO;
import com.bigdata.DTO.FoodDTO;

public class MenuSelect_SubMenuViewCommand implements Command {

   @Override
   public void execute(HttpServletRequest request, HttpServletResponse response) {
      MenuSelectDAO dao = new MenuSelectDAO();
      String restaurantcode = (String) request.getSession().getAttribute("ceoCode");
      ArrayList<FoodDTO> dtos = dao.SubMenuView(restaurantcode);
      request.setAttribute("SubMenuSelect", dtos);
   }

}