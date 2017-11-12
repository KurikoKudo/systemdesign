package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.Question;
import beans.User;
import control.QuestionManager;

public class ReadQuestionServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		int page_id=Integer.parseInt(request.getParameter("id"));

		//System.out.println("ReadQuestionServlet到達  page_id="+page_id);

		QuestionManager manager=new QuestionManager();

		Question question=manager.Select(page_id);

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		int user_role = user.getUserRole();

		request.setAttribute("question",question);
		if(user_role == 0)
		getServletContext().getRequestDispatcher("/jsp/question.jsp").forward(request, response);
		else
		getServletContext().getRequestDispatcher("/jsp/change.jsp").forward(request, response);
	}

}
