<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-05-29
  Time: 오후 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>방문자수 조회하기 화면</h1>
<%
  int count = (Integer)application.getAttribute("countValue");
%>
현재까지 총 방문자수: <%= count %>
</body>
</html>
