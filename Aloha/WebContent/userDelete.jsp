<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	String uid = request.getParameter("id");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1111");
	//Statement st = conn.createStatement();
	
	//String sql = "DELETE  FROM user WHERE id = '" + uid + "'";
	
	String sql = "DELETE  FROM user WHERE id = ?";
	PreparedStatement st = conn.prepareStatement(sql);
	st.setString(1, uid);
	
	int cnt = st.executeUpdate();
	
	String res = (cnt == 0) ? "회원삭제 중 에러가 발생했습니다." : "회웝 삭제가 완료되었습니다.";	
	out.print(res);


	st.close();  
	conn.close();  //메모리에 값이 생기지 않음.
%>	