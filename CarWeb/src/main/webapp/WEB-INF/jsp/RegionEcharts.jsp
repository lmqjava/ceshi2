
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>饼状图</title>
    <script type="text/javascript" src="res/echarts/echarts.min.js"></script>
    <!-- 引入jquery.js -->
    <script type="text/javascript" src="res/echarts/jquery.js"></script>
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
    <!-- 柱状图容器 -->
    <div id="main" style="width:600px; height:400px;"></div>
    <script type="text/javascript">
        $(function() {
            // 初始化
            //var myChart = echarts.init(document.getElementById('main'));
var myChart = echarts.init($('#main')[0]); // 注意：这里init方法的参数的javascript对象，使用jQuery获取标签时，要将jQuery对象转成JavaScript对象；
 
            // 配置图标参数
            var options = {
                title: {
                    text: '汽车销量',
                    show: true, // 是否显示标题
                    subtext: '测试数据',
                    textStyle: {
                        fontSize: 18 // 标题文字大小
                    }
                },
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'shadow'
                    }
                },
                legend: {
                    data: ['销量']
                },
                // X轴
                xAxis: {
                    data: [] // 异步请求时,这里要置空
                },
                // Y轴
                yAxis: {},
                series: [{
                    name: '销量',
                    type: 'bar', // 设置图表类型为柱状图
                    data: [] // 设置纵坐标的刻度(异步请求时,这里要置空)
                }]
            };
            // 给图标设置配置的参数
            myChart.setOption(options);
            myChart.showLoading(); // 显示加载动画
// 异步请求加载数据
            $.ajax({
                url: '/user/select',
                type: 'get',
                dataType: 'json',
                success: function(data) {
                	alert(data.data[0].region);
                    var names = [];
                    var nums = [];
                    $.each(data.data, function(index, obj) {
                        names.push(obj.region);
                        nums.push(obj.uuid);
                    })
 
                    myChart.hideLoading(); // 隐藏加载动画
                    myChart.setOption({
                        legend: {
                            data: ['销量']
                        },
                        xAxis: {
                            data: names
                        },
                        series: [{
                            name: '销量',
                            type: 'bar', // 设置图表类型为柱状图
                            data: nums // 设置纵坐标的刻度
                        }]
                    });
                }
            });
        });
    </script>
</body>
</html>
