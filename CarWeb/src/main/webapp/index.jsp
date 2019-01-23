<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
  <link rel="stylesheet" type="text/css" href="res/static/css/main.css">
  <link rel="stylesheet" type="text/css" href="res/layui/css/layui.css">
  <script type="text/javascript" src="res/layui/layui.js"></script>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
  <style type="text/css">
	#w1200s{
		height:450px;
		width:1200px;
	
	}
	#imghot{
		height:280px;
		width:230px;
	}
	#items{
		width:100%;
		height:650px;
	}
	.big-img{
		float:left;
		margin:30px;
	}
	.big-img img{
		width:160px;
		height:230px;
	}
	.list-item img{
		width:230px;
		height:260px;
	
	}
  
  </style>
</head>
<body id="list-cont">
  <div class="site-nav-bg">
    <div class="site-nav w1200">
      <p class="sn-back-home">
        <i class="layui-icon layui-icon-home"></i>
        <a href="#">首页</a>
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
          <a href="#" title="母婴商城">
            <img src="res/static/img/logo.png" width="250" height="80">
          </a>
        </h1>
        <div class="mallSearch">
          <form action="" class="layui-form" novalidate>
            <input type="text" name="title" required  lay-verify="required" autocomplete="off" class="layui-input" placeholder="请输入需要的车辆">
            <button class="layui-btn" lay-submit lay-filter="formDemo">
                <i class="layui-icon layui-icon-search"></i>
            </button>
            <input type="hidden" name="" value="">
          </form>
        </div>
      </div>
    </div>
  </div>


  <div class="content">
    <div class="main-nav">
      <div class="inner-cont0">
        <div class="inner-cont1 w1200">
          <div class="inner-cont2">
            <a href="commodity.jsp">所有商品</a>
            <a href="buytoday.jsp">今日团购</a>
            <a href="information.jsp" class="active">热销资讯</a>
            <a href="about.jsp">关于我们</a>
          </div>
        </div>
      </div>
    </div>
    <div class="category-con">
      <div class="category-inner-con w1200">
        <div class="category-type">
          <h3>功能栏目</h3>
        </div>
       
      </div>
      <div class="layui-carousel" id="test10">
  <div carousel-item="">
    <div><img src="../res/static/img/lunbo.jpg"></div>
    <div><img src="../res/static/img/lunbo2.jpg"></div>
    <div><img src="../res/static/img/lunbo3.jpg"></div>
    <div><img src="../res/static/img/lunbo4.jpg"></div>
    <div><img src="../res/static/img/lunbo5.jpg"></div>
   
  </div>
</div>
<script src="res/layui/layui.js" charset="utf-8"></script>
      <script>
layui.use(['carousel', 'form'], function(){
  var carousel = layui.carousel
  ,form = layui.form;
  
  
  
  
  
  
  //图片轮播
  carousel.render({
    elem: '#test10'
    ,width: '1270px'
    ,height: '500px'
    ,interval: 5000
  });
  
  
  
  var $ = layui.$, active = {
    set: function(othis){
      var THIS = 'layui-bg-normal'
      ,key = othis.data('key')
      ,options = {};
      
      othis.css('background-color', '#5FB878').siblings().removeAttr('style'); 
      options[key] = othis.data('value');
      ins3.reload(options);
    }
  };
  
  //监听开关
  form.on('switch(autoplay)', function(){
    ins3.reload({
      autoplay: this.checked
    });
  });
  
  $('.demoSet').on('keyup', function(){
    var value = this.value
    ,options = {};
    if(!/^\d+$/.test(value)) return;
    
    options[this.name] = value;
    ins3.reload(options);
  });
  
  //其它示例
  $('.demoTest .layui-btn').on('click', function(){
    var othis = $(this), type = othis.data('type');
    active[type] ? active[type].call(this, othis) : '';
  });
});
</script>
    </div>

    <div class="hot-recommend-con">
       <div class="hot-con1 w1200 layui-clear">
          <div class="item" id="items">
            <h4>热销推荐</h4>
            <div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot1.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot2.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot3.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot4.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot5.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot6.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot7.jpg"></a>
            </div>
			<div class="big-img">
              <a href="javascript:;"><img id="imghot" src="../res/static/img/hot8.jpg"></a>
            </div>
		  </div>
		</div>
	</div>
    <div class="product-list-box" id="product-list-box">
      <div class="product-list-cont w1200">
        <h4>更多推荐</h4>
        <div class="product-item-box layui-clear">
          <div class="list-item">
            <a href="javascript:;"><img id="imgout2" src="../res/static/img/hot4.jpg"></a>
            <p>时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝</p>
            <span>￥100.00</span>
          </div>
          <div class="list-item">
            <a href="javascript:;"><img id="imgout2" src="../res/static/img/hot4.jpg"></a>
            <p>时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝</p>
            <span>￥100.00</span>
          </div>
          <div class="list-item">
            <a href="javascript:;"><img id="imgout2" src="../res/static/img/hot4.jpg"></a>
            <p>时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝</p>
            <span>￥100.00</span>
          </div>
          <div class="list-item">
            <a href="javascript:;"><img id="imgout2" src="../res/static/img/hot4.jpg"></a>
            <p>时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝</p>
            <span>￥100.00</span>
          </div>
          <div class="list-item">
            <a href="javascript:;"><img id="imgout2" src="../res/static/img/hot4.jpg"></a>
            <p>时尚宝宝小黄鸭T恤纯棉耐脏多色可选0-2岁宝宝</p>
            <span>￥100.00</span>
          </div>
  </div>

  <div class="footer">
    <div class="ng-promise-box">
      <div class="ng-promise w1200">
        <p class="text">
          <a class="icon1" href="javascript:;">30天无理由退换货</a>
          <a class="icon2" href="javascript:;">满99999元送大礼包</a>
          <a class="icon3" style="margin-right: 0" href="javascript:;">100%品质保证</a>
        </p>
      </div>
    </div>
    <div class="mod_help w1200">                                     
      <p>
        <a href="javascript:;">关于我们</a>
        <span>|</span>
        <a href="javascript:;">帮助中心</a>
        <span>|</span>
        <a href="javascript:;">售后服务</a>
        <span>|</span>
        <a href="javascript:;">汽车资讯</a>
        <span>|</span>
        <a href="javascript:;">关于货源</a>
      </p>
      <p class="coty">华强二手车版权所有 &copy; 2012-2020</p>
    </div>
  </div>
  <script type="text/javascript">

layui.config({
    base: '../res/static/js/util/' //你存放新模块的目录，注意，不是layui的模块目录
  }).use(['mm','carousel'],function(){
      var carousel = layui.carousel,
     mm = layui.mm;
     var option = {
        elem: '#test1'
        ,width: '100%' //设置容器宽度
        ,arrow: 'always'
        ,height:'298' 
        ,indicator:'none'
      }
      carousel.render(option);
      // 模版引擎导入
     // var ins = carousel.render(option);
     // var html = demo.innerHTML;
     // var listCont = document.getElementById('list-cont');
     // // console.log(layui.router("#/about.jsp"))
     //  mm.request({
     //    url: '../json/index.json',
     //    success : function(res){
     //      console.log(res)
     //      listCont.innerHTML = mm.renderHtml(html,res)
     //      ins.reload(option);
     //    },
     //    error: function(res){
     //      console.log(res);
     //    }
     //  })
    

});
  </script>
</body>
</html>