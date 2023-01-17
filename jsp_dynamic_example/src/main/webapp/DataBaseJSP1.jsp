<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/jdbcexample";
String databaseuser = "root";
String datapassword = "Ammu@5490";
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement stmt = null;
ResultSet rs = null;

try{ 
connection = DriverManager.getConnection(connectionUrl, databaseuser, datapassword);
stmt=connection.createStatement();
String sql ="SELECT * FROM jdbcstudent";
rs = stmt.executeQuery(sql);
while(rs.next()){
	out.println(rs.getString(2));

}
rs = stmt.executeQuery(sql);
while(rs.next()){
%>
<%=rs.getString(2) %>

<% 
}
} catch (Exception e) {
e.printStackTrace();
}
%>
