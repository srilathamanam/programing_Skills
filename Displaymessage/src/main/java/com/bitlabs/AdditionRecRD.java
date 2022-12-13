package com.bitlabs;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class AdditionRecRD extends HttpServlet 
{
	
    public AdditionRecRD() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res=(int) request.getAttribute("sum");
		PrintWriter p=response.getWriter();
		p.print("done"  +res);
	}

}


