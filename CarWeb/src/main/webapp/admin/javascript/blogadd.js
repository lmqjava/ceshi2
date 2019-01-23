var form = layui.form;
layui.layedit.build('editor'); //建立编辑器

//监听提交
form.on('submit(formDemo)', function(data){
	layer.msg(JSON.stringify(data.field));
	return false;
});