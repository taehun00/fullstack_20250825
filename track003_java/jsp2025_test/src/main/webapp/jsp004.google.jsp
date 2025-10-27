<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REQUEST-요청</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <div class="container card  my-5">
      <h3  class="card-header"> REQUEST-요청 </h3>
      <pre class="alert alert-success">
      https://www.google.com/search?q=apple&sca_esv=47dab9ba39490397&source=hp&ei=XiD_aOiZCqHn2roPmsicoA0&iflsig=AOw8s4IAAAAAaP8ubshEf-yCHpX0qC2hJtRoYhWH-R3s&ved=0ahUKEwjowJPd7sOQAxWhs1YBHRokB9QQ4dUDCBA&uact=5&oq=apple&gs_lp=Egdnd3Mtd2l6IgVhcHBsZTIOEC4YgAQYsQMY0QMYxwEyCBAAGIAEGLEDMgsQABiABBixAxiDATIIEAAYgAQYsQMyCBAAGIAEGLEDMg4QLhiABBixAxjRAxjHATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMgUQABiABDIIEAAYgAQYsQNIzQlQHljQCHABeACQAQCYAW2gAY4EqgEDMC41uAEDyAEA-AEBmAIFoALEBKgCAMICERAuGIAEGLEDGNEDGIMBGMcBwgIEEAAYA8ICBxAAGAMYjQbCAgsQLhiABBixAxiDAcICBxAuGIAEGAqYAwDxBdtM_IdY9P16kgcDMC41oAezLLIHAzAuNbgHxATCBwUyLTIuM8gHKw&sclient=gws-wiz
      	1. 처리컨테이너 (해결사 : action) : https://www.google.com/search
      	2. 처리방식(GET/POST : method) : get
      	3. 보관용기(넘겨줄데이터 - 쿼리스트링 : name) : q
      </pre>
      
      <form action="https://www.google.com/search" method="get">
		  <div class="mb-3 mt-3">
		    <label for="search" class="form-label">GOOGLE에 물어보세요~ 검색어</label>
		    <input type="search" class="form-control" id="search" placeholder="검색어를 입력해주세요" name="q">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
   </div>
</body>
</html>