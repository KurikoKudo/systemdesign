package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Question;
import utility.DriverAccessor;

public class GetQuestionDAO extends DriverAccessor{
	public ArrayList GetList(Connection connection){

		try{
			String sql="select * from question";

			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();

			ArrayList list = new ArrayList();
			while(rs.next())
			{
				Question question = new Question();

				question.setPageID( rs.getInt("page_id") );
				question.setBody( rs.getString("body") );
				question.setAnswer( rs.getInt("answer") );


				list.add(question);
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
