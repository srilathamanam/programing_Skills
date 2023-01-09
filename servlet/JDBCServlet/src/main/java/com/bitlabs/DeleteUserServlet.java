package com.bitlabs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteUserServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String ids=request.getParameter("Id");  
        int id=Integer.parseInt(ids);  
        UserCRUD.deleteUser(id);  
       // response.sendRedirect("ViewEmpServlet?page=1");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	}

}
