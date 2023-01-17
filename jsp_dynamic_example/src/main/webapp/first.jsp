<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= new java.util.Date() %><br>
<%=request.getRequestURI()%><br>
<%=request.getProtocol()%><br>
<%=request.getPathInfo()%><br>
<%=request.getQueryString()%><br>
<%=request.getContentLength()%><br>
<%=request.getContentType()%><br>
<%=request.getServerName()%><br>
<%=request.getServerPort()%><br>
<%=request.getAuthType()%>

</body>
</html>