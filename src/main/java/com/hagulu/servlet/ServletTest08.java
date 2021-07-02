package com.hagulu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test08")
public class ServletTest08 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest reqeust, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String keyword = reqeust.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 맛집 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		out.println("<html><head><title>검색결과</title></head>");
		out.println("<body>");
		
		for(String content : list) {
			if(content.contains(keyword)) {
				// 강남역 최고 맛집 소개 합니다.
				//["강남역 최고", "소개 합니다."]
				
//				String[] contentArray = content.split(keyword);
//				
//				out.println(contentArray[0] + "<b>" + keyword + "</b>" + contentArray[1] + "<hr>");
				// 강남역 최고 맛집 소개 합니다.
				// 강남역 최고 <b>맛집</b> 소개 합니다.
				// 맛집 => <b>맛집</b>
				content = content.replace(keyword, "<b>" + keyword + "</b>");
				out.println(content + "<hr>");
			}
		}
		
		out.println("</body></html>");
	}

}
