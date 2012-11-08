package com.zadanie1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/answers")
public class Odp1Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String selectedZrodlo = "";
		String[] zrodlo = request.getParameterValues("zrodlo");
		
		// (String zrodlo : request.getParameterValues("zrodlo")) {
		//	selectedZrodlo += zrodlo + " ";
		//}
		for (int k = 0; k < zrodlo.length; k++) {
			if (k == zrodlo.length - 1){
				selectedZrodlo = selectedZrodlo + " "+ zrodlo[k] ;
			}else{
				selectedZrodlo = selectedZrodlo + zrodlo[k] ;
			}
		}
		
		String selectedLetter = "";
		for (String letter : request.getParameterValues("letter")) {
			selectedLetter += letter + " ";
		}
		
		String selectedInterests="";
		String[] interests = request.getParameterValues("interests");
		for (int k = 0; k < interests.length; k++) {
			if (k == interests.length - 1){
				selectedInterests = selectedInterests + " "+ interests[k] + " " ;
			}else{
				selectedInterests = selectedInterests + " " + interests[k] ;
			}
		}
		
	
		
		out.println("<html><body><h2>You are registered now!</h2>" +
				"<p>Name: " + request.getParameter("name") + "<br />" +
				"<p>Surname: " + request.getParameter("surname") + "<br />" +
				"<p>Login: " + request.getParameter("login") + "<br />" +
				"<p>Password: " + request.getParameter("passwd") + "<br />" +
				"<p>Email: " + request.getParameter("email") + "<br />" +
				"<p>You found us: " + selectedZrodlo + "<br />" +
				"<p>Newsletter: " + selectedLetter + "<br />" +
				"<p>Interests: " + selectedInterests + "<br />" +
				
				
				"</body></html>");
		out.close();
	}

}
