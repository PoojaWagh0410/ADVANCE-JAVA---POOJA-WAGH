package com.qspiders.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/my-servlet-4")
public class MyServlet4 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Response from Servlet 4</h1>");
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("./my-servlet-3");
		//requestDispatcher.include(req, resp);
		requestDispatcher.forward(req, resp);
	}

}
