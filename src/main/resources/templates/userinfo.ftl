<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>贴吧</title>
    <style>
        *{
            margin:0px;
            padding:0px;
        }
        body{
            background-attachment: fixed;
            background-size:100% 100%;
            background-image: url("/img/img2.jpg");
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

        .left1:hover .font1{
            display: block;
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
            <input  class="seek" type="text"/>
            <img class="img1" src="/img/find.png" alt="搜索">
        </div>
        <div class="login">
            <a  class="top3" href="/login">登录</a>
            <a  class="top4" href="/regist">注册</a>
        </div>
    </div>
</div>
<div id="center">
    <div class="background">
        <div class="center1">
            <#list publishes>
                <table class="table table-hover">
                    <thead>
                    <tr>
                    <#--<th scope="col">#</th>-->
                        <th scope="col">标题</th>
                        <th scope="col">发布时间</th>
                        <th scope="col">类别</th>
                        <#--<th scope="col">详细内容</th>-->
                        <th scope="col">查看 / 删除</th>
                    </tr>
                    </thead>
                    <tbody>
                            <#items as publish>
                            <tr>
                            <#--<td scope="col">${publish.idpublish}</td>-->
                                <td scope="col">${publish.textname}</td>
                                <td scope="col">${publish.date?string('yyyy-MM-dd HH:mm:ss')}</td>
                                <td scope="col">${publish.classes}</td>
                                <td scope="col"><a href="/information/${publish.idpublish}">查看</a>&nbsp;&nbsp;&nbsp;&nbsp;<a style="color: red" href="/userinfo/del/${publish.idpublish}">删除</a></td>
                                <#--<td scope="col"><a style="color: red" href="/userinfo/del/${publish.idpublish}">删除</a></td>-->
                            </tr>
                            </#items>
                    </tbody>
                </table>
            <#else>
        Table is Empty
            </#list>
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
