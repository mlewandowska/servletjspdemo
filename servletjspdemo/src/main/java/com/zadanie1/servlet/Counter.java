package com.zadanie1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/licznik")
public class Counter extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private int counter;

	public synchronized int getCounter() {
		return counter;
	}

	public synchronized int incCounter() {
		return (++counter);
	}

	public void init() throws ServletException {

		getServletContext().setAttribute("gCounter", new Counter());

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		Integer count = new Integer(1);
		String h;
		// session.setMaxInactiveInterval(3 * 60);

		if (session.isNew()) {
			h = "Nowa sesja";
		} else {
			h = "Stara sesja";
			Integer oldcount = (Integer) session.getAttribute("count");

			if (oldcount != null) {
				count = new Integer(oldcount.intValue() + 1);
			}
		}
		session.setAttribute("count", count);

		Counter gCounter = (Counter) getServletContext().getAttribute(
				"gCounter");
		gCounter.incCounter();

		out.println(h + " " + count + "<br/> ");

		out.println("ID SESJI: " + session.getId() + "<br/> " +

		"CZAS UTWORZENIA: " + session.getCreationTime() + "<br/> ");

		out.println("<br/> LICZNIK GLOBALNY: " + gCounter.getCounter() + " ");

	}

}
