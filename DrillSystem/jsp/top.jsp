<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<HTML>
<head>
<title>ドリルシステムログイン</title>
<style type ="text/css">
</style>
</head>
<body>

<SCRIPT language="JavaScript">

</SCRIPT>
<div align="center">
<font size="7">ドリルシステム　ログイン</font>
<br>
<br>
<br>
<br>
<br>
<FORM method="POST" action="./LoginServlet">
<CENTER>
<TABLE border="2" width="600" cellpadding="0">
   <TBODY>
      <TR>
         <TD><FONT><B>ID</B></FONT></TD>
         <TD><INPUT size="50" type="text" name="user_id"></TD>
      </TR>
      <TR>
         <TD><FONT><B>Pass</B></FONT></TD>
         <TD><INPUT size="40" type="password" name="user_pass"></TD>
      </TR>
   </TBODY>
</TABLE>
<INPUT type="submit" value = "Login">
</CENTER>
<a href="./signup.jsp">学習者の新規登録</a>
</FORM><font color="red">
${error}
</font>
</BODY>
</HTML>