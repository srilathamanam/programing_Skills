package com.bitlabs;
import java.sql.Connection;
import java.sql.DriverManager;
//import com.bitlabs.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserCRUDDAO {
	Connection con;
	public void conncetion_establish() throws SQLException
	{
		 con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/jdbcexample","root","Ammu@5490");  
	}
	
	    
	    public boolean insertdata(UserLoin ul) throws SQLException {
	    	
			try{  
				
				
				
				System.out.println("Inserting records into the table...");   
	    	String sql = "INSERT INTO users (id, name, pass,emai) VALUES (?, ?, ?)";
	        
	    	conncetion_establish();
	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setInt(1, ul.getId());
	        statement.setString(2, ul.getName());
	        statement.setString(3, ul.getPass());
			statement.setString(3, ul.getEmal());
	         
	        boolean res = statement.executeUpdate() > 0;
	        statement.close();
	        
	        return res;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return false;
	    }
	     
	    public List<UserLoin> showRecords() throws SQLException {
	        List<UserLoin> users = new ArrayList<>();
	         
	        String sql = "SELECT * FROM user";
	        conncetion_establish();       
	         
	        Statement statement = con.createStatement();
	        ResultSet res = statement.executeQuery(sql);
	         
	        while (res.next()) {
	            int id = res.getInt("User_id");
	            String Name = res.getString("name");
	            String pass = res.getString("Password");
	            String emai = res.getString("email");
	             
	            UserLoin ul = new UserLoin(id,Name,pass,emai);
	            users.add(ul);
	        }
	         
	        res.close();
	        statement.close();
	         
	        
	         
	        return users;
	    }
	     
	    public boolean deleteUser(UserLoin ul) throws SQLException {
	        String sql = "DELETE FROM user where user_id = ?";
	         
	        conncetion_establish();       
	         
	         
	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setInt(1, ul.getId()); 
	         
	        boolean res = statement.executeUpdate() > 0;
	        statement.close();
	       
	        return res;     
	    }
	     
	    public boolean updateUser(UserLoin ul) throws SQLException {
	        String sql = "UPDATE User SET Name = ?, password = ?, email = ?";
	        sql += " WHERE user_id = ?";
	        
	         
	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setString(1, ul.getName());
	        statement.setString(2, ul.getPass());
	        statement.setString(3, ul.getEmal());
	        statement.setInt(4, ul.getId());
	         
	        boolean res = statement.executeUpdate() > 0;
	        statement.close();
	        
	        return res;     
	    }
	     
	    public UserLoin getUser(int id) throws SQLException {
	    	UserLoin ul = null;
	        String sql = "SELECT * FROM user WHERE user_id = ?";
	         
	        conncetion_establish();   
	         
	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setInt(1, id);
	         
	        ResultSet res = statement.executeQuery();
	         
	        if (res.next()) {
	            String name = res.getString("name");
	            String pass = res.getString("password");
	           String emai = res.getString("email");
	             
	            ul = new UserLoin(id, name, pass, emai);
	        }
	         
	        res.close();
	        statement.close();
	         
	        return ul;
	    }
	}


