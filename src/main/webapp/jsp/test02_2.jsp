<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 내가 시간이 보고 싶은건지, 날짜가 보고 싶은건지 
		// /jsp/test02_2.jsp?what=time
		// /jsp/test02_2.jsp?what=date
		String what = request.getParameter("what");
	
		// 시간 , 날짜를 저장할 문자열 변수
		String text = null;
		
		Date now = new Date();
		
		if(what.equals("time")) {
			SimpleDateFormat formatter = new SimpleDateFormat("현재시간 H시 m분 s초");
			text = formatter.format(now);
			// 시간을 나타내느 스트링
		} else if(what.equals("date")) {
			// 날짜를 나내내는 스트링
			SimpleDateFormat formatter = new SimpleDateFormat("오늘 날짜 yyyy년 M월 d일");
			text = formatter.format(now);
		}
	
	%>
	
	<div class="container">
		<div class="display1" ><%=text %></div>
	</div>
	
	
</body>
</html>