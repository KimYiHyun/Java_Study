<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	String uid = request.getParameter("id");
	String upass = request.getParameter("ps");
	String upass2 = request.getParameter("ps2");
	String uname = request.getParameter("nick");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysns", "root", "1111");
	//Statement st = conn.createStatement();
	
	//Duplication check using SELECT
	//String sql = "SELECT id FROM user WHERE id = '" + uid + "'";
	String sql = "SELECT id FROM user WHERE id = ?";
	
	PreparedStatement st = conn.prepareStatement(sql);
	st.setString(1, uid);
	
	ResultSet rs = st.executeQuery();   //"kwak@abc.com"
	if(rs.next()) {
		out.print("이미 가입한 회원입니다.");	
	}
	else {
		st.close();
		
		sql = "INSERT INTO user(id, password, name) VALUES (?, ?, ?)";
		
		st = conn.prepareStatement(sql);
		st.setString(1, uid);//sql += "'" + uid + "', ";
		st.setString(2, upass);//sql += "'" + upass + "', ";
		st.setString(3, uname);//sql += "'" + uname + "'";
		//sql += ")";
		
		int cnt = st.executeUpdate();
		String res = (cnt == 0) ? "회원가입 중 에러가 발생하였습니다." : "회웝가입이 완료되었습니다.";
		
		out.print(res);
	}
	
	
	
	st.close();
	conn.close();
%>	