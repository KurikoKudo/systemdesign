package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;
import utility.DriverAccessor;

public class LoginDAO extends DriverAccessor{

	public User certifyUser(String id, Connection connection) {

		try{
			String sql="select * from user where user_id = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1 , id);

			ResultSet rs=stmt.executeQuery();

			rs.first();

			User user = new User();
			user.setUserID( rs.getString("user_id") );
			//System.out.println(user.getUserID());
			user.setUserName( rs.getString("user_name") );
			//System.out.println(user.getUserName());
			user.setUserPass( rs.getString("user_pass") );
			//System.out.println(user.getUserPass());
			user.setUserRole( rs.getInt("user_role"));
			//System.out.println(user.getUserRole());

			stmt.close();
			rs.close();

			return user;

		}catch(SQLException e){

			e.printStackTrace();

			return null;
		}finally{
		}
	}

}
