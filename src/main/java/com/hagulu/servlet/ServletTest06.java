package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06 extends HttpServlet {
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		// {
		//		"addition":12,
//				"subtraction":24,
//				"mutiplication":1209
//				"division":3
//			}
		out.println("{");
		out.println("\"addtion\":" + (number1 + number2) + ",");
		out.println("\"subtraction\":" + (number1 - number2) + ",");
		out.println("\"mutiplication\":" + (number1 * number2) + ",");
		out.println("\"division\":" + (number1 / number2));
		out.println("}");
		
		
	}
}
