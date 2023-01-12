package httpe;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
	          response.setContentType("text/html");
	          PrintWriter p = response.getWriter();

	          int n1 = Integer.parseInt(request.getParameter("n1"));
	         int n2 = Integer.parseInt(request.getParameter("n2"));
	          p.println(n1+n2);

	          HttpSession session = request.getSession();
	            session.setAttribute("num1", n1);
	            session.setAttribute("num2", n2);
	        p.print("<br><a href='move'>View Details</a>");
	          p.close();
	   }catch(Exception exp){
	       System.out.println(exp);
	    }

	
	}
}

