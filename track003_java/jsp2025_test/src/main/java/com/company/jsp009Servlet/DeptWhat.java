package com.company.jsp009Servlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptWhat
 */
@WebServlet("/DeptWhat")
public class DeptWhat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptWhat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//1. 데이터 넘겨받기
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		//2. 드커프리
		Connection conn = null;  PreparedStatement pstmt = null;   ResultSet  rset = null;
		String driver   = "oracle.jdbc.driver.OracleDriver";
		String url      = "jdbc:oracle:thin:@localhost:1521:xe";
		String user     = "scott"; 
		String pass = "tiger";
		String sql = "select * from dept where deptno=?";
		DeptDto result = null;
		try {
			//2-1. 드라이버로딩
			Class.forName(driver);
			//2-2. 커넥션
			conn = DriverManager.getConnection(url, user, pass);
			//2-3. PreparedStatement
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno); // 1 ?의 순서
			
			//2-4. ResultSet (결과) - select : executeQuery , insert/update/delete : executeUpdate
			rset = pstmt.executeQuery(); //표
			while(rset.next()) { //줄
				result = new DeptDto(rset.getInt("deptno")
									, rset.getString("dname")
									, rset.getString("loc"));
			}
			System.out.println(result + "!!!!!!!!!!!!!!!!!!!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(rset != null)
				try {
					rset.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//3. 데이터화면에 넘겨주기
		request.setAttribute("dto", result);
//		response.sendRedirect("jsp010_result.jsp"); // 주소표시창줄넘기기 - 여기서 마무리		데이터 유지안됨
		request.getRequestDispatcher("jsp010_result.jsp").forward(request, response); // 데이터 넘겨줌
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
