
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> 로그인 입력 화면</h1>
    <form action="loginInfo.jsp" method="get">
      <fieldset>
        <legend>로그인 폼</legend>
        <ul style="list-style: none">
          <li>
            <label for="id">아이디</label>
            <input type="text" id="id">
          </li>
          <li>
            <label for="pw">비밀번호</label>
            <input type="text" id="pw">
          </li>
          <input type="button" value="전송">
        </ul>
      </fieldset>

    </form>
</body>
</html>
