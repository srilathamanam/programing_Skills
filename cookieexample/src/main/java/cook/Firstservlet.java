package cook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Firstservlet
 */
public class Firstservlet extends HttpServlet {
	
    public Firstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{
	          response.setContentType("text/html");
	          PrintWriter p = response.getWriter();

	          int n1 = Integer.parseInt(request.getParameter("n1"));
	         int n2 = Integer.parseInt(request.getParameter("n2"));
	          p.println(n1+n2);

	          //Creating two cookies
	          Cookie c1=new Cookie("num1",String.valueOf(n1));
	          Cookie c2=new Cookie("num2",String.valueOf(n1));

	          //Adding the cookies to response header
	          response.addCookie(c1);
	          response.addCookie(c2);
	        p.print("<br><a href='move'>View Details</a>");
	          p.close();
	   }catch(Exception exp){
	       System.out.println(exp);
	    }
	}

	
}
