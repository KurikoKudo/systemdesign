package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import control.GetHistoryManager;
import control.GetQuestionManager;

public class GetHistoryServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");


		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String user_id = user.getUserID();

		GetHistoryManager manager = new GetHistoryManager();
		ArrayList list = manager.GetList(user_id);


		GetQuestionManager questionmanager = new GetQuestionManager();
		int question_count = questionmanager.Count();

		request.setAttribute("history_list", list);
		request.setAttribute("question_count", question_count);
		getServletContext().getRequestDispatcher("/jsp/history.jsp").forward(request, response);
	}
}
