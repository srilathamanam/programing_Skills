package servletexample.additon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Addition_Servlet2 extends HttpServlet {
	
       
   
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n1"));
		int c=a+b;
		//if  you send data from this servlet to html
		//System.out.println(c);
		//PrintWriter pr=res.getWriter();
		//pr.println(c);
		req.setAttribute("sum",c);
		RequestDispatcher rd=req.getRequestDispatcher("RDExample");
		rd.forward(req, res);
		// to send result to RD
		
	}

}
