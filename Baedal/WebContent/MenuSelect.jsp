<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴선택확인</title>
</head>
<h3>메뉴선택확인</h3>
<%@include file="/resources/module/menubar.jsp"%>
<table align = center>
   <tr>
   		<td><img src="C:\Users\Administrator\Desktop\31.png"></td>
  </tr>
  <tr>
  	<td>메뉴이름</td><!-- 이거 원래는 받아오는거 -->
  </tr>
  <tr>
 	 <td>가격 :<!-- 이거 원래는 받아오는거 --> 500원</td>
  </tr>
  <tr>
  	<td>수량 : <select name="number">
  	 <option>1</option>
  	 <option>2</option>
  	 <option>3</option>
  	 <option>4</option>
  	 <option>5</option>
  	 <option>6</option>
  	 <option>7</option>
  	 <option>8</option>
  	 <option>9</option>
  	 <option>10</option>
  	</select></td>
  </tr>
  <tr>
  	<td>총 금액 : <input type = "text" name = "price"></td>
  </tr>
  <tr>
  	<td><a href="MenuCheck.jsp"><input type="submit" value = "장바구니담기"></a> </td>
 
  <td> <a href="Order.jsp"><input type="submit" value = "주문하기"></a></td>
  </tr>
  </table>




</body>
</html>