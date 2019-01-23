<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="baseUri" value="${pageContext.request.contextPath }" scope="request"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/res/layui/css/layui.css"  media="all">
</head>
<body>
	<table class="layui-hide" id="test" lay-filter="test"></table>
 
<script id="toolbarDemo" type="text/html">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
	<button class="layui-btn layui-btn-sm" onclick="TJ();">添加数据</button>
  </div>
</script>
 
<script id="barDemo" type="text/html">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<!--  <script id="imgs" type="text/html">
	<img src="${baseUri}/upload/8859ea43-5798-4ae3-b778-a356d7a952d8lunbo5.jpg" width="150px" height="100px"/>
</script> -->




<script>          
function TJ() {
        //页面层
        layer.open({
            type: 1,
            skin: 'layui-layer-rim', //加上边框
            area: ['500px', '400px'], //宽高
            content: '<form class="layui-form" action="addImg" method="post" enctype="multipart/form-data">' +
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">广告名</label>' +
                '<div class="layui-input-block">' +
                '<input type="text" name="imgAddress" lay-verify="title" autocomplete="off" placeholder="请输入广告名" class="layui-input">' +
                '</div>' +

                '</div>' +
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">选择图片</label>' +
                '<div class="layui-input-block">' +
                '<input type="file" name="file" onchange="showPreview(this)"  placeholder="选择图片" autocomplete="off" class="layui-input">' +
                '</div>' +
  

                '</div>' +
                '<div class="layui-form-item">' +
                '<label class="layui-form-label">图片</label>' +
                '<div class="layui-input-block">' +
                '<img id="portrait" src="" style="display:none;width: 100px;height:100px;" />' +
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
<script type="text/javascript">
function showPreview(source) {
  var file = source.files[0];
  if(window.FileReader) {
      var fr = new FileReader();
      console.log(fr);
      var portrait = document.getElementById('portrait');
      fr.onloadend = function(e) {
        portrait.src = e.target.result;
      };
      fr.readAsDataURL(file);
      portrait.style.display = 'block';
  }
}
</script>          
<script src="/res/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>

layui.use(['jquery','table'], function(){
  var table = layui.table,
  		$=layui.jquery;
  table.render({
    elem: '#test'
    ,url:'/selectAll'
    ,id: 'listReload'
    ,toolbar: '#toolbarDemo'
    ,title: '广告数据表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'imgId', title:'ID', width:80, fixed: 'left', unresize: true, sort: true}
      ,{field:'imgAddress', title:'广告商', width:100}
      ,{field:'lbImg', title:'图片地址'}
      /* ,{fixed: '', title:'图片', toolbar: '#imgs', width:100} */
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
    ]]
    ,page: true
  });
  
  //头工具栏事件
  var $ = layui.$, active = {
          getCheckData: function () { //获取选中数据
              var checkStatus = table.checkStatus('test')
                  , data = checkStatus.data;
              layer.alert(JSON.stringify(data));
          }
          , getCheckLength: function () { //获取选中数目
              var checkStatus = table.checkStatus('test')
                  , data = checkStatus.data;
              layer.msg('选中了：' + data.length + ' 个');
          }
          , isAll: function () { //验证是否全选
              var checkStatus = table.checkStatus('test');
              layer.msg(checkStatus.isAll ? '全选' : '未全选')
          }
      };

      $('.demoTable .layui-btn').on('click', function () {
          var type = $(this).data('type');
          active[type] ? active[type].call(this) : '';
      });


      //监听工具条
      table.on('tool(test)', function (obj) {
          var data = obj.data;
          if (obj.event === 'edit') {
              layer.msg();
              layer.open({
                  area: '500px',
                  maxHeight: '800px'
                  , content: '<form class="layui-form" action="/updateUser"  lay-filter="example">' +
	                  '<div class="layui-form-item">' +
	                  '<label class="layui-form-label">ID：</label>' +
	                  '<div class="layui-input-block">' +
	                  '<input type="text" name="imgId" lay-verify="title" autocomplete="off" class="layui-input">' +
	                  '</div>' +
                  
                  
                  	  '<div class="layui-form-item">' +
                      '<label class="layui-form-label">广告名：</label>' +
                      '<div class="layui-input-block">' +
                      '<input type="text" name="imgAddress" lay-verify="title"  class="layui-input">' +
                      '</div>' +
                      '</div>' +

                      '<div class="layui-form-item">' +
                      '<label class="layui-form-label">上传图片：</label>' +
                      '<div class="layui-input-block">' +
                      '<input type="file" name="lbImg" onchange="showPreview(this)" lay-verify="title"  class="layui-input">' +
                      '<img id="portrait" src="" style="display:none;width: 100px;height:100px;" />'+
                      '</div>' +

                      '<div class="layui-form-item">' +
                      '<div class="layui-input-block">' +
                      '<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>' +
                      '</div>' +
                      '</div>' +
                      '</form>'

              });
              layui.use(['form'], function () {
                  var form = layui.form;

                  //监听提交
                  form.on('submit(demo1)', function (data) {
                      /* layer.alert(JSON.stringify(data.field), {
                          title: '最终的提交信息'
                      }); */
                      $.ajax({
                          url: "/updateUser",
                          data: data.field,
                          success: function (data) {
						  location.reload();
                          }
                      });
                      return false;
                  });

                  //表单初始赋值
                  form.val('example', {
                	  "imgId":data.imgId
                      ,"imgAddress": data.imgAddress
                      /* , "lbImg": data.lbImg */
                  })
              });
          } else if (obj.event === 'del') {
              layer.confirm('真的删除行么', function (index) {
                  obj.del();
                  layer.close(index);
                  $.ajax({
                      url: "/deleteUser?id="+data.imgId,
                      method: 'post',
                      success: function (data) {
                      }
                  })
              });
          } /*else if (obj.event === 'detail') {
              layer.alert('编辑行：<br>' + data)
          }*/
      });


  });
</script>

</body>
</html>