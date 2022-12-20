package servletexample.square;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SquareSecond
 */
//@WebServlet("/SquareSecond")
public class SquareSecond extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int r=Integer.parseInt(request.getParameter("n1"));
		PrintWriter pr=response.getWriter();
		pr.println(r*r);
	}

}
