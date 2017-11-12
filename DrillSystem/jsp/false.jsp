<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<% int answer = (int)request.getAttribute("answer"); %>
<HTML>
<HEAD>
<TITLE>不正解</TITLE>
</HEAD>
<BODY bgcolor=#8288ff>
<P align="center"><FONT size="12"><BR>
<BR>
不正解！<BR>
<BR>
正解は<%=answer%>です。
</FONT></P>
<a href="./GetQuestionServlet">問題一覧に戻る</a>
</BODY>
</HTML>