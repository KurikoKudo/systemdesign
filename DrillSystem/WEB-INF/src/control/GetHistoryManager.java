package control;

import java.sql.Connection;
import java.util.ArrayList;

import dao.GetHistoryDAO;

public class GetHistoryManager {
	private Connection connection = null;

	public ArrayList GetList(String user_id) {

		//System.out.println(user_id);

		GetHistoryDAO dao = new GetHistoryDAO();
		this.connection = dao.createConnection();

		ArrayList list = dao.GetList(user_id,this.connection);
		dao.closeConnection(this.connection);

		this.connection = null;

		return list;
	}

}
