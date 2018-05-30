<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") == null && session.getAttribute("ceoId") == null) 
	response.sendRedirect("Login.jsp"); %>