package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.User;
import control.HistoryManager;

public class GradingServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		HistoryManager manager = new HistoryManager();

		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String user_id = user.getUserID();

		int page_id = Integer.parseInt(request.getParameter("page_id"));

		//System.out.println("page,user = "+page_id+user_id);

		manager.Count(user_id, page_id);

		int correct_answer=Integer.parseInt(request.getParameter("answer"));
		int user_answer=Integer.parseInt(request.getParameter("useranswer"));
		request.setAttribute("answer",correct_answer);

		//System.out.println(correct_answer+"   "+user_answer);

		if(correct_answer == user_answer){
			response.sendRedirect(response.encodeRedirectURL("./correct.jsp"));
		}else{
			getServletContext().getRequestDispatcher("/jsp/false.jsp").forward(request, response);
		}


	}


}
