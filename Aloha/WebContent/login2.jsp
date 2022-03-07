<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date" %>

<%
	String uid = request.getParameter("id");
	String str = "입력 아이디: " + uid + "<br><br>";
	out.print(str);	

	String date = (new Date()).toString();
%>
로그인 시간: <%= date %>
<br><br>
<%
	int count = 0;
	String sval = (String) application.getAttribute("counter");
	if(sval != null) {
	count = Integer.valueOf(sval);
	}
	out.print("방문자수: " + count);
	count++;
	application.setAttribute("counter", String.valueOf(count));
%>