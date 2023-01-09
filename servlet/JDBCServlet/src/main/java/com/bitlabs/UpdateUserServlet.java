package com.bitlabs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateUserServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html;charset=UTF-8");
		  PrintWriter out=response.getWriter();  
	        out.println("<h1>Update User</h1>");  
	        String ids=request.getParameter("Id");  
	        int id=Integer.parseInt(ids);  
	          
	      //  UserData u=UserCRUD.getUser(id);  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
	}

}
