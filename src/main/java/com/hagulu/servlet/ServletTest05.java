package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test05")
public class ServletTest05 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 단수를 받아서 구구단을 리스트로 출력하는 페이지 
		String numberString = request.getParameter("number");
		int number = Integer.parseInt(numberString);
		
		out.println("<html> <head> <title>구구단</title> </head>");
		out.println("<body><ul>");
		for(int i = 1; i < 10; i++) {
			out.println("<li>" + number + " X " + i + " = " + (number * i) + " </li>");	
		}
		
		out.println("</ul></body></html>");
		
	}

}
