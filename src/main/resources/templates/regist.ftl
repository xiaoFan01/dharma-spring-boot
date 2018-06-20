
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
</head>
<body>
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
    .login{
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
        left: 54px;
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
<form action="/regist/register">
    <div id="container">
        <div class="right">
            <div class="font">
                <a href="/login">登录</a>
                <b>.</b>
                <a href="/regist">注册</a>
            </div>
        </div>
        <div class="login">
            <div class="t2">
                <img class="img1"  src="/img/user.png" alt="user">
                <input class="t1" type="text" name="username" placeholder="你的昵称"/><br/>
            </div>
            <div class="t2">
                <img class="img1"  src="/img/phone.png" alt="phone">
                <input class="t1" type="text" name="phone" placeholder="手机号码"/><br/>
            </div>
            <div class="t2">
                <img class="img1"  src="/img/passward.png" alt="passward">
                <input class="t1" type="password" name="password" placeholder="设置密码"/><br/>
            </div>
            <button>
                注册
            </button>
            <div>
                <label style="color: red">${err?default(" ")}</label>
            </div>
        </div>
    </div>
</form>
</body>
</html>