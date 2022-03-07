<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
<%
	String no = request.getParameter("no");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1111");
	Statement st = conn.createStatement();
	
	String sql = "DELETE FROM feed WHERE no='"+no+"'";
	int rs = st.executeUpdate(sql);

	String res = (rs > 0) ? "게시글 삭제가 완료되었습니다." : "게시글삭제 중 에러가 발생하였습니다.";
	out.print(res);
%>