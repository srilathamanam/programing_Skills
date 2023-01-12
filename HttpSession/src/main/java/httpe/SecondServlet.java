package httpe;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        int x = (int) session.getAttribute("num1");
        out.println("first number "+x);
        int y = (int) session.getAttribute("num2");
        out.println("second number "+y);
	}

	

}
