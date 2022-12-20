package servletexample.additon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddRequestDispatcher
 */
@WebServlet("/AddRequestDispatcher")
public class AddRequestDispatcher extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//for receving data 
		 int r=(int)request.getAttribute("sum");
		PrintWriter pr=response.getWriter();
		pr.println(r);
		
	}

}
