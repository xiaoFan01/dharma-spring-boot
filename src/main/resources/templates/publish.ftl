<#--<!DOCTYPE html>-->
<#--<html>-->
<#--<head>-->
    <#--<meta charset="utf-8" />-->
    <#--<title>登录</title>-->
<#--</head>-->

<#--<body>-->
<#--<form action="/publish/dopublish">-->
        <#--<div>-->
            <#--<div>-->
                <#--<input type="text" name="textname" placeholder="标题"/><br/>-->
            <#--</div>-->
            <#--<div>-->
                <#--<input type="text" name="text" placeholder="内容"/><br/>-->
            <#--</div>-->
            <#--<div>-->
                <#--<input type="radio" name="r1" value="r1"/>动漫-->
                <#--<input type="radio" name="r1" value="r2"/>其他-->
            <#--</div>-->
            <#--<button>-->
                <#--发布-->
            <#--</button>-->

        <#--</div>-->
<#--</form>-->
<#--</body>-->
<#--</html>-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BBS</title>
    <style>
        *{
            margin:0px;
            padding:0px;
        }
        body{
            background-attachment: fixed;
            background-size:100% 100%;
            background-image: url("../img/img2.jpg");
        }
        #top{
            width:100%;
            height:60px;
            background-color: #7bbfea;
            position:fixed;
            top: 0;
            z-index: 100;
            overflow: hidden;
        }
        .first{
            float: left;
            width: 300px;
            margin-top: 20px;
        }
        .find{
            position: relative;
            float: right;
            margin-right: 60px;
            margin-top: 20px;
        }
        .find a{
            display: inline-block;
        }
        .right{
            float:right;
        }
        .login{
            float:left;
        }
        .top2{
            list-style: none;
            display:inline-block;
            margin-left:50px;
        }
        a{
            text-decoration-line: none;
            color: #d3e0f0;
        }
        .seek{
            background-color: #d3e0f0;
            height:20px;
            width: 200px;
            border:1px solid #d3e0f0;
            border-radius: 20px;
            font-size: 15px;
        }
        .top3{
            color: #d3e0f0;
            text-decoration: none;
            padding-left:120px;
        }
        .top4{
            color: #d3e0f0;
            text-decoration: none;
            padding-left:30px;
        }
        .img1{
            height: 14px;
            position: absolute;
            left: 210px;
            top: 6px;
        }

        #center{
            width:99.8%;
            height:800px;
            margin-top:60px ;
        }
        .left{
            margin:8px;
            width:180px;
            height:100%;
            display: inline-block;
            float: left;
            text-align: center;
            background-color: #f7f7f7;
            opacity: 0.7;
        }
        .left1{
            margin-top: 40px;
            position: relative;
            height:80px;
        }
        .left1:hover .font1{
            display: block;
        }
        .left2:hover{
            background-color: beige;
        }
        .left2{
            font-size: 20px;
            color: black;
            font-family: 宋体;
        }
        .background{
            width:84%;
            height:100%;
            display:inline-block;
            float:left;
            background-attachment: fixed;
            background-size:100% 100%;
        }
        .center1{
            width: 70%;
            height: 840px;
            padding:20px;
            color: black;
            position: absolute;
            left:10px;
            right:0;
            top: 0;
            bottom: 0;
            margin: auto;
        }
        .right{
            float:left;
            display: inline-block;
        }
        #footer{
            width:100%;
            height:40px;
            /*border: 1px solid #d3e0f0;*/
            overflow: hidden;
        }
        .foot1{
            text-align: center;
            margin-top: 15px;
        }
        .foot2{
            display: inline-block;
            font-size: 10px;
        }
        .foot3{
            color:#000000;
        }
        .text0{
            padding-top: 100px;
        }
        .text1{
            padding-top:20px;
        }
        .text2{
            padding-top: 15px;
            padding-bottom: 15px;
        }
    </style>
<#--<link rel="stylesheet" href="/css/index1.css" rel="stylesheet">-->
    <link href="/webjars/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet"/>
<#--<link href="/css/index.css" rel="stylesheet"/>-->
    <script type="text/javascript" src="/webjars/jquery/3.3.0/jquery.min.js"></script>
</head>
<body>
<div id="top">
    <div class="first">
        <ul class="top1">
            <li class="top2">
                <a  href="/publish/index">首页</a>
            </li>
            <li class="top2">
                <a href="#">版面目录</a>
            </li>
            <li class="top2">
                <a  href="/publish">发布</a>
            </li>
        </ul>
    </div>
    <div class="find">
        <div class="right">
            <form action="/likefind">
                <input  class="seek" name="findlikename" type="text"/>
                <img class="img1" src="/img/find.png" alt="搜索">
            </form>
        </div>
        <div class="login">
            <a  class="top3" href="/userinfo">您好！${username?default(" ")}</a>
        </div>
    </div>
</div>
<div id="center">
    <div class="background">
        <div class="center1">
            <form action="/publish/dopublish">
                <div >
                    <div  class="text0">
                        <input type="text" name="textname" placeholder="标题" style=" border:1px solid #fff; width:300px;height:40px;"/><br/>
                    </div>
                    <div class="text1">
                        <textarea name="text" placeholder="内容" style="width:600px; height:300px; border:1px solid #fff;"/></textarea><br/>
                    </div>
                    <div class="text2">
                        <a>请选择发布的类型：</a></br></br>
                        <input type="radio" name="r1" value="娱乐明星"/>娱乐明星
                        <input type="radio" name="r1" value="热门电影"/>热门电影
                        <input type="radio" name="r1" value="体育赛事"/>体育赛事
                        <input type="radio" name="r1" value="网络游戏"/>网络游戏
                        <input type="radio" name="r1" value="动漫"/>动漫
                        <input type="radio" name="r1" value="其他"/>其他
                    </div>
                    <button style="width:80px;">
                        发布
                    </button>

                </div>
            </form>
        </div>
    </div>
</div>
<div id="footer">
    <ul class="foot1">
        <li class="foot2">
            <a  class="foot3" href="#">常用网站</a>
        </li>
        <li class="foot2">
            <a class="foot3" href="#">相关下载</a>
        </li>
        <li class="foot2">
            <a class="foot3" href="#">关于我们</a>
        </li>
        <li  class="foot2">
            <a  class="foot3" href="#">联系我们</a>
        </li>
        <li class="foot2">
            <a  class="foot3" href="#">加入我们</a>
        </li>
        <li class="foot2">
            <a  class="foot3" href="#">意见反馈</a>
        </li>
    </ul>
</div>
</body>
