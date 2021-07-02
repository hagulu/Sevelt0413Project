package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class ServletTest07 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String money = request.getParameter("money");
		
		out.println("<html><head><title>배탈의민족</title></head>");
		out.println("<body>");
		
		// 서울시가 포함되지 않은경우 배달 불가 
		if(!address.contains("서울시")) {
			out.println("<h2>배달 불가 지역입니다.</h2>");
		} else if(card.equals("신한카드")) { // 신한카드는 사용 불가
			out.println("<h2>결제 불가 카드 </h2>");
		} else {
			out.println("<h3> " + address + " 배달 준비중</h3> <hr>");
			out.println("결제금액 "+ money + "원");
		}
		
		out.println("</body></html>");
		
	}

}
