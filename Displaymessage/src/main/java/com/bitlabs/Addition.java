package com.bitlabs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Addition
 */
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		int x=Integer.parseInt(request.getParameter("n1"));
		int y=Integer.parseInt(request.getParameter("n2"));
		PrintWriter r=response.getWriter();
		r.print("addtion"+(x+y));
	}

}
