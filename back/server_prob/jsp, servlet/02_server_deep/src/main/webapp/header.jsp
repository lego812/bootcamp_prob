<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
<%
  Calendar cal= Calendar.getInstance();
  int hour=cal.get(Calendar.HOUR_OF_DAY);
  int minute=cal.get(Calendar.MINUTE);
  int second=cal.get(Calendar.SECOND);
%>

<%=hour%>시 <%=minute%>분 <%=second%>초
</div>
