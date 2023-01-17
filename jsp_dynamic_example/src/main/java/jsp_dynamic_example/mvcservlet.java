package jsp_dynamic_example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class mvcservlet extends HttpServlet {
	
   
    public mvcservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String name = request.getParameter("uname");
		  String password = request.getParameter("pass");
		  MVCBean ob = new MVCBean();
		  ob.setUsername(name);
		ob.setUserpassword(password);
		  request.setAttribute("bean", ob);
		  boolean status = ob.validate();
		  if (status) {
		   RequestDispatcher rd = request.getRequestDispatcher("mvsucess.jsp");
		   rd.forward(request, response);
		  } else {
		   RequestDispatcher rd = request.getRequestDispatcher("mvcerror.jsp");
		   rd.forward(request, response);
		  }
	}

}
