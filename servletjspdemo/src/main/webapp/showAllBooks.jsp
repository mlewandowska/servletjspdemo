<%@page import="com.zadanie2.servlet.domain.Book"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Our Books</title>
</head>
<body>

<jsp:useBean id="storage" class="com.zadanie2.servlet.storage.StorageService" scope="application" />
<%
  for (Book book: storage.getAllBooks()) {
	  out.println("<p>Title: " + book.getTitle() 
			+ "</br>Year: " + book.getYear() 
			+ "</br>Author: " + book.getAuthor() 
			+ "</br>Publishing house: " + book.getPh() 
  		+ "</p>");
  }
%>
<p>
  <a href="getBookData.jsp">Add new book! :)</a>
</p>
</body>
</html>