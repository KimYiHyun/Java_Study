package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("id");
		String ups = request.getParameter("ps");
		String upsc = request.getParameter("psc");
		String unick = request.getParameter("nick");
		String str = "<html>Input ID: " + uid + "<br>";
		str += "Input Pass: " + ups + "<br>";
		str += "Input Pass(confirm): " + upsc + "<br>";
		str += "Input Nickname: " + unick;
		str += "</html>";
		PrintWriter out = response.getWriter();
		out.print(str);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}