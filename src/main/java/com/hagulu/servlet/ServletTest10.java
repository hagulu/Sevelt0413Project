package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		out.println("<html><head><title>로그인결과</title></head> <body>");
		// user id 일치 여부 
		if(!userId.equals(userMap.get("id"))) {
			out.println("<h1>ID가 일치하지 않습니다.</h1>");
		} else if(!password.equals(userMap.get("password"))) {  // 비밀번호 일치 여부 
			out.println("<h1>비밀번호가 일치하지 않습니다.</h1>");
		} else {
			out.println(userMap.get("name") + "님 환영합니다.");
		}
		out.println(password + " </body></html>");
	}
	
	private final Map<String, String> userMap = new HashMap<String, String>() {
		{
			put("id", "hagulu");
			put("password", "asdf");
			put("name", "김인규");
		}
	};


}
