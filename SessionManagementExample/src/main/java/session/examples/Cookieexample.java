package session.examples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookieexample
 */
@WebServlet("/Cookieexample")
public class Cookieexample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Cookieexample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
        
        if(pass.equals("1234"))
        {
            Cookie ck = new Cookie("username", name);
            response.addCookie(ck);
            response.sendRedirect("nextcookie");
        }
	}

}
