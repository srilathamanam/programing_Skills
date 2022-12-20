package servletexample.SessionExample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/HTTpSessionExample")
public class HTTpSessionExample extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        
	        String name = request.getParameter("username");
	        String pass = request.getParameter("password");
	        
	        if(pass.equals("abc123"))
	        {
	            //creating a session
	            HttpSession session = request.getSession();
	            session.setAttribute("username", name);
	            response.sendRedirect("Welcome");
	        }
	    }
	}


