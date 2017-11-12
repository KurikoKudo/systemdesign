package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Question;
import control.QuestionManager;

public class ChangeQuestionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		Question question = new Question();
		//System.out.println("チェンジサーブレット到達確認");
		//System.out.println(request.getParameter("id"));
		question.setBody(request.getParameter("body"));
		question.setPageID(Integer.parseInt(request.getParameter("id")));
		question.setAnswer(Integer.parseInt(request.getParameter("answer")));

		QuestionManager manager = new QuestionManager();
		manager.Update(question);

		response.sendRedirect(response.encodeRedirectURL("./trueregist.jsp"));


	}


}
