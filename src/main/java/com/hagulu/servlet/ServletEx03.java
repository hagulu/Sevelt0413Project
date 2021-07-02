package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class ServletEx03 extends HttpServlet {
	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("user_id");
		String name = request.getParameter("name");
		String ageString = request.getParameter("age");
		
		int age = Integer.parseInt(ageString);
		
		PrintWriter out = response.getWriter();
		
//		out.println("<html><head><title>get method</title></head>");
//		out.println("<body><h3> 아이디 : "+ id + " </h3>");
//		out.println("<h3> 이름 : "+ name + " </h3>");
//		out.println("<h3> 나이 : "+ age + " </h3></body>");
//		out.println("</html>");
		
		// {"user_id":"hagulu", "name":"김인규", "age":25}
		
		String userIdString = "\"user_id\":\""+ id +"\"";
		String nameString = "\"name\":\"" + name + "\"";
		String ageString2 = "\"age:\":" + age;
		
		out.println("{" + userIdString + "," + nameString + "," + ageString2 + "}");
		
	}

}
