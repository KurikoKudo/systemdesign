package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;

public class GoMypageServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String user_name = user.getUserName();

		request.setAttribute("user_name", user_name);

		getServletContext().getRequestDispatcher("/jsp/usermypage.jsp").forward(request,response);

	}
}
