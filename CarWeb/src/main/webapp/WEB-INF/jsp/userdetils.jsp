<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="res/layui/css/layui.css" media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>

<table class="layui-hide" id="test" lay-filter="test"></table>

<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-group demoTable">
        <button class="layui-btn" data-type="getCheckData">获取选中行数据</button>
        <button class="layui-btn" data-type="getCheckLength">获取选中数目</button>
        <button class="layui-btn" data-type="isAll">验证是否全选</button>
        <a onclick="TJ();" class="layui-btn layui-inline fl w130">添加</a>
    </div>
</script>

<script type="text/html" id="barDemo">
    <!--<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>-->
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


<script src="res/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>

    function TJ() {
        //页面层
        layer.open({
            type: 1,
            skin: 'layui-layer-rim', //加上边框
            area: ['500px', '400px'], //宽高
            content: '<form class="layui-form" action="/client/insertOne" method="post">' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">ID</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientName" lay-verify="title" autocomplete="off" placeholder="请输入ID" class="layui-input">' +
            '</div>' +

            '</div>' +
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">姓名：</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientTel" placeholder="例：张xx.." autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +

            '<div class="layui-form-item">' +
            '<label class="layui-form-label">电话：</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientSex"  placeholder="手机号" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +

            '<div class="layui-form-item">' +
            '<label class="layui-form-label">用户名：</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientCard"  placeholder="emmm" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            
            
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">密码：</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientCard"  placeholder="yiiiiii" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +
            
            '<div class="layui-form-item">' +
            '<label class="layui-form-label">地区</label>' +
            '<div class="layui-input-block">' +
            '<input type="text" name="clientCard"  placeholder="10000" autocomplete="off" class="layui-input">' +
            '</div>' +
            '</div>' +


            

            

            '<div class="layui-form-item">' +
            '<div class="layui-input-block">' +
            '<button class="layui-btn" lay-submit="" lay-filter="demo1">确认添加</button>' +
            '</div>' +
            '</div>' +
            '</form>'
    });
}





    layui.use('table', function () {
        var table = layui.table;

        table.render({
            elem: '#test'
            , url: '/user/select'
            , toolbar: '#toolbarDemo'
            , title: '用户数据表'
            , cols: [[
                {type: 'checkbox', fixed: 'left'}
                , {field: 'uuid', title: 'ID', width: 80, fixed: 'left', unresize: true, sort: true}
                , {field: 'username1', title: '用户名', width: 100, edit: 'text'}
                , {field: 'userpass', title: '密码', width: 120, edit: 'text'}
                , {field: 'username', title: '姓名', width: 80, edit: 'text'}
                , {field: 'usertel', title: '电话', width: 200}
                , {field: 'region', title: '地区', width: 100}
              
                , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: 120}
            ]]
            , page: true
        });

        //头部工具栏
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
                    maxHeight: '600px'
                    , content: '<form class="layui-form" action="/client/updateAll" method="post" lay-filter="example">' +
                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">ID：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" disabled="false" name="uuid" lay-verify="title" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">姓名：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" disabled="false" name="username" lay-verify="title" autocomplete="off" placeholder="请输入姓名" class="layui-input">' +
                        '</div>' +

                        '</div>' +
                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">电话：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text"  disabled="false" name="usertel" placeholder="请输入电话号码" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">用户名：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text"  disabled="false" name="username"  placeholder="obj.data.username1" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">密码：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text"  disabled="false" name="color"  placeholder="请输入身份证号" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">地区：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text"  disabled="false" name="cartype" placeholder="请输入住址" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<label class="layui-form-label">价格：</label>' +
                        '<div class="layui-input-block">' +
                        '<input type="text" name="price" autocomplete="off" class="layui-input">' +
                        '</div>' +
                        '</div>' +

                        '<div class="layui-form-item">' +
                        '<div class="layui-input-block">' +
                        '<div><font color="red">*只允许修改价格</font></div>'+
                        '<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>' +
                        '</div>' +
                        '</div>' +
                        '</form>'

                });
                layui.use(['form'], function () {
                    var form = layui.form;

                    //监听提交
                    form.on('submit(demo1)', function (data) {
                        layer.alert(JSON.stringify(data.field), {
                            title: '最终的提交信息'
                        });
                        $.ajax({
                            url: "/client/updateAll",
                            method: "post",
                            data: data.field,
                            success: function (data) {

                            }
                        });
                        return false;
                    });

                    //表单初始赋值
                    form.val('example', {
                        "tid": data.tid
                        , "story": data.story
                        , "dis": data.dis
                        , "pailiang": data.pailiang
                        , "color": data.color
                        , "cartype": data.cartype
                        , "price": data.price
                    })
                });
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么'+data.uuid, function (index) {
                    obj.del();
                    layer.close(index);
                    $.ajax({
                        url: "/user/delUser?uuid="+data.uuid,
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
