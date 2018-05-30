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

<br />
<div class="gallery" align = center>
  <a target="_blank" href="<%=application.getContextPath() %>/resources/image/${foodDTO.image}">
    <img src="<%=application.getContextPath() %>/resources/image/${foodDTO.image}" alt="${foodDTO.name}" width="300" height="200">
  </a>
  <div class="title">${foodDTO.name}</div>
  <div class="desc">가격: ${foodDTO.price}원</div>
</div>

<form action="">
<input type="hidden" name="code" value="${foodDTO.code}"/>
<input type="hidden" name="restaurant_code" value="${foodDTO.restaurant_code}"/>
<table align = center>
  <tr>
  	<td>수량 : <select name="number" id="number" onchange="calculate()">
  	 <option value="1" selected>1</option>
  	 <option value="2">2</option>
  	 <option value="3">3</option>
  	 <option value="4">4</option>
  	 <option value="5">5</option>
  	 <option value="6">6</option>
  	 <option value="7">7</option>
  	 <option value="8">8</option>
  	 <option value="9">9</option>
  	 <option value="10">10</option>
  	</select></td>
  </tr>
  <tr>
  	<td>총 금액 : <input type = "text" id="totalprice" name = "totalprice"></td>
  </tr>
  <tr>
  	<td><input type="submit" value = "장바구니담기" onclick='this.form.action="MenuCheck_BasketInsert.do";'></td>
  	<td><input type="submit" value = "주문하기" onclick='this.form.action="Order_BasketInsertSearch.do";'></td>
  </tr>
</table>
</form>



</body>
<script>
function calculate() {
    var price = ${foodDTO.price};
    var number = document.getElementById("number").value;
    var total = price * number;
    document.getElementById("totalprice").value = total;
}
calculate();
</script>
</html>