package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.user.UserTitle;
import service.user.UserInterface;
import service.user.UserJoin;
import service.user.UserLogin;
import service.user.UserLogout;

//   /user/*
@WebServlet("*.u")
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
	    
	    if(path.equals("/joinView.u")) {
	    	
	    	request.getRequestDispatcher("user/signup.jsp").forward(request, response);
	    
	    } else if(path.equals("/join.u")) {
	    	//■ UserJoin
	    	service = new UserJoin();
	    	service.exec(request, response);
	    	
	    	int result = (int) request.getAttribute("dto");
	    	if(result == 1) {
	    		out.println("<script>alert('회원가입에 성공했습니다.'); location.href='loginView.u'; </script>");
	    	}else {
	    		out.println("<script>alert('관리자에게 문의바랍니다.'); location.href='login.u'; </script>");
	    	}
	    } else if(path.equals("/loginView.u")) {
	    	
	    	
	    	request.getRequestDispatcher("user/login.jsp").forward(request, response);
	    } else if(path.equals("/login.u")) {
	    	// ■ UserLogin
	    	service = new UserLogin();
	    	service.exec(request, response);
	    	
	    	int result = (int) request.getAttribute("result");
	    	if(result == 1 ) {
	    		out.println("<script>alert('로그인에 성공했습니다.'); location.href='home.u'; </script>");
	    	}else {
	    		out.println("<script>alert('로그인에 실패했습니다.'); location.href='loginView.u'; </script>");
	    	}
	    } else if(path.equals("/home.u")) {
	    	//■ UserTitle
	    	service = new UserTitle();
	    	service.exec(request, response);
	    	
	    	request.getRequestDispatcher("user/home.jsp").forward(request, response);
	    } else if(path.equals("/logout.u")) {
	    	//■ UserLogout
	    	service = new UserLogout();
	    	service.exec(request, response);
	    	
	    	
	    	//out.println("<script> location.href='loginView.u'; </script>");
	    	
	    }
	    
	    
	    
	    
	    
	    
		/*
		 * if(path.equals("/signup.user")) { service = new UserJoin(); // UserJoin 클래스
		 * 실행 service.exec(request, response); // 처리
		 * 
		 * // 결과 꺼내기 Object resultObj = request.getAttribute("dto"); String result =
		 * String.valueOf(resultObj);
		 * 
		 * if (result.equals("1")) {
		 * out.println("<script>alert('회원가입 성공!'); location.href='login.do';</script>");
		 * } else { out.
		 * println("<script>alert('회원가입 실패! 관리자에게 문의하세요.'); history.go(-1);</script>");
		 * }
		 * 
		 * } else if (path.equals("/loginView.user")) {
		 * request.getRequestDispatcher("user/home.jsp").forward(request, response);
		 * 
		 * } else if (path.equals("/login.user")) { service = new UserLogin();
		 * service.exec(request, response);
		 * 
		 * 
		 * Object resultObj = request.getAttribute("result"); String result =
		 * String.valueOf(resultObj);
		 * 
		 * if (result.equals("1")) {
		 * out.println("<script>alert('로그인 성공!'); location.href='home.user';</script>");
		 * //request.getRequestDispatcher("user/home.jsp").forward(request, response);
		 * // 로그인 성공 → 홈으로 이동 } else { out.
		 * println("<script>alert('로그인 실패! 이메일 또는 비밀번호를 확인하세요.'); history.go(-1);</script>"
		 * ); }
		 * 
		 * } else if (path.equals("/home.user")) { service = new UserHome();
		 * service.exec(request, response);
		 * 
		 * 
		 * 
		 * request.getRequestDispatcher("user/home.jsp").forward(request, response);
		 * 
		 * } else if (path.equals("/logout.user")){ service = new UserLogout();
		 * service.exec(request, response);
		 * 
		 * 
		 * }
		 */

	
	}

}
