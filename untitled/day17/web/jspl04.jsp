<%@ page import="java.awt.*" %>
<%@ page import="cn.itheima.domain.Teacher" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--题干:将若干教师对象存入ArrayList集合中，
并将集合保存到request域中，最后打印第二个老师的相关信息,
注意,实体类是Teacher,有name和major-subject两个属性--%>
<%
    ArrayList list = new ArrayList();
    list.add(new Teacher("赵老师","java"));
    list.add(new Teacher("钱老师","java"));
    list.add(new Teacher("孙老师","java"));
    list.add(new Teacher("李老师","java"));

    request.setAttribute("list",list);
%>
${list[3].name}
${list[3].project}
</body>
</html>
