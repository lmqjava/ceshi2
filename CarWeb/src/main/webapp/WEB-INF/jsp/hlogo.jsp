<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>二手车网站后台内容管理系统登录登陆界面模板 - cssmoban</title>
<meta name="keywords" content="后台登陆页面模板,后台登录界面html,后台登录模板,后台登录页面html,后台管理系统后台登录模板">
<meta name="description" content="cssmoban提供后台管理系统登录界面html模板学习和下载">
<meta name="viewport" content="width=device-width">
<link href="/css/base.css" rel="stylesheet" type="text/css">
<link href="/css/login.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="login">
<form action="/login " method="post" id="form">
	<div class="logo"></div>
    <div class="login_form">
    	<div class="user">
        	<input class="text_value" value="lmq" name="username" type="text" id="username" placeholder="账号">
            <input class="text_value" value="123" name="password" type="password" id="password" placeholder="密码">
        </div>
        <button class="button" type="submit" >登陆</button>
    </div>
    
    <div id="tip"></div>
    <div class="foot">
    Copyright © 2011-2015  All Rights Reserved.
    </div>
    </form>
</div>
<script src="js/config.js" charset="utf-8"></script>
<script src="js/do.js" charset="utf-8"></script>

</body>
</html>