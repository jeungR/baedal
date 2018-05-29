<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/menubar.css" />
</head>
<body>

<ul>
  <li><a href="#home">한 식</a></li>
  <li><a href="#news">중 식</a></li>
  <li><a href="#contact">양 식</a></li>
  <li><a href="#aaa">일 식</a></li>
  <li style="float:right"><a class="active" href="#about"><i class="material-icons md-19">home</i></a></li>
  <li style="float:right"><a href="#about"><i class="material-icons md-19">insert_emoticon</i></a></li>
  <li style="float:right"><a href="#about"><i class="material-icons md-19">shopping_cart</i></a></li>
  <li style="float:right"><a href="logout.do">로그아웃</a></li>
</ul>