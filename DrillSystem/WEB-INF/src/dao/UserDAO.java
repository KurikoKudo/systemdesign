package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.User;
import utility.DriverAccessor;

public class UserDAO extends DriverAccessor{

	public void registUser(User user, Connection connection){

		try{
			String sql = "insert into user values(?, ?, ?, ?)";
			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);
			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, user.getUserID());
			stmt.setString(2, user.getUserName());
			stmt.setString(3, user.getUserPass());
			stmt.setInt(4, user.getUserRole());

			stmt.executeUpdate();

			for(int i=1; i<101; i++){

				sql = "insert into history values(?,?,0)";
				//  SQLコマンドの実行
				stmt = connection.prepareStatement(sql);
				//  SQLコマンドのクエッションマークに値を、1番目から代入する
				stmt.setString(1, user.getUserID());
				stmt.setInt(2,i);
				stmt.executeUpdate();
			}

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}


}
