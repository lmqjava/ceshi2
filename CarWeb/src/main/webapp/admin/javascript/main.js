// 设置iframe框
$('#iframe-body').attr({'style' : 'width:'+($('#iframe-body').width()+17)+'px;'});

// JQ页面脚本编写
$(function(){
    $('a').click(function(){
        var link = $(this).attr('href');
        var target = $(this).attr('target');
        var navs = $(this).parents('li.layui-nav-item');
        if ((link || link == '') && navs.length && !target) {
        	if (link == '') {
        		layer.msg('超连接地址为空');
        		return false;
        	}else if(link != 'javascript:;'){
        		$('#iframe-body').attr({'src' : link});
        		return false;
        	}
        }
    })
})