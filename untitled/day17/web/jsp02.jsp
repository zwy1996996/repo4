<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请将字符串("张三","张三","李四","王五")
存储到四大域(pageContext,request,session,ServletContext)中，
要求最终展示数据的时候,并且在jsp页面中进行展示,
如果4个字符串的名字在存的时候key统一定义为username--%>

<%
    request.setAttribute("username","张三");
    pageContext.setAttribute("username","张三");
    session.setAttribute("username","李四");
    application.setAttribute("username","王五");

%>
${username}<br>
${requestScope.username}<br>
${pageScope.username}<br>
${sessionScope.username}<br>
${applicationScope.username}<br>
</body>
</html>
