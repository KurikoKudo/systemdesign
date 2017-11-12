<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.History" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("history_list");
int count = (int)request.getAttribute("question_count");
%>
<HTML>
<HEAD>
<TITLE>解答履歴</TITLE>
</HEAD>
<BODY bgcolor=#ffa2ff>
<P align="center"><FONT size="6"><BR>
<BR>
解答履歴<BR>
<BR>
</FONT></P>
<center>
<table border="0" cellpadding="0">
<tr>
<td valign="top" width="150">問題番号</td>
<td valign="top" width="200">採点回数</td>
</tr>
<% for(int i=0; i<count; i++){%>
<%History history = (History)list.get(i);%>
<tr>
<td align="center">Q<%=history.getPageID()%></td>
<td align="center"><%=history.getCount()%></td>
</tr>

<%} %>
</table>
</center>
<a href="./GoMypageServlet">マイページに戻る</a>
</BODY>
</HTML>