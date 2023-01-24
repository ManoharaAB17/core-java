package com.xworkz.jan_24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/jann")
public class ServerMethods extends HttpServlet {
	public ServerMethods() {
		System.out.println("Constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOPOST method in server");
		String data = "Displaying doPost in server";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOGET method in server");
		String data = "Displaying doGet in server";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
		
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPut method");
		String str1 = "Displaying doPut in web server......";
		PrintWriter writer = resp.getWriter();
		writer.print(str1);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DODELETE method in server");
		String data = "Displaying doDelete in server";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOHEAD method in server");
		String data = "Displaying doHead in server";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DOOPTIONS method in server");
		String data = "Displaying doOptions in server";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse ar) throws ServletException, IOException {
		System.out.println("Running DOTRACE method in server");
		String data = "Displaying doTrace in server";
		PrintWriter writer = ar.getWriter();
		writer.print(data);
		ar.setContentType("text/plain");
	}
}
