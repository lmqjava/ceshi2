<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/res/layui/css/layui.css"  media="all">
<title>Insert title here</title>
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>
 
<script id="toolbarDemo" type="text/html">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
  	<button class="layui-btn layui-btn-sm" onclick="TJ();">添加数据</button>
	         
</div>
<form class="layui-form" action="">
<div class="layui-input-inline">
	
	<input type="text" name="ssLeixing" class="layui-input-inline"></input>
	<input class="layui-btn" type="submit" value="搜索">
</div>	
</form>
</script>
<script> 
function TJ() {
        //页面层
        layer.open({
            type: 1,
            skin: 'layui-layer-rim', //加上边框
            area: ['500px', '400px'], //宽高
            content: '<form class="layui-form" action="" method="post" enctype="multipart/form-data">' +
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">广告名称</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssName" lay-verify="title" autocomplete="off" placeholder="请输入广告名" class="layui-input">' +
                '</div>' +

                '<div class="layui-form-item">' +
                '<label class="layui-form-label">广告位置</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssAddress" lay-verify="title" autocomplete="off" placeholder="请输入广告位置" class="layui-input">' +
                '</div>' +
                
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">媒介类型</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssLeixing" lay-verify="title" autocomplete="off" placeholder="请输入广告类型" class="layui-input">' +
                '</div>' +
                
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">开始日期</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssStartdata" lay-verify="title" id="datess" placeholder="yyyy-MM-dd" autocomplete="off" lay-verify="date" class="layui-input">' +
                '</div>' +
                
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">结束日期</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssEnddata" lay-verify="title" id="datess" placeholder="yyyy-MM-dd" autocomplete="off" lay-verify="date" class="layui-input">' +
                '</div>' +
  
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">点击次数</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="ssNum" lay-verify="title" autocomplete="off" placeholder="点击次数" class="layui-input">' +
                '</div>' +
                
                '</div>' +
                '<div class="layui-form-item">' +
                '<label class="layui-form-label"></label>' +
                '<div class="layui-input-block">' +
                '<input class="layui-btn" type="submit" value="提交">' +
                '</div>' +
                '</form>'
        });
    }
</script>              
          
<script src="/res/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
<script type="text/javascript">
layui.use(['form','laydate'], function(){
      var  form = layui.form ;
              $ = layui.jquery ;
               laydate = layui.laydate;
            
          laydate.render({     //创建时间选择框
                elem: '#datess' //指定元素
              });
          
    });
</script>
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'/engine'
    ,toolbar: '#toolbarDemo'
    ,cols: [[
       {type:'radio'}
      ,{field:'ssId', width:100, title: 'ID', sort: true}
      ,{field:'ssName', width:140, title: '广告名称'}
      ,{field:'ssAddress', width:140, title: '广告位置'}
      ,{field:'ssLeixing', width:140, title: '媒介类型'}
      ,{field:'ssStartdata',width:233, title: '开始日期',sort: true}
      ,{field:'ssEnddata', width:233, title: '结束日期', sort: true}
      ,{field:'ssNum', width:120, title: '点击次数', sort: true}
    ]]
    ,page: true
  });
  
  //头工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id); //获取选中行状态
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;  //获取选中行数据
        layer.alert(JSON.stringify(data));
      break;
    };
  });
});
</script>

</body>
</html>