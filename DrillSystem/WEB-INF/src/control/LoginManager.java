package control;

import java.sql.Connection;

import beans.User;
import dao.LoginDAO;

public class LoginManager {
	private Connection connection = null;

	public LoginManager() {}

	public User certifyUser(String user_id, String user_pass) {

		//daoの生成
		LoginDAO dao = new LoginDAO();

		this.connection = dao.createConnection();

		//LoginDaoのcertifyメソッドを実行し結果をuserに渡す
		User user = dao.certifyUser(user_id,this.connection);

		dao.closeConnection(this.connection);

		this.connection = null;

		if(user==null)
			return null;
		//DBから取得したパスワードと入力されたパスワードが一致するか判別する
		else if(user_pass.equals(user.getUserPass()))
		{
			return user;
		}
		else
			return null;

	}

}
