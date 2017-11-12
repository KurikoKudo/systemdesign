package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.QuestionManager;

public class RegistQuestionServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{

		request.setCharacterEncoding("UTF-8");

		//getParameterの引数はjspのnameの中身と同じ
		String body=request.getParameter("body");
		int answer=Integer.parseInt(request.getParameter("answer"));

		QuestionManager manager=new QuestionManager();

		//DiaryManagerのRegistメソッドへ
		manager.Regist(body,answer);

		response.sendRedirect(response.encodeRedirectURL("./trueregist.jsp"));
	}
}
