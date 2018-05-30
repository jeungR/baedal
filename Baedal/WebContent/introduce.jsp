<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/resources/module/loginSession.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사 소개</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<%@include file="/resources/module/menubar.jsp"%>

<!-- Image Header -->
<div class="w3-display-container w3-animate-opacity">
  <img src="<%=application.getContextPath() %>/resources/image/baemin.jpg" alt="boat" style="width:100%;min-height:350px;max-height:600px;">
  <div class="w3-container w3-display-bottomleft w3-margin-bottom">  
    <button onclick="document.getElementById('id01').style.display='block'" class="w3-button w3-xlarge w3-theme w3-hover-teal" title="Go To W3.CSS">맨뒤 조</button>
  </div>
</div>

<!-- Modal -->
<div id="id01" class="w3-modal">
  <div class="w3-modal-content w3-card-4 w3-animate-top">
    <header class="w3-container w3-teal w3-display-container"> 
      <span onclick="document.getElementById('id01').style.display='none'" class="w3-button w3-teal w3-display-topright"><i class="fa fa-remove"></i></span>
      <h4>빅데이터분석을 위한 자바&파이썬 개발자</h4>
      <h5>ㅋㅋㅋㅋㅋ <i class="fa fa-smile-o"></i></h5>
    </header>
    <div class="w3-container">
      <p>힘들다...</p>
      <p>blablablablablablablablablablablabla~~~!</p>
    </div>
    <footer class="w3-container w3-teal">
      <p></p>
    </footer>
  </div>
</div>

<!-- Team Container -->
<div class="w3-container w3-padding-64 w3-center" id="team">
<h2>OUR TEAM</h2>
<p>Meet the team - our office rats:</p>

<div class="w3-row"><br>

<div class="w3-quarter">
  <img src="<%=application.getContextPath() %>/resources/image/dayun.jpeg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>김다연</h3>
  <p>Web Designer</p>
</div>

<div class="w3-quarter">
  <img src="<%=application.getContextPath() %>/resources/image/ryu.png" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>류제웅</h3>
  <p>Boss man</p>
</div>

<div class="w3-quarter">
  <img src="<%=application.getContextPath() %>/resources/image/hungyun.png" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>이형연</h3>
  <p>Programmer</p>
</div>

<div class="w3-quarter">
  <img src="<%=application.getContextPath() %>/resources/image/sunae.jpeg" alt="Boss" style="width:45%" class="w3-circle w3-hover-opacity">
  <h3>한선애</h3>
  <p>Fixer</p>
</div>

</div>
</div>

<!-- Work Row -->
<div class="w3-row-padding w3-padding-64 w3-theme-l1" id="work">

<div class="w3-quarter">
<h2>Our Work</h2>
<p>

</p>
</div>

<div class="w3-quarter">
<div class="w3-card w3-white">
  <img src="<%=application.getContextPath() %>/resources/image/ddal.jpg" alt="Vernazza" style="width:100%">
  <div class="w3-container">
  <h3>시나리오 1</h3>
  <h4>Trade</h4>
  <p>
배달의민족 : 안녕하세요. 사장님! 요즘 가게에 힘든 점이 있으신가요?
공급자 : 안녕하세요. 요즘 인건비가 너무 올라서 가게에 배달직원을 따로 두기가 너무 부담스러워요.
배달의민족 : 배달직원을 두면 한 달에 얼마 정도 인건비가 드나요?
공급자 : 하루 8시간해서 200만원은 되는거 같네요.
배달의민족 : 그럼 하루에 배달건수는 얼마나 되세요?
공급자 : 하루에 20건이나 될까말까해요.
배달의민족 : 그럼 한 건에 3,500원 정도하는 거네요? 배달을 대행해주는 서비스가 있다면 이용하실 의향이 있으세요?
공급자 : 그럼요. 건당 3,000원만 되도 쓰겠어요. 필요할 때만 쓰면 되니까….그리고 배달이 사람만 필요한가요, 오토바이도 있어야 되지, 기름값도 들지, 보험료도 비싸지, 얘들 쓰기도 부담스럽고…그런 서비스있다면 당장 쓰겠네요.
배달의민족 : 그럼 더 필요한 서비스는 없으세요?
공급자 : 가게를 홍보할 수 있는 서비스가 있으면 좋겠네요.
배달의민족 : 아하, 그렇다면 인터넷에 자주 노출될수록 좋겠네요?
공급자 : 그렇죠, 인터넷으로 만드실건가보죠?
배달의민족 : 네, 그래서 어떤 서비스가 필요하신가 해서요.
공급자 : 가능하면 POS랑 연결되서 관리해줄 수 있으면 좋을 것 같긴 하네요. 근데 일단은 배달서비스부터 있었으면 좋겠어요.
배달의민족 : 아하, 알겠습니다. 저희가 사장님께서 원하시는 서비스가 가능하게끔 노력해볼게요.
인터뷰 요청 감사드립니다. 연락드릴게요!
  </p>
  </div>
  </div>
</div>

<div class="w3-quarter">
<div class="w3-card w3-white">
  <img src="<%=application.getContextPath() %>/resources/image/omu.jpg" alt="Cinque Terre" style="width:100%">
  <div class="w3-container">
  <h3>시나리오 2</h3>
  <h4>Trade</h4>
<p>
- 고객: 배달음식을 통합해서 볼 수 있는 프로그램이 있었으면 좋겠어요.
- 배달의민족(이하 배민으로 통칭): 음식만 볼 수 있으면 될까요?
- 고객: 아니요. 이왕이면 가게도 다 나누어 볼 수 있고, 한식, 중식, 일식 같이 카테고리별로 가게가 구분되어있었으면 좋겠어요.
- 배민: 아 그러면 가게별로 메뉴를 볼 수 있고 그 메뉴를 주문할 수 있도록 하는 프로그램이면 될까요?
- 고객: 네 근데 제가 클릭한 메뉴를 한번 더 확인할 수 있는 부분이 추가되면 좋겠네요.
- 배민: 아하 알겠습니다. 그럼 메뉴확인과 동시에 수량도 설정할 수 있도록 구성하도록 하죠.
- 고객: 흠 근데 제가 설사 메뉴를 선택했더라도 주문내역을 다같이 확인하면서
</p>
  </div>
  </div>
</div>

<div class="w3-quarter">
<div class="w3-card w3-white">
  <img src="<%=application.getContextPath() %>/resources/image/chobab.png" alt="Monterosso" style="width:100%">
  <div class="w3-container">
  <h3>시나리오 3</h3>
  <h4>Trade</h4>
  <p>
배달의민족(이하 배민으로 통칭): 안녕하세요. 잠시 인터뷰 가능하세요?
잠재고객 : 아, 네. 어디신가요?
배민 : 저희는 배달의민족이라 합니다. 요식업계와 고객분들을 연계할 수 있는 사업을 구상하는 중인데, 어떤 니즈가 필요한지 조사하고 있습니다. 
잠재고객 : 그러시군요. 어떤걸 말씀해드리면 될까요?
배민 : 평소에 식당에 방문하시거나, 주문을 하실 때 불편하셨던 점이나 개선되었으면 좋겠던 점이 있으신가요?
잠재고객 : 음,,,,, 저는 배달 주문을 할 때, 배달이 밀리면 배달도 늦고 전화를 안받거나 하는 경우가 많아서 불편하더라구요. 어느 가게가 배달이 되는지 몰라서 그것도 불편하구요. 이게 도움이 될까요?
배민 : 네, 그럼요! 그럼 평소에 배달주문이 불편하셨던 거군요? 그럼 어떤 식으로 개선이 되면 좋을까요?
잠재고객 : 배달은 빨리 오는 게 가장 좋죠! 그리고 지역에 주문할 수 있는 배달업체를 한꺼번에 확인 할 수 있었으면 좋겠어요.
배민 : 그러면 배달 시에 배달료가 추가되는 대신에 배달이 편리하거나 빨리진다면 사용하실 의향이 있으신가요?
잠재고객 : 음, 너무 부담스럽지 않은 가격이라면 가능할 것 같네요. 회사에서 시키는 것도 일이라서요.
배민 : 그럼 인터넷으로 지역 내에 가능한 배달업체를 보여주고, 바로 주문이 가능하다면 이용하실 것 같으세요?
잠재고객 : 그거 정말 좋은 아이디어네요. 그렇다면 당장 사용할 것 같아요! 그렇다면 음식 카테고리 별로 보여주는 것도 추가되면 좋겠네요!
배민 : 그런 아이디어가 있네요. 감사합니다.
잠재고객 : 별말씀을요, 그럼 된건가요?
배민 : 네, 인터뷰에 응해주셔서 정말 감사합니다. 이 내용을 토대로 좋은 서비스사업을 만들 수 있도록 노력하겠습니다!
  </p>
  </div>
  </div>
</div>

</div>

<!-- Container -->
<div class="w3-container" style="position:relative">
  <a onclick="w3_open()" class="w3-button w3-xlarge w3-circle w3-teal"
  style="position:absolute;top:-28px;right:24px">+</a>
</div>

<!-- Contact Container -->
<div class="w3-container w3-padding-64 w3-theme-l5" id="contact">
  <div class="w3-row">
    <div class="w3-col m5">
    <div class="w3-padding-16"><span class="w3-xlarge w3-border-teal w3-bottombar">Contact Us</span></div>
      <h3>Address</h3>
      <p>강남구 컴퓨터학원</p>
      <p><i class="fa fa-map-marker w3-text-teal w3-xlarge"></i>  서울, KOREA</p>
      <p><i class="fa fa-phone w3-text-teal w3-xlarge"></i>  +00 1515151515</p>
      <p><i class="fa fa-envelope-o w3-text-teal w3-xlarge"></i>  test@test.com</p>
    </div>
    <div class="w3-col m7">
      <form class="w3-container w3-card-4 w3-padding-16 w3-white" action="/action_page.php" target="_blank">
      <div class="w3-section">      
        <label>Name</label>
        <input class="w3-input" type="text" name="Name" required>
      </div>
      <div class="w3-section">      
        <label>Email</label>
        <input class="w3-input" type="text" name="Email" required>
      </div>
      <div class="w3-section">      
        <label>Message</label>
        <input class="w3-input" type="text" name="Message" required>
      </div>  
      <input class="w3-check" type="checkbox" checked name="Like">
      <label>I Like it!</label>
      <button type="submit" class="w3-button w3-right w3-theme">Send</button>
      </form>
    </div>
  </div>
</div>

<!-- Google Maps -->
<div id="googleMap" style="width:100%;height:420px;"></div>
<script>
function myMap()
{
  myCenter=new google.maps.LatLng(37.5014611, 127.0249165);
  var mapOptions= {
    center:myCenter,
    zoom:15, scrollwheel: false, draggable: false,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"),mapOptions);

  var marker = new google.maps.Marker({
    position: myCenter,
  });
  marker.setMap(map);
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCKtJEWmC5Ujb1V8AK74lpq97z0yZf_-Q0&callback=myMap"></script>
<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

<!-- Footer -->
<footer class="w3-container w3-padding-32 w3-theme-d1 w3-center">
  <h4>Follow Us</h4>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Facebook"><i class="fa fa-facebook"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Twitter"><i class="fa fa-twitter"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Google +"><i class="fa fa-google-plus"></i></a>
  <a class="w3-button w3-large w3-teal" href="javascript:void(0)" title="Google +"><i class="fa fa-instagram"></i></a>
  <a class="w3-button w3-large w3-teal w3-hide-small" href="javascript:void(0)" title="Linkedin"><i class="fa fa-linkedin"></i></a>
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>

  <div style="position:relative;bottom:100px;z-index:1;" class="w3-tooltip w3-right">
    <span class="w3-text w3-padding w3-teal w3-hide-small">Go To Top</span>   
    <a class="w3-button w3-theme" href="#myPage"><span class="w3-xlarge">
    <i class="fa fa-chevron-circle-up"></i></span></a>
  </div>
</footer>

<script>
// Script for side navigation
function w3_open() {
    var x = document.getElementById("mySidebar");
    x.style.width = "300px";
    x.style.paddingTop = "10%";
    x.style.display = "block";
}

// Close side navigation
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
}

// Used to toggle the menu on smaller screens when clicking on the menu button
function openNav() {
    var x = document.getElementById("navDemo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else { 
        x.className = x.className.replace(" w3-show", "");
    }
}
</script>

</body>
</html>