package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserInterface;
import service.UserJoin;
import service.UserLogin;


@WebServlet("*.do")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserController() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doAction(request, response);
	}
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    String path = request.getServletPath();
	    
	    UserInterface service = null;
	    
	    if(path.equals("/signup.do")) {
	    	service = new UserJoin(); // UserJoin 클래스 실행
	        service.exec(request, response); // 처리
	        
	        // 결과 꺼내기
	        Object resultObj = request.getAttribute("dto");
	        String result = String.valueOf(resultObj);
	        
	        if (result.equals("1")) {
	            out.println("<script>alert('회원가입 성공!'); location.href='login.do';</script>");
	        } else {
	            out.println("<script>alert('회원가입 실패! 관리자에게 문의하세요.'); history.go(-1);</script>");
	        }

	    } else if (path.equals("/login.do")) {
	        service = new UserLogin();
	        service.exec(request, response);
	        
	        Object resultObj = request.getAttribute("result");
	        String result = String.valueOf(resultObj);

	        if (result.equals("1")) {
	        	request.getRequestDispatcher("user/home.jsp").forward(request, response); // 로그인 성공 → 홈으로 이동
	        } else {
	            out.println("<script>alert('로그인 실패! 이메일 또는 비밀번호를 확인하세요.'); history.go(-1);</script>");
	        }

	    } 

	
	}

}
