package control;

import java.sql.Connection;

import beans.User;
import dao.UserDAO;

public class UserManager {

	private Connection connection = null;

	public UserManager(){
	}

	//  引数はUserオブジェクト
	public void registUser(User user){

		//  StudentDAOオブジェクト生成
		UserDAO userDAO = new UserDAO();

		//  DataBaseへ接続し、コネクションオブジェクトを生成する
		this.connection = userDAO.createConnection();

		//  StudentオブジェクトをDataBaseに登録する
		userDAO.registUser(user, this.connection);

		//  DataBaseとの接続を切断する
		userDAO.closeConnection(this.connection);

		//  コネクションオブジェクトを破棄する
		this.connection = null;
	}



}
