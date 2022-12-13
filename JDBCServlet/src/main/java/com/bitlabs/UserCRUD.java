package com.bitlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class UserCRUD {
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcexample","root","Ammu@5490");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int InsertUser(UserData u){  
        int flag=0;  
        try{  
            Connection con=UserCRUD.getConnection();  
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into users(user_id,username,password,email) values (?,?,?,?)");  
            ps.setInt(1,u.getId());  
            ps.setString(2,u.getName());  
            ps.setString(3,u.getPassword());  
            ps.setString(4,u.getEmail());  
              
            flag=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return flag;  
    }  
    public static int updateUser(UserData u){  
        int flag=0;  
        try{  
            Connection con=UserCRUD.getConnection();  
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("update users set user_id=?,username=?,password=?,email=? where user_id=?");  
            ps.setInt(1,u.getId());  
            ps.setString(2,u.getName());  
            ps.setString(3,u.getPassword());  
            ps.setString(4,u.getEmail());  
           
              
            flag=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return flag;  
    }  
    public static int deleteUser(int id){  
        int flag=0;  
        try{  
            Connection con=UserCRUD.getConnection();  
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("delete from users where id=?");  
            ps.setInt(1,id);  
            flag=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return flag;  
    }  
    public static UserData getUser(int id){  
        UserData u=new UserData();  
          
        try{  
            Connection con=UserCRUD.getConnection();  
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from users where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=(ResultSet) ps.executeQuery();  
            if(rs.next()){  
                u.setId(rs.getInt(1));  
               u.setName(rs.getString(2));  
                u.setPassword(rs.getString(3));  
                u.setEmail(rs.getString(4));  
                
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return u;  
    }  
    public static List<UserData> getAllUsers(){  
        List<UserData> list=new ArrayList<UserData>();  
          
        try{  
            Connection con=UserCRUD.getConnection();  
            PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from users");  
            ResultSet rs=(ResultSet) ps.executeQuery();  
            while(rs.next()){  
                UserData u=new UserData();  
                u.setId(rs.getInt(1));  
                u.setName(rs.getString(2));  
                u.setPassword(rs.getString(3));  
                u.setEmail(rs.getString(4));  
               
                list.add(u);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
        
      }
