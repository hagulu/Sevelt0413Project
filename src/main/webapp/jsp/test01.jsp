<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		int[] scores = {80, 90, 100, 95, 80};
		
		int sum = 0; 
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double average = sum / (double)scores.length;
	%>
	
	<h1>평균 : <%=average %></h1>
	
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		sum = 0;
		for(String answer:scoreList) {
			if(answer.equals("O")) {
				sum += 10;
			}
		}
	%>
	
	<h1> 총점은 <%=sum %> </h1>
	
	<%!
		// 1 부터 n까지의 합을 구하는 함수 
		public int getSum(int number) {
			int sum = 0; 
			for(int i = 1; i <= number; i++) {
				sum += i;
			}
			
			return sum;
		}
	%>
	
	<h1> 1부터 50까지의 합은 <%=getSum(50) %></h1>
	
	<%
		String birthDay = "20010820";
		String yearString = birthDay.substring(0, 4);
		int year = Integer.parseInt(yearString);
		
		int age = 2021 - year + 1;
	%>
	
	<h1> <%=year %>연생의 나이는 <%=age %>살</h1>
	
	
	
	

</body>
</html>