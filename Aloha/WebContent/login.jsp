<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	String uid =request.getParameter("id");
	String upass = request.getParameter("ps");
	
	if (uid == null || uid.equals("") ) {
	out.print("로그인 정보가 없습니다!");
	}
	else {
	//다음 로그인을 위해 아이디 정보 저장 (이 경우 세션 시간이 리셋됨)
	session.setAttribute("uid", uid);
	response.sendRedirect("main.jsp");
	}
%>