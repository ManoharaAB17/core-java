package com.xworkz.jan_23_servlet.train;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/amithab")
public class Amitabachan extends HttpServlet {
	public Amitabachan() {
		System.out.println("Amitha Bachan");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Amitha Bachan is an Indain Actor");
	}
}
