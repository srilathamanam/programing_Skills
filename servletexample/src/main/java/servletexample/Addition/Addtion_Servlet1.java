package servletexample.Addition;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addtion_Servlet1 extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res 
			) throws IOException {
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n1"));
		int c=a+b;
		System.out.println(c);
		PrintWriter pr=res.getWriter();
		pr.println(c);
	}

}
