<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!--------------------------------
	signup.jsp
---------------------------------->
<HTML>
<BODY>
学習者アカウントの登録<br>
以下の内容を正しく入力してください。<br>
<FORM action="./UserRegistServlet" method="post"><br>
学籍番号：半角英数字のみ使用可能。16字以内。ex)e155407<br>
<INPUT type="text" name="user_id" maxlength="16"><br>
氏名：フルネームを記入してください。32字以内。ex)学芸太郎<br>
<INPUT type="text" name="user_name" maxlength="32"><br>
パスワード：半角英数字、記号が使用可能。32字以内。<br>
<INPUT type="text" name="user_pass" maxlength="32">
<INPUT type="submit" name="OK">
</FORM>
</BODY>
</HTML>
