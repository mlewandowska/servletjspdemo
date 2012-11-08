<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Book</title>
</head>
<body>
<jsp:useBean id="book" class="com.zadanie2.servlet.domain.Book" scope="session" />

<jsp:setProperty name="book" property="*" /> 

<jsp:useBean id="storage" class="com.zadanie2.servlet.storage.StorageService" scope="session" />

<% 
  storage.add(book);
%>

<p>Your book: </p>
<p>Title: ${book.title} </p>
<p>Year:	${book.year} </p>
<p>Author: ${book.author} </p>
<p>Publishing house: ${book.ph} </p>
<p>
  <a href="showAllBooks.jsp">See our books!</a>
</p>
</body>
</html>