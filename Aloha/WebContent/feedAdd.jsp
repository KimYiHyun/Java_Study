<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	String uid = request.getParameter("id");
	String ucontent = request.getParameter("content");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns?serverTimezone=UTC&useSSL=false", "root", "yahait");
	Statement st = conn.createStatement();

	String str = "INSERT INTO feed(id,content,ts) VALUES(";
	str += "'" + uid + "',";
	str += "'" + ucontent + "',";
	str += "now()";
	str += ")";
	int cnt = st.executeUpdate(str);
	
	String res = (cnt > 0) ? "게시글 작성 완료." : "에러가 발생하였습니다.";
	out.print(res);
%>