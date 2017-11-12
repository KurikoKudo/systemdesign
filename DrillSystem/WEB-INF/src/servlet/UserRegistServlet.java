package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.User;
import control.UserManager;

public class UserRegistServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

//  doGetメソッドは使わないので、doPostメソッドへ転送
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	doPost(request, response);
}

//  requestオブジェクトには、フォームで入力された文字列などが格納されている。
//  responseオブジェクトを使って、次のページを表示する
public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{



	// requestオブジェクトの文字エンコーディングの設定
	request.setCharacterEncoding("UTF-8");

	// requestオブジェクトから登録情報の取り出し
	String user_id = request.getParameter("user_id");
	String user_name = request.getParameter("user_name");
	String user_pass = request.getParameter("user_pass");

	/*System.out.println("取得した文字列は"+user_id+"です！");
	System.out.println("取得した文字列は"+user_name+"です！");
	System.out.println("取得した文字列は"+user_pass+"です！");*/

	// studentオブジェクトに情報を格納
	User user = new User(user_id, user_name, user_pass,0);

	//  StudentManagerオブジェクトの生成
	UserManager manager = new UserManager();

	//  登録
	manager.registUser(user);

	//  成功画面を表示する
	response.sendRedirect(response.encodeRedirectURL("./regist.jsp"));
	}

}
