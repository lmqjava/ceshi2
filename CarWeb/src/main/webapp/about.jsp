<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="../res/static/css/main.css">
  <link rel="stylesheet" type="text/css" href="../res/layui/css/layui.css">
  <script type="text/javascript" src="../res/layui/layui.js"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
</head>
<body>

  <div class="site-nav-bg">
    <div class="site-nav w1200">
      <p class="sn-back-home">
        <i class="layui-icon layui-icon-home"></i>
        <a href="index.jsp">首页</a>
      </p>
      <div class="sn-quick-menu">
        <div class="login"><a href="login.jsp">登录</a></div>
        <div class="sp-cart"><a href="shopcart.jsp">购物车</a><span>2</span></div>
      </div>
    </div>
  </div>



  <div class="header">
    <div class="headerLayout w1200">
      <div class="headerCon">
        <h1 class="mallLogo">
          <a href="#" title="华强二手车">
            <img src="../res/static/img/logo.png"  width="250" height="80">
          </a>
        </h1>
        <div class="mallSearch">
          <form action="" class="layui-form" novalidate>
            <input type="text" name="title" required  lay-verify="required" autocomplete="off" class="layui-input" placeholder="请输入需要的商品">
            <button class="layui-btn" lay-submit lay-filter="formDemo">
                <i class="layui-icon layui-icon-search"></i>
            </button>
            <input type="hidden" name="" value="">
          </form>
        </div>
      </div>
    </div>
  </div>


  <div class="content content-nav-base about-content">
    <div class="main-nav">
      <div class="inner-cont0">
        <div class="inner-cont1 w1200">
          <div class="inner-cont2">
            <a href="commodity.jsp">所有商品</a>
            <a href="buytoday.jsp">今日热点</a>
            <a href="information.jsp">车友论坛</a>
            <a href="about.jsp" class="active">关于我们</a>
          </div>
        </div>
      </div>
    </div>
    <div class="banner-box">
      <div class="banner"></div>
    </div>
    <div class="brief-content layui-clear w1200">
      <div class="img-box">
        <img src="../res/static/img/us_img1.jpg">
        <img class="top" src="../res/static/img/us_img2.jpg">
      </div>
      <div class="text">
        <p>华强二手车直卖网，没有中间商赚差价~~~~~~~~~~~~~去他妈的二手车，老子写不下去了</p>
      </div>
    </div>
    <div class="banner-text">
      <div class="w1200">
        <p>华强二手车直卖网，没有中间商赚差价~~~~~~~~~~~~~去他妈的二手车，老子写不下去了</p>
      </div>
    </div>
    <div class="after-sale w1200">
      <h4>配送售后</h4>
      <div class="item-box">
        <div class="item item1">
          <div class="img-box">
            <img src="../res/static/img/us_icon1.png">
          </div>
          <p>强买强卖，绝不吃亏</p>
        </div>
        <div class="item item2">
          <div class="img-box">
            <img src="../res/static/img/us_icon2.png">
          </div>
          <p>bi了狗了</p>
        </div>
        <div class="item item3">
          <div class="img-box">
            <img src="../res/static/img/us_icon3.png">
          </div>
          <p>优质客服服务</p>
        </div>
      </div>
    </div>
  </div>

<script type="text/javascript">

layui.config({
    base: '../res/static/js/util/' //你存放新模块的目录，注意，不是layui的模块目录
  }).use(['mm'],function(){
      var
     mm = layui.mm;
  
    

});
</script>
</body>
</html>