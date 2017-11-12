package control;

import java.sql.Connection;

import beans.Question;
import dao.QuestionDAO;

public class QuestionManager {
	private Connection connection = null;

	public QuestionManager(){
	}

	public void Regist(String body,int answer){

		Question question = new Question();

		question.setBody(body);
		question.setAnswer(answer);

		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		dao.registQuestion(question, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;
	}

	public Question Select(int page_id) {

		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		Question question = dao.Select(page_id, this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		return question;
	}

	public void Update(Question question) {

		QuestionDAO dao = new QuestionDAO();
		this.connection = dao.createConnection();

		dao.Update(question,this.connection);

		dao.closeConnection(this.connection);

	}


}
