<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<script type="text/javascript" src="res/echarts/echarts.min.js"></script>
<!-- 引入jquery.js -->
<script type="text/javascript" src="res/echarts/jquery.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
	<div id="main" style="width: 800px; height: 400px;"></div>
	<script type="text/javascript">
		function loadOneColumn() {
			var myChart = echarts.init(document.getElementById('main'));
			// 显示标题，图例和空的坐标轴
			myChart
					.setOption({
						color : [ '#ff7d27', '#47b73d', '#fcc36e', '#57a2fd',
								"#228b22" ],//饼图颜色
						title : {
							text : '车辆价格分布',
							subtext : '纯属虚构',
							x : 'center'
						},
						tooltip : {
							trigger : 'item',
							formatter : "{a} <br/>{b} : {c} ({d}%)"
						},
						legend : {
							orient : 'vertical',
							x : 'left',
							data : []
						},
						toolbox : {
							show : true,
							feature : {
								mark : {
									show : true
								},
								dataView : {
									show : true,
									readOnly : false
								},
								magicType : {
									show : true,
									type : [ 'pie', 'funnel' ],
									option : {
										funnel : {
											x : '25%',
											width : '50%',
											funnelAlign : 'left',
											max : 1548
										}
									}
								},
								restore : {
									show : true
								},
								saveAsImage : {
									show : true
								}
							}
						},
						series : [ {
							name : '车辆信息',
							type : 'pie',
							radius : '55%',
							center : [ '50%', '60%' ],
							data : []
						} ]
					});
			myChart.showLoading(); //数据加载完之前先显示一段简单的loading动画
			var names = []; //类别数组（用于存放饼图的类别）
			var brower = [];
			$.ajax({
				type : 'get',
				url : '/car/select',//请求数据的地址
				dataType : "json", //返回数据形式为json
				success : function(result) {

					//请求成功时执行该函数内容，result即为服务器返回的json对象
					if (result) {

						for (var i = 0; i < result.data.length; i++) {

							names.push(result.data[i].story); //挨个取出类别并填入类别数组
						}

						for (var i = 0; i < result.data.length; i++) {
							brower.push({
								name : result.data[i].story,
								value : result.data[i].price
							}); //挨个取出销量并填入销量数组
						}
						myChart.hideLoading(); //隐藏加载动画
						myChart.setOption({ //加载数据图表                
							legend : {
								data : names
							},
							series : [ {
								data : brower
							} ]
						});
					}
				},
				error : function(errorMsg) {
					//请求失败时执行该函数
					alert("图表请求数据失败!");
					myChart.hideLoading();
				}
			});
		};
		loadOneColumn();
	</script>


</body>
</html>