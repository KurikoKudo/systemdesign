package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.History;
import utility.DriverAccessor;

public class GetHistoryDAO extends DriverAccessor{
	public ArrayList GetList(String user_id,Connection connection){

		try{
			String sql="select * from history where user_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1,user_id);

			ResultSet rs=stmt.executeQuery();

			ArrayList list = new ArrayList();
			while(rs.next())
			{
				History history = new History();

				history.setPageID(Integer.parseInt(rs.getString("page_id")));
				history.setCount(Integer.parseInt(rs.getString("count")));

				System.out.println(history.getPageID());
				System.out.println(history.getCount());


				list.add(history);

			}

			stmt.close();
			rs.close();

			return list;

		}catch(SQLException e){

			e.printStackTrace();

			return null;

		}finally{
		}
	}



}
