<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new book</title>
</head>
<body>

<jsp:useBean id="storage" class="com.zadanie2.servlet.storage.StorageService" scope="application" />
<jsp:useBean id="book" class="com.zadanie2.servlet.domain.Book" scope="session" />

<form action="addBook.jsp">

  Title :<input type="text" name="title" value="${book.title}" /><br />
  Year :<input type="text"  name="year" value="${book.year}" /><br />
  Author :<input type="text"  name="author" value="${book.author}" /><br />
  Publishing house :<input type="text"  name="ph" value="${book.ph}" /><br />
  
  <input type="submit" value=" OK ">
  
</form>
</body>
</html>