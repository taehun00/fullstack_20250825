<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
	<script>
	$(function(){
		let result = '${success}';
		console.log(result);
		
		if(result == "수정 실패"){ alert(result); location.href='mypage.users'; }
		else if(result != 0){ alert(result); }
		
	});
	
	</script>
  <div class="container card  my-5 p-4">
     <h3 class="card-header"> MBTI QUEST 글수정</h3>
  <form action="${pageContext.request.contextPath}/edit.users"  method="post"> 
     <!--  <input type="hidden"   name="app_user_id"  value="">  -->
     <input type="hidden"   name="appUserId"  value="${dto.appUserId}">
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">TITLE:</label>
	    <input type="text" class="form-control" id="email" 
	    	  placeholder="이메일을 입력해주세요" name="email"  value="${dto.email}">
	  </div>
	  <div class="mb-3">
	    <label for="password" class="form-label">PASS:</label>
	    <input type="password" class="form-control" id="password" 
	    	placeholder="비밀번호를 입력해주세요" name="password" value="${dto.password}">
	  </div>
	  <div class="mb-3">
	    <label for="mbtiTypeId" class="form-label">CONTENT:</label>
	    <textarea class="form-control" id="mbtiTypeId" placeholder="mbti를 입력해주세요" name="mbtiTypeId">${dto.mbtiTypeId}</textarea>
	  </div> 
	  <div class="mb-3  text-end">
	  	<button type="submit" class="btn btn-primary">글수정</button>
	  	<a href="javascript:history.go(-1)"  class="btn btn-danger">BACK</a>
	  </div>
 </form>
  </div>
   
<%@include file="../inc/footer.jsp" %>

<!-- [ mbtiBoard - list.jsp ]  -->