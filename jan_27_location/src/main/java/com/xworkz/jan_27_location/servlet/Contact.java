package com.xworkz.jan_27_location.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/con")
public class Contact extends HttpServlet {
	public Contact() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String comments = req.getParameter("cmnts");

		if (name.length() > 3 && mobile.length() >= 10) {
			System.out.println("Name : " + name);
			System.out.println("Email : " + email);
			System.out.println("Mobile : " + mobile);
			System.out.println("Comments : " + comments);

		} else
			System.out.println("Invalid Deatils");

		PrintWriter wr = resp.getWriter();

		if (name.length() > 3 && mobile.length() >= 10) {
			wr.print("<span style='color:green'> <h1>" + name + " Recived </h1></span>");
			wr.print("<span style='color:green'> <h1>" + email + " Recived </h1></span>");
			wr.print("<span style='color:green'> <h1>" + mobile + " Recived </h1></span>");
			wr.print("<span style='color:green'> <h1>" + comments + " Recived </h1></span>");

			wr.print("<h1> <a href='contact.html'>Send Again</a></h1> ");
			wr.print("<h1> <a href='index.html'>Go to HOME</a></h1> ");

		} else {
			wr.print("<span style='color:red'> <h1> InValid Details entered </h1></span>");
			wr.print("<h1> <a href='contact.html'>Re Enter Data</a></h1> ");
		}

		resp.setContentType("text/html");

	}
}
