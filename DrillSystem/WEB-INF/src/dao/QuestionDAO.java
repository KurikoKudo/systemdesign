package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.Question;
import utility.DriverAccessor;

public class QuestionDAO extends DriverAccessor{
	public void registQuestion(Question question, Connection connection){

		try{
			String sql = "insert into question values(0, ?, ?)";
			//  SQLコマンドの実行
			PreparedStatement stmt = connection.prepareStatement(sql);
			//  SQLコマンドのクエッションマークに値を、1番目から代入する
			stmt.setString(1, question.getBody());
			stmt.setInt(2, question.getAnswer());

			stmt.executeUpdate();

		}catch(SQLException e){

//			エラーが発生した場合、エラーの原因を出力する
			e.printStackTrace();

		} finally {
		}
	}

	public Question Select(int page_id,Connection connection){

		try{
			String sql="select * from question where page_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, page_id);

			//System.out.println(sql);

			ResultSet rs=stmt.executeQuery();

			rs.first();

			Question question = new Question();

			question.setPageID(page_id);
			question.setBody( rs.getString("body") );
			question.setAnswer( Integer.parseInt(rs.getString("answer")) );

			stmt.close();
			rs.close();

			return question;

		}catch(SQLException e){

			e.printStackTrace();

			return null;

		}finally{
		}
	}

	public void Update(Question question, Connection connection) {
		try{
			String sql="update question set body=? , answer=? where page_id = ?";

			/*System.out.println(question.getBody());
			System.out.println(question.getAnswer());
			System.out.println(question.getPageID());*/


			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, question.getBody());
			stmt.setInt(2, question.getAnswer());
			stmt.setInt(3, question.getPageID());

			stmt.executeUpdate();

		}catch(SQLException e){

			e.printStackTrace();

		}finally{
		}


	}
}
