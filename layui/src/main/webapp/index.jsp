<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<title>layui</title>
<script type="text/javascript" src="common/js/jquery-3.3.1/jquery-3.3.1.js"></script>
<script type="text/javascript" src="common/js/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<link type="text/css" rel="stylesheet" href="common/layui/css/layui.css" />
<script type="text/javascript" src="common/layui/layui.js"></script>
<%--<SCRIPT type="javascript" src="common/js/layuistady.js"></SCRIPT>--%>


<body>
<h2 >Hello World!</h2>
<div id="view"></div>
<script id="demo" type="text/html">
    <h3>{{ d.title }}</h3>
    <ul>
        {{#  layui.each(d.list, function(index, item){ }}
        <li>
            <span>{{ item.modname }}</span>
            <span>{{ item.alias }}：</span>
            <span>{{ item.site || '' }}</span>
        </li>
        {{#  }); }}
        {{#  if(d.list.length === 0){ }}
        无数据
        {{#  } }}
    </ul>
</script>

<script>
    layui.use('laytpl', function(){
        laytpl=layui.laytpl;
        var data = { //数据
            "title":"Layui常用模块"
            ,"list":[{"modname":"弹层","alias":"layer","site":"layer.layui.com"},{"modname":"表单","alias":"form"}]
        };
        var getTpl=document.getElementById('demo').innerHTML
            ,view = document.getElementById('view');
        laytpl(getTpl).render(data, function(html){
            view.innerHTML = html;
        });
    });
    layui.config({
        dir: 'common/layui/layui.js' //layui.js 所在路径（注意，如果是script单独引入layui.js，无需设定该参数。），一般情况下可以无视
        ,version: false //一般用于更新模块缓存，默认不开启。设为true即让浏览器不缓存。也可以设为一个固定的值，如：201610
        ,debug: false //用于开启调试模式，默认false，如果设为true，则JS模块的节点会保留在页面
        ,base: '' //设定扩展的Layui模块的所在目录，一般用于外部模块扩展
    });
</script>


</body>
</html>
