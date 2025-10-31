<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../inc/header.jsp" %>

   <div class="container card  my-5 p-4">
      <h3 class="card-header"> MBTI 글쓰기</h3>
      <div>
      	<input type="hidden" name="app_user_id" value="">
      	<div class="mb-3">
      		<label for="hit" class="form-label"> 조회수 </label>
      		<input type="email" class="form-control" id="hit" name="hit" readonly 
      				value="${dto.hit}">
      	</div>
      	<div class="mb-3 mt-3">
      		<label for="title" class="form-label"> TITLE: </label>
      		<input type="email" class="form-control" id="title" placeholder="내용을 입력해주세요" name="title" readonly 
      				value="${dto.title}">
      	</div>
      	<div class="mb-3">
      		<label for="content" class="form-label"> CONTENT: </label>
      		<textarea class="form-control" id="content" placeholder="내용을 입력해주세요" name="content" readonly name="content">${dto.content}</textarea>
      	</div>
      	<c:if test="${not empty email }">
        <div class="mb-3">
        	<a href="${pageContext.request.contextPath}/editView.do?id=${dto.id}" class="btn btn-success form-control">글수정</a>
      	</div>
      	<div class="mb-3">
        	<a href="${pageContext.request.contextPath}/deleteView.do?id=${dto.id}" class="btn btn-danger form-control">글삭제</a>
      	</div>
      	<div class="mb-3">
        	<a href="${pageContext.request.contextPath}/list.do" class="btn btn-default form-control">목록보기</a>
      	</div>
      	</c:if>
      </div>
   </div>
   
<%@include file="../inc/footer.jsp" %>