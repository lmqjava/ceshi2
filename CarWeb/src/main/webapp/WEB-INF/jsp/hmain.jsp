<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="/res/layui/css/layui.css">
<link rel="stylesheet" href="/admin/css/main.css">
</head>
<body>
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">
				<img alt="" src="images/logo.png" height="60px" width="200px">
			</div>
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="/hindex">后台首页</a></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> <span>Brother</span>
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="javascript:;">基本资料</a>
						</dd>
						<dd>
							<a href="javascript:;">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="/admin" >退出登陆</a></li>
			</ul>
		</div>
		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item"><a class="" href="javascript:;">商品管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/hbloglist">商品查询</a>
							</dd>
							<dd>
								<a href="/blogadd">商品添加</a>
							</dd>
							<dd>
								<a href="/stat">数据统计</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">订单管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/select">订单查询</a>
							</dd>
							<dd>
								<a href="/select1">订单数据</a>
							</dd>
							<dd>
								<a href="/c">年度规划</a>
							</dd>
						</dl></li>
					
					<li class="layui-nav-item"><a href="javascript:;">广告管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/tj_tupian">广告管理</a>
							</dd>
							<dd>
								<a href="/gg_shuju">广告数据</a>
							</dd>
							<dd>
								<a href="/ss_solr">广告日期</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">会员管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/userdetils">会员信息</a>
							</dd>
							<dd>
								<a href="/userdetils2">员工信息</a>
							</dd>
							<dd>
								<a href="/RegionEcharts">会员数据</a>
							</dd>
						</dl></li>
					
					<li class="layui-nav-item"><a href="javascript:;">权限管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="/fff">aaaa</a>
							</dd>
							<dd>
								<a href="/gggg">aaaa</a>
							</dd>
							<dd>
								<a href="/hhhh">aaa</a>
							</dd>
						</dl></li>
				</ul>
			</div>
		</div>
		<div class="layui-body" style="overflow: hidden;">
			<iframe src="/hindex" id="iframe-body"></iframe>
		</div>
		<div class="layui-footer" id="footer">
			<!-- 底部固定区域 -->
			<p class="layui-ppp">@2019 xiaoming</p>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="/res/layui/layui.all.js"></script>
<script src="/admin/javascript/main.js"></script>
</html>