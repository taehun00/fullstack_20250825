<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <div class="container card  my-5">
      <h3  class="card-header"> 1. Statememt </h3>
      <pre class="alert alert-warning">
      1. 매번 실행할때마다 컴파일
      2. 반복실행시 느려짐
      3. sql 인젝션 - 보안상 문제 있음. where loc = 'INCHEON' → where loc = 'INCHEON' OR '1' = '1'
      </pre>
      <%
      Connection conn = null; Statement stmt = null; ResultSet rset = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "scott";
      String password = "tiger";
      //1. 드라이버연동
      Class.forName("oracle.jdbc.driver.OracleDriver");
      //2. 커넥션 (db연결)
      conn = DriverManager.getConnection(url, user, password);
      out.println("db연동성공!");
      //3. Statement 사용
      stmt = conn.createStatement();
      rset = stmt.executeQuery("select * from emp where ename='KING' "); // 표
      //4. ResultSet
      while(rset.next()){ // 줄
      	out.println( rset.getInt("empno") + "/" + rset.getString("ename"));
      }
      rset.close(); stmt.close(); conn.close();
      
      
      %>
		<!-- 드커프리 -->
   </div>
   <div class="container card  my-5">
      <h3  class="card-header"> 2. PreparedStatement </h3>
      <pre class="alert alert-success">
      1. 1번만 준비시 컴파일, 이후 재사용
      2. ?로 데이터 저장하고 값 바인딩
      3. sql 인젝션 방지	where loc=?
      </pre>
      <%
      String driver = "oracle.jdbc.driver.OracleDriver";
      /*
      Connection conn = null; Statement stmt = null; ResultSet rset = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String user = "scott";
      String password = "tiger";
      */
      PreparedStatement pstmt = null;
      //1. 드라이버연동
      Class.forName(driver);
      //2. 커넥션 (db연결)
	  conn = DriverManager.getConnection(url, user, password);
      //3. PreparedStatement 사용
      pstmt = conn.prepareStatement("select * from emp where ename=?"); //? - 번호 1
    		  pstmt.setString(1, "SCOTT");
      //4. ResultSet
      rset = pstmt.executeQuery(); //select - 표
      while(rset.next()){ //줄
    	  out.println(rset.getInt("empno") + "/" + rset.getString("ename"));
      }
      rset.close(); stmt.close(); conn.close();
      %>
		<!-- 드커프리 -->
   </div>
</body>
</html>