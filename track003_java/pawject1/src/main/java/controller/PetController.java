package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.pet.PetInfoService;
import service.pet.PetInterface;
import service.user.UserInterface;

/**
 * Servlet implementation class PetController
 */
@WebServlet("*.pet")
public class PetController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PetController() {
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
	    
	    PetInterface service = null;
	    
	    
	    if(path.equals("/petinfo.pet")) {
	    	service = new PetInfoService();
	    	service.exec(request, response);
	    	
	    	//int userid = Integer.parseInt(request.getParameter("userid"));
	    	
	    	//request.getRequestDispatcher("pet/info?userid=" + userid).forward(request, response);
	    	
	    	request.getRequestDispatcher("pet/petinfo.jsp").forward(request, response);
	    }
		
	}
}
