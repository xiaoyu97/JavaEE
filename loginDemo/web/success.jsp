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
    <link href="./css/success.css" rel="stylesheet" type="text/css">

</head>
<body>
<div >
<h1  id="h1" ><%= request.getAttribute("Msg")%></h1>
</div>
<br>
<h2> 违规信息  </h2>
<form action="loginService" method="post">
<div class="login-ic">
    请输入要违规人的电话：<input type="number" name="phone"><br>

   请选择违规的类型： <select name="option">
        <option value="3" >违停</option>
        <option value="6" >闯红灯</option>
        <option value="12">酒驾</option>
    </select>
</div>
    <div class="log-bwn">
    <input type="submit" value="提交查询">
    </div>
</form>
</body>
</html>
