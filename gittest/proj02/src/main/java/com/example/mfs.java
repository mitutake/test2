package com.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mfs
 */
public class mfs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		String message = """
				<!DOCTYPE html>
				<html>
				<head>
				<meta charset="UTF-8">
				<title>Welcome</title>
				</head>
				<body>
				<h1>Hello,world</h1>
				<p>こんにちは</p>
				</body>
				</html>
				""";
		response.getWriter().append(message);
	}

}
