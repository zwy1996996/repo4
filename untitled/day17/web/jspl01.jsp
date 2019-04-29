<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>题干：计算1到10的阶乘</title>
</head>
<body>

<%!
    public int factorial(int n){
        int sum = 1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return sum;
    }
%>
<h1>计算1~10的阶乘</h1>
<%
    int result = 1;
    for (int i = 1; i <= 10; i++) {
        result = factorial(i);
        out.println(i+"的阶乘为:\t"+result+"<br>");
    }
%>
</body>
</html>
