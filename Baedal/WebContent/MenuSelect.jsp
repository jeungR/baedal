<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴선택확인</title>
</head>
<%@include file="/resources/module/menubar.jsp"%>

<div class="gallery" align = center>
  <a target="_blank" href="<%=application.getContextPath() %>/resources/image/chicken.jpg">
    <img src="<%=application.getContextPath() %>/resources/image/chicken.jpg" alt="chicken" width="300" height="200">
  </a>
  <div class="title">메뉴이름</div>
  <div class="desc">가격: 500원</div>
</div>

<table align = center>
  
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