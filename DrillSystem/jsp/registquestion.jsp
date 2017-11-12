<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<HTML>
<HEAD>
<TITLE>問題新規登録</TITLE>
</HEAD>
<BODY>
<form method="post" action="./RegistQuestionServlet">
<center>
問題内容:<br>
<textarea name="body" rows="10" cols="70" maxlength="512">以下の１から４の中から選びなさい。
１：
２：
３：
４：
</TEXTAREA>
<br>解答:
<input type="radio" name="answer" value="1">1
<input type="radio" name="answer" value="2">2
<input type="radio" name="answer" value="3">3
<input type="radio" name="answer" value="4">4
<br><INPUT type="submit" value="登録"></FORM>
</center>
</BODY>
</HTML>

