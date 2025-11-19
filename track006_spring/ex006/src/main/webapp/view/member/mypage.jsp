<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../inc/header.jsp" %>
<script>
$(function(){
	let result = '${success}';
	
	if(result == "로그인 실패"){ alert(result); location.href='login.users';}
	else if(result.length !=0 ){ alert(result); }
});
</script>

   <div class="container card  my-5">
      <h3  class="card-header"> MYPAGE </h3> 
		<table class="table  table-striped  table-bordered  table-hover">
			<tbody class="table-info ">
				<tr> <th scope="row">Email</th>        <td>${user.email } </td> </tr>
				<tr> <th scope="row">MBTI TYPE</th>    <td>${user.mbtiTypeId } </td> </tr>
				<tr> <th scope="row">회원가입날짜</th>    <td>${user.createdAt } </td></tr>
			</tbody>
		</table>
		<div class="mb-3">
		    <label for="ufile" class="form-label">File:</label>
		    <img src="${pageContext.request.contextPath}/upload/${user.ufile}" alt=""/>
		</div>
		<!-- mvc1 - 코드가 뒤죽박죽 - 스파게티 코드라고해요~! -->
		
		<div class="mb-3">
			<a href="${pageContext.request.contextPath}/edit.users?id=${user.appUserId}" class="btn btn-success form-control">수정</a>
		</div>
		<div class="mb-3">
			<a href="${pageContext.request.contextPath}/delete.users?id=${user.appUserId}" class="btn btn-secondary form-control">삭제</a>
		</div> 
	</div>
	
	
	
<%@ include file="../inc/footer.jsp" %>



<!-- 1. mypage -  유형 1,2,3,
	 2. first님      MbtiBaord   /  로그인 회원가입
	 3. 테이블에서 숫자자동으로 카운트 -->