package control;

import java.sql.Connection;

import beans.History;
import dao.HistoryDAO;

public class HistoryManager {

	private Connection connection = null;

	public HistoryManager(){}

	public void Count(String user_id,int page_id){

		History history = new History();

		history.setUserID(user_id);
		history.setPageID(page_id);

		HistoryDAO dao = new HistoryDAO();

		this.connection = dao.createConnection();
		dao.Count(history, this.connection);
		dao.closeConnection(this.connection);

		this.connection=null;


	}

}
