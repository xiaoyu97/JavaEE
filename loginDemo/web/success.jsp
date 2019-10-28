<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-26
  Time: 14:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<%= request.getAttribute("Msg")%>
<br>
违规信息
<form action="loginService" method="post">
    请输入要修改的人的电话：<input type="number" name="phone"><br>
    <select name="option">
        <option value="3" >违停</option>
        <option value="6" >闯红灯</option>
        <option value="12">酒驾</option>
    </select>
    <input type="submit" value="提交查询">

</form>
</body>
</html>
