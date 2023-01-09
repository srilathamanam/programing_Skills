package student;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class student_insert extends HttpServlet {
	
    public student_insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcexample", "root", "Ammu@5490");
								
		System.out.println("Inserting records into the table...");
		String s = "INSERT INTO JDBCSTUDENT VALUES(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(s);
		pstmt.setInt(1, Integer.valueOf(request.getParameter("stdno")));
		pstmt.setString(2, request.getParameter("stdname"));
		pstmt.setInt(3, Integer.valueOf(request.getParameter("stdfee")));
		pstmt.executeUpdate();
			PrintWriter o=response.getWriter();
			pstmt.close();
			con.close();			
			o.println("Data inserted sucessfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
