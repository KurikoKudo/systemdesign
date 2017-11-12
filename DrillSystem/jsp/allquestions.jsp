<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.Question" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("question_list");
int user_role = (int)request.getAttribute("user_role");
%>

<HTML>
<HEAD>
<TITLE>問題一覧</TITLE>
</HEAD>
<BODY bgcolor="ffffba">
<SCRIPT language="JavaScript">
</SCRIPT>
<div align="center">

<FORM>
<TABLE border="0" cellpadding="0">
<TBODY>
<% for(int i=0;i<list.size();i++) {%>
<%Question question = (Question)list.get(i);%>
<TR>
<TD>
<FONT>
<a href="./ReadQuestionServlet?id=<%=question.getPageID()%>">Q<%=question.getPageID()%></a>
</FONT>
</TD>
</TR>
<% } %>
</TBODY>
</TABLE>
</FORM>
<% if(user_role==0){ %>

<a href="./GoMypageServlet">マイページに戻る</a>

<% } else {%>

<%if(list.size()<100){ %>
<a href=./registquestion.jsp>問題の新規追加</a>
<% }%>
<a href="./teachermypage.jsp">マイページに戻る</a>

<% } %>

</BODY>
</HTML>


