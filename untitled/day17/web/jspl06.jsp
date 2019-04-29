<%@ page import="java.util.ArrayList" %>
<%@ page import="cn.itheima.domain.Headset" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/17
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--题干：现有下列数据,为方便,可以将每条数据封装到一个JavaBean中
​		Headset(int id,String brand,double price,String name,String desc)

(1,'森海塞尔',1899,'ie80','很好耳机'),
(2,'Beats',2288,'Beats Studio Wireless','装逼神器'),
(3,'森海塞尔',599,'Momentum In-Ear','还算不错的耳机'),
(4,'小米',129,'圈铁Pro','129 超高性价比'),
(5,'森海塞尔',89,'MX400 II','入门级耳机'),
(6,'森海塞尔',519999,'ORPHEUS二代','奢侈品')

需求:
​	1.将数据在jsp页面上已表格的形式展示出来
​	2.将展示的表格实现隔行换色的效果(奇数行红色,偶数行绿色)--%>
<%
    ArrayList list = new ArrayList();
    list.add(new Headset(1,"森海塞尔",1899,"ie80","很好耳机"));
    list.add(new Headset(2,"Beats",2288,"Beats Studio Wireless","装逼神器"));
    list.add(new Headset(3,"森海塞尔",599,"Momentum In-Ear","还算不错的耳机"));
    list.add(new Headset(4,"小米",129,"圈铁Pro","129 超高性价比"));
    list.add(new Headset(5,"森海塞尔",89,"MX400 II","入门级耳机"));
    list.add(new Headset(6,"森海塞尔",519999,"ORPHEUS二代","奢侈品"));
    request.setAttribute("list",list);
%>
<table border="1" width="500" bgcolor="#ffc0cb" align="center">
    <tr>
        <th>编号</th>
        <th>品牌</th>
        <th>价格</th>
        <th>型号</th>
        <th>描述</th>
    </tr>
    <c:forEach items="${list}" var="list" varStatus="s">

     <c:if test="${s.count%2==0}">
         <tr bgcolor="#7fffd4">
             <td>${list.id}</td>
             <td>${list.brand}</td>
             <td>${list.price}</td>
             <td>${list.name}</td>
             <td>${list.desc}</td>

         </tr>
     </c:if>
        <c:if test="${s.count%2!=0}">
            <tr bgcolor="#5f9ea0">
                <td>${list.id}</td>
                <td>${list.brand}</td>
                <td>${list.price}</td>
                <td>${list.name}</td>
                <td>${list.desc}</td>

            </tr>
        </c:if>

    </c:forEach>

</table>


</body>
</html>
