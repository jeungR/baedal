<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% if(session.getAttribute("customerId") != null) response.sendRedirect("CustomerHome_RestaurantView.do"); %>
<% if(session.getAttribute("ceoId") != null) response.sendRedirect("CeoHome_OrderMenuView.do"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/loginTab.css" />
</head>
<body>

<div class="forms">
    <ul class="tab-group">
        <li class="tab active"><a href="#login">고객 로그인</a></li>
        <li class="tab"><a href="#login2">사장 로그인</a></li>
    </ul>
    <div id="login" class="form">
    <form action="Login_LoginCustomer.do">
          <h1>Sign in to 배달</h1>
          <div class="input-field">
            <label for="id">ID</label>
            <input type="text" name="id" required/>
            <label for="password">Password</label> 
            <input type="password" name="password" required/>
            <input type="submit" value="Login" class="button"/>
          </div>
    </form>
    <form action="MemberCustomer.jsp">
    	<div class="input-field">
    	<input type="submit" value="SIGN IN" class="button btn_o"/>
    	</div>
    </form>
    </div>
    <div id="login2" class="form">
    <form action="Login_LoginCeo">
        <h1>Sign in to 배달</h1>
        <div class="input-field">
            <label for="id">ID</label>
            <input type="text" name="id" required/>
          <label for="password">Password</label> 
          <input type="password" name="password" required/>
          <input type="submit" value="Login" class="button" />
        </div>
    </form>
    <form action="MemberCEO.jsp">
    	<div class="input-field">
    	<input type="submit" value="SIGN IN" class="button btn_o"/>
    	</div>
    </form>
    </div>
</div>

</body>
<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script>
$(document).ready(function(){
      $('.tab a').on('click', function (e) {
      e.preventDefault();
       
      $(this).parent().addClass('active');
      $(this).parent().siblings().removeClass('active');
       
      var href = $(this).attr('href');
      $('.forms > .form').hide();
      $(href).fadeIn(500);
    });
});
</script>
</html>