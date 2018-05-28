<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") != null) response.sendRedirect("CustomerHome_RestaurantView.do"); %>
<% if(session.getAttribute("ceoId") != null) response.sendRedirect("CeoHome_OrderMenuView.do"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align = center>
<tr align = center>
<td><a href="MemberCustomer.jsp"><input type = "submit" value = "고객 회원가입"></a></td>
</tr>
<tr align = center>
<td><a href="MemberCEO.jsp"><input type = "submit" value = "공급자 회원가입"></a></td>
</tr>
</table>
</body>
</html>