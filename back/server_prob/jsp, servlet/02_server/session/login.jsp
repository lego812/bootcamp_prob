<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-05-29
  Time: 오후 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>로그인 정보 세션 저장</h1>
<%
  String id=request.getParameter("id");
  String pw=request.getParameter("pw");
  if(id==null){
    response.sendRedirect("/loginForm.html");
  }else{
    session.setAttribute("userid",id);
    session.setAttribute("password",pw);
    out.print("안녕하세요"+id+"<br>");
    out.print("<a href='loginInfo.jsp'>정보보기</a>");
  }
%>
</body>
</html>
