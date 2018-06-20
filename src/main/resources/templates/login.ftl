<#--<!DOCTYPE html>-->
<#--<html>-->
<#--<head>-->
    <#--<title>FreeMarker</title>-->

    <#--<link href="/css/index.css" rel="stylesheet"/>-->
    <#--<script type="text/javascript" src="/webjars/jquery/3.3.0/jquery.min.js"></script>-->

    <#--&lt;#&ndash;<script>&ndash;&gt;-->
        <#--&lt;#&ndash;$(function() {&ndash;&gt;-->
            <#--&lt;#&ndash;$("button").click(function() {&ndash;&gt;-->
                <#--&lt;#&ndash;$.ajax({&ndash;&gt;-->
                    <#--&lt;#&ndash;url: "http://127.0.0.1:8080/index",&ndash;&gt;-->
                    <#--&lt;#&ndash;success: function(data, status, xhr) {&ndash;&gt;-->
                        <#--&lt;#&ndash;console.log(data);&ndash;&gt;-->
                        <#--&lt;#&ndash;$("P").html(data)&ndash;&gt;-->
                    <#--&lt;#&ndash;}&ndash;&gt;-->
                <#--&lt;#&ndash;})&ndash;&gt;-->
            <#--&lt;#&ndash;});&ndash;&gt;-->
        <#--&lt;#&ndash;})&ndash;&gt;-->
    <#--&lt;#&ndash;</script>&ndash;&gt;-->
<#--</head>-->
<#--<body>-->
<#--<h1 id="title">login</h1>-->
<#--<form action="/login/register" method="post" id="registerForm">-->
    <#--<div>-->
        <#--<input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/>-->
    <#--</div>-->
    <#--<div>-->
        <#--<input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" />-->
    <#--</div>-->
    <#--<div>-->
        <#--<input type="text" name="phone" placeholder="手机号"/>-->
    <#--</div>-->
    <#--<button type="submit" id="submit">登陆</button>-->
<#--</form>-->
<#--<p></p>-->
<#--<p></p>-->
<#--<p></p>-->
<#--<p></p>-->

<#--</body>-->
<#--</html>-->

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>登录</title>
</head>
<style>
    *{
        padding:0px;
        margin:0px;
    }

    body{
        background-image:url("/img/login.jpg");
        background-attachment: fixed;
        background-size:100% 100%;
    }
    .right{
        padding-top: 35px;
    }
    .regist{
        padding-top: 20px;
        height:220px;

    }
    .t1 {
        margin-bottom: 20px;
        line-height: 32px;
        width: 170px;
        border-radius:0 0 4px 4px;
        margin-left:50px;
        border:1px solid #c8c8c8;
        padding-left: 22px ;
    }
    a{
        color:lightslategrey;
        font-size: 20px;
        text-decoration : none;
    }
    button{
        width: 190px;
        margin-left: 56px;
        background-color: dodgerblue ;
        border:1px solid #dcf5fa;
        line-height: 34px;
        border-radius: 12px;
        color: #fff;
    }
    .font{
        width:100px;
        margin:0 auto;
        margin-bottom: 25px;
    }
    .img1{
        height:20px;
        position: absolute;
        left: 52px;
        top: 6px;
    }
    .t2{
        position: relative;
    }
    #container{
        margin: 120px auto;
        width:290px;
        height:350px;
        background-color: white;
        opacity: 0.7;
    }
</style>
<body>
<form action="/login/log_in">
    <div id="container">
        <div class="right">
            <div class="font">
                <a href="/login">登录</a>
                <b>.</b>
                <a href="/regist">注册</a>
            </div>
        </div>
        <div class="regist">
            <div class="t2">
                <img class="img1" src="/img/user.png" alt="user">
                <input class="t1" type="text" name="username" placeholder="账号"/><br/>
            </div>
            <div class="t2">
                <img class="img1" src="/img/passward.png" alt="user">
                <input class="t1" type="password" name="password" placeholder="密码"/><br/>
            </div>
            <button>
                登录
            </button>
            <div>
                <label style="color: red">${err?default(" ")}</label>
            </div>
        </div>
    </div>
</form>
</body>
</html>
