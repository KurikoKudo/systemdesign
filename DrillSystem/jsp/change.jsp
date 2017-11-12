<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import= "beans.Question" %>
<% Question question = (Question)request.getAttribute("question");%>
<HTML>
<HEAD>
<script type="text/javascript">
</script>
<META http-equiv="Content-Style-Type" content="text/css">
<TITLE>問題の編集</TITLE>
</HEAD>
<body bgcolor="#ccffff">
<br>
<CENTER>
<form action="./ChangeQuestionServlet" method="post">
Q<%=question.getPageID()%> 問題編集<br>
<textarea name="body" rows="10" cols="70" maxlength="512"><%=question.getBody()%></textarea><br>
<input type="submit" value="更新">
<input type="hidden" name="id" value=<%=question.getPageID()%>>
<br>解答:
<input type="radio" name="answer" value="1">1
<input type="radio" name="answer" value="2">2
<input type="radio" name="answer" value="3">3
<input type="radio" name="answer" value="4">4
</form>
</CENTER>
<br>
</BODY>
</HTML>

