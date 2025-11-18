<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../inc/header.jsp" %>

	
	
	</script>

   <div class="container card  my-5 p-4 ">
      <h3 class="card-header"> MBTI 글삭제</h3>
	   
	  <form action="${pageContext.request.contextPath}/delete.users"  method="post">  
	      <div class="mb-3">
            <label for="email" class="form-label">EMAIL:</label>
            <input type="text" class="form-control" id="email"
                   placeholder="이메일을 입력해주세요" name="email" value="${dto.email}">
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">PASS:</label>
            <input type="password" class="form-control" id="password"
                   placeholder="비밀번호를 입력해주세요" name="password">
        </div>

		  <div class="my-3  text-end">
		  	<button type="submit" class="btn btn-primary">글삭제</button>
		  	<a href="javascript:history.go(-1)"  class="btn btn-danger">BACK</a>
		  </div>
	 </form>
   </div>
   
<%@include file="../inc/footer.jsp" %>

<!-- [ mbtiBoard - list.jsp ]  -->