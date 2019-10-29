<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台登录</title>

    <link href="./css/login.css" rel="stylesheet" type="text/css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="后台登录"/>

</head>
<body>
<drv class="login-form">


    <div class="top-login">
        <span><img src="./images/group.png" alt=""/></span>
    </div>
    <h1>盘古班 </h1>
    <div class="login-top">

        <form action="login" method="post">
            <div class="login-ic">
                <i></i>
                <input type="text" name="name"  placeholder="用户"><br>
                <div class="clear"></div>
            </div>

            <div class="login-ic">
                <i class="icon"></i>
                <input type="password" name="password"  placeholder="密码"><br>
                <div class="clear"></div>
            </div>

            <div class="log-bwn">
                <input type="submit" value="登录">
            </div>
        </form>
    </div>
</drv>
</body>
</html>
