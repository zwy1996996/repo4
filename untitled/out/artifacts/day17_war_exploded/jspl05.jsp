<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itheima.domain.Use" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--题干：现有一个JavaBean User对象 name属性值为张三
 age属性值为20 sex属性值为1
现有需要,我需要在jsp页面中对用户信息进行页面的显示,其中sex为1代表性别女,sex为0代表性别男--%>
<%
    ArrayList list = new ArrayList();
    list.add(new Use("张三",20,1));
    request.setAttribute("list",list);

%>

${list[0].name}
${list[0].age}
<c:if test="${list[0].sex==1}">
    ${"女"}
</c:if>
<c:if test="${list[0].sex!=1}">
    ${"男"}
</c:if>



</body>
</html>
