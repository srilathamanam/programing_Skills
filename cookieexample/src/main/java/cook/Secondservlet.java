package cook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Secondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		       response.setContentType("text/html");
		       PrintWriter p = response.getWriter();
		 
		       //Reading cookies
		       Cookie c[]=request.getCookies(); 
		      
		       p.print("number 1: "+c[1].getValue()); 
		      
		       p.print("number 2: "+c[2].getValue());
		 
		       p.close();
		    }catch(Exception exp){
		       System.out.println(exp);
		     }
		  
	}

	
}
