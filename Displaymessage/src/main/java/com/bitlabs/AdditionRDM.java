package com.bitlabs;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AdditionRDM extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    
    public AdditionRDM() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(request.getParameter("n1"));
		int y=Integer.parseInt(request.getParameter("n2"));
	int r=x+y;
	request.setAttribute("sum", r);
		//RequestDispatcher rd=request.getRequestDispatcher("doRDRE");
	//rd.forward(request, response);
	PrintWriter out = response.getWriter(); 
	if(r==10)
	{
		RequestDispatcher rd=request.getRequestDispatcher("doRDRE");
		rd.forward(request, response);
	}
	else{  
        out.print("Sorry invalid numbers!");  
        RequestDispatcher rd=request.getRequestDispatcher("");//"/AdditionRM.html");  
        rd.include(request, response);  

}
	}
}
	
