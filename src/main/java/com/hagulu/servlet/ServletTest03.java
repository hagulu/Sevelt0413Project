package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String dateString = formatter.format(date);
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>기사</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>[단독]고양이가 야옹해</h1> 기사입력시간 : " + dateString);
		out.println("<hr>");
		out.println("끝 </body></html>");
		
	}
}
