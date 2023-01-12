package url;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
	          response.setContentType("text/html");
	          PrintWriter p = response.getWriter();

	          int n1 = Integer.parseInt(request.getParameter("n1"));
	         int n2 = Integer.parseInt(request.getParameter("n2"));
	         // p.println(n1+n2);

	          response.sendRedirect("Addition?sum="+ (n1+n2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}
	
}
