<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap 5 Website Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <style>
  .fakeimg {
    height: 200px;
    background: #aaa;
  }
  .center {
    margin: 0 auto;
    text-align: center;
    width: fit-content;
  }
  </style>
</head>
<body>

<div class="p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap 5 Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
    	<!-- 로그인을 한 경우 -->
   <% String email = (String)session.getAttribute("email"); // session 서버에 저장,	브라우저 닫힐때 / request 1번만 사용
   Integer sid = (Integer)session.getAttribute("APP_USER_ID");
   if(email != null){ %>
      <li class="nav-item center">
        <a class="nav-link" href="<%=request.getContextPath() %>/member/mypage.jsp?APP_USER_ID=<%=sid%>">
        <%=email %><%=sid %>
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/board/list">MbtiBoard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/member/logout.jsp">로그아웃</a>
      </li>
   <%}else{ %>
      <!-- 로그인을 안한 경우 -->
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/member/login.jsp">LOGIN</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="<%=request.getContextPath() %>/member/join.jsp">JOIN</a>
      </li>
   <%}%>
    </ul>
  </div>
</nav>
<!-- header -->
<!-- header -->
<!-- header -->
