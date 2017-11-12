package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import control.GetQuestionManager;

public class GetQuestionServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		GetQuestionManager manager = new GetQuestionManager();

		ArrayList list = manager.GetList();

		request.setAttribute("question_list", list);

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		int user_role = user.getUserRole();

		request.setAttribute("user_role", user_role);

		getServletContext().getRequestDispatcher("/jsp/allquestions.jsp").forward(request,response);

	}
}
