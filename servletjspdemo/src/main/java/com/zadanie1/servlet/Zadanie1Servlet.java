package com.zadanie1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/zadanie1")
public class Zadanie1Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>Register form</h2>"
				+ "<form action='answers'>"
				+ "Name: <p><input type='text' name='name' /> <br /></p>"
				+ "Last name: <p><input type='text' name='surname' /> <br /></p>"
				+ "Login: <p><input type='text' name='login' /> <br /></p>"
				+ "Password: <p><input type='password' name='passwd' /> <br /></p>"
				+ "Email: <p><input type='text' name='email' /> <br /></p>"
				+

				"<p>"
				+ "Do you want to get newsletter? <br/>"
				+ "<input type='radio' name='letter' value='yes'>Yes<br />"
				+ "<input type='radio' name='letter' value='no'>No<br />"
				+ "</p>"
				+

				"<p>"
				+ "What are you interested in? <br/>"
				+ "<select name='interests' multiple><br/>"
				+ "<option value='cars'>Cars</option><br/>"
				+ "<option value='shopping'>Shopping</option><br/>"
				+ "<option value='cosmetics'>Cosmetics</option><br/>"
				+ "<option value='sport'>Sport</option><br/>"
				+ "</select>"
				+ "</p>"
				
				+ "<p>"
				+ "How did you find us? <br/>"
				+ "<input type='checkbox' name='zrodlo' value='internet'>In the internet<br />"
				+ "<input type='checkbox' name='zrodlo' value='news'>In the newspaper<br />"
				+ "<input type='checkbox' name='zrodlo' value='friends'>By friends<br />"
				+ "<input type='checkbox' name='zrodlo' value='random'>Random<br />"
				+ "</p>" + "<input type='submit' value=' Send' />" + "</form>"
				+ "</body></html>");
		out.close();

	
		
	}
	
	
}
