<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%--请在用户登录页面进行登录,登录后跳转到首页,同时显示登录的用户名和登录时间.
如果用户名为tom,密码为123则可以登录,否则提示错误信息--%>
<
<form action="/login" method="post">
<table>
    <tr>
        <td>用户名</td>
        <td><input type="text" name="username"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="text" name="password"></td>
    </tr>
    <tr>

        <td colspan="2"><input type="submit" value="登录"></td>
    </tr>

</table>
</form>


</body>
</html>
