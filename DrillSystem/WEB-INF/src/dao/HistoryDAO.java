package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.History;
import utility.DriverAccessor;

public class HistoryDAO extends DriverAccessor{

	public void Count(History history,Connection connection){

		try{

			String sql = "update history set count = count+1 where user_id = ? and page_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, history.getUserID());
			stmt.setInt(2, history.getPageID());

			stmt.executeUpdate();

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}

	}

}


