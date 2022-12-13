package com.bitlabs;
import com.bitlabs.UserData;
import com.bitlabs.UserCRUD;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class InsertUserServlet extends HttpServlet {
	
    public InsertUserServlet() {
        super();
        
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html ");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html ");
		 PrintWriter out=response.getWriter();
		 String ids=request.getParameter("Id");
		 int id=Integer.parseInt(ids);
         String name=request.getParameter("Name");  
        String password=request.getParameter("Email");  
        String email=request.getParameter("Password");  
       
          
        UserData u=new  UserData(); 
        u.setId(id);
        u.setName(name);
        u.setPassword(email);
        u.setEmail(password);
             
          
        int f=UserCRUD.InsertUser(u);
        if(f>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("UserLogin.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    
 
        
        
    }
	}


