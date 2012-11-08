<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thank you</title>
</head>
<body>
Name:<br/>  				<%=request.getParameter("name")%><br />
Login:<br/> 				<%=request.getParameter("login")%><br />
Newsletter:<br/> 	  <%=request.getParameter("letter")%><br />


Interests:		<%
for (String interests : request.getParameterValues("interests")) {
   out.println("<li>" + interests
                + "</li>");
}
%> 
Source:				<%
for (String zrodlo : request.getParameterValues("zrodlo")) {
   out.println("<li>" + zrodlo
                + "</li>");
}
%> <br/>

</body>
</html>