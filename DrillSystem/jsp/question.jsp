<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "javax.servlet.http.HttpSession" %>
<%@ page import= "beans.Question" %>
<%
Question question = (Question)request.getAttribute("question");
String body = question.getBody();
%>
<HTML>
<head>
<title>問題を解く</title>
<style type ="text/css">

</style>
</head>
<body bgcolor="#99ffff">

<SCRIPT language="JavaScript">
</SCRIPT>
<div align="center">
</div>
<div align="left">

<P>
<font size="+2">Q<%=question.getPageID()%></font><br>
<br>
<% if(body != null){
	String htmlbody = body.replaceAll("\n","<br>").replaceAll(" ","&nbsp;");
	out.print(htmlbody);
}%>

</P>

<FORM method="POST" action = "./GradingServlet">
<input type="hidden" name="answer" value="<%=question.getAnswer()%>" >
<br>解答:
<input type="radio" name="useranswer" value=1>1
<input type="radio" name="useranswer" value=2>2
<input type="radio" name="useranswer" value=3>3
<input type="radio" name="useranswer" value=4>4
<input type="submit" value="採点">

<input type="hidden" name="page_id" value="<%=question.getPageID()%>">

</form>

</BODY>
</HTML>
