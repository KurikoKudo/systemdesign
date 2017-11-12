<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<% String user_name = (String)request.getAttribute("user_name"); %>
<HTML>
<HEAD>
<TITLE>ユーザマイページ</TITLE>
</HEAD>
<BODY>

<%=user_name%>さんでログインしています。<br>
<br>
<a href="./GetQuestionServlet">問題一覧</a>
<br><br>
<a href="./GetHistoryServlet">解答履歴</a>
<br><br>
<a href="./LogoutServlet">ログアウト</a>
</BODY>
</HTML>
