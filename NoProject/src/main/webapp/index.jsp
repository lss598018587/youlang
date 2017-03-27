<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>优朗英语</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
<div id="wm-container">
    <div id="wm-header">
        <div class="header-content">
            <!--  <ul class="header-ul clearfx">
                  <li><img src="" /> </li>
                  <li>优朗国际英语</li>
                  <li>自主招生</li>
              </ul>-->

        </div>
        <div class="nav-content">
            <div class="nav-content-ul clearfx">
                <ul class="nav-content-ul-main clearfx">
                    <li class="li-index active" ><p class="nav-tx" >首页</p><p class="bg-hover"></p></li>
                    <li><p class="nav-tx">课程介绍</p><p class="bg-hover"></p></li>
                    <li><p class="nav-tx">常见问题</p><p class="bg-hover"></p></li>
                    <li><p class="nav-tx">备考策略</p><p class="bg-hover"></p></li>
                    <li><p class="nav-tx">课程优势</p><p class="bg-hover"></p></li>
                    <li class="li-last"><p class="nav-tx">辅导效果</p><p class="bg-hover"></p></li>
                </ul>
            </div>

        </div>
    </div>
    <div id="wm-main">
        <div id="module1"></div>
        <div id="module2">
            <div class="module2-jz">
                <p class="wenhao1 animated tada infinite"><img class="lazy" data-original="images/wenhao.png" src="images/wenhao.png"/></p>
                <p class="wenhao2 animated tada infinite"><img class="lazy" data-original="images/wenhao.png" src="images/wenhao.png"/></p>
                <p class="wenhao3 animated tada infinite"><img class="lazy" data-original="images/wenhao.png" src="images/wenhao.png"/></p>
                <p class="wenhao4 animated tada infinite"><img class="lazy" data-original="images/wenhao.png" src="images/wenhao.png"/></p>
                <a class="module2-btn1"  target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx1.png" src="images/zx1.png"> </a>
            </div>
        </div>
        <div id="module3"></div>
        <div id="module4">
            <div class="module4-jz">
                <p class="module4-how animated pulse infinite" ><img class="lazy" data-original="images/how.png" src="images/how.png" style="width: 90%; "/></p>
                <a class="module4-btn1" target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx1.png" src="images/zx1.png"> </a>
            </div>
        </div>
        <div id="module5">
            <div class="module5-jz">
                <a class="module5-btn1" target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx2.png" src="images/zx2.png"> </a>
                <a class="module5-btn2" target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx3.png" src="images/zx3.png"> </a>
            </div>
        </div>
        <div id="module6">
            <div class="module6-jz">
                <a class="module6-btn1" target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx4.png" src="images/zx4.png"> </a>
            </div>
        </div>
        <div id="module7"></div>
        <div id="module8">
            <div class="module8-jz">
                <a class="module8-btn1" target="_blank" href="http://kefu.qycn.com/vclient/chat/?websiteid=123779"><img class="lazy" data-original="images/zx1.png" src="images/zx1.png"> </a>
            </div>
        </div>
    </div>
    <div id="wm-foot">
        <div class="foot-main">
            <p>优朗国际英语专业从事自主招生面试培训、三位一体面试培训的培训机构  备案号：浙ICP备16047794号-1</p>
            <p>总部：中国.浙江省.杭州市.拱墅区.湖墅南路260号8层 自主招生全国热线4008008273 关于优朗  站长统计</p>
            <p>杭州 | 上海 | 北京 | 广州 | 深圳 | 南京 | 南昌 | 长沙 | 武汉 | 合肥 | 济南 | 郑州 | 哈尔滨</p>
            <p>南宁 | 福州 | 太原 | 海口 | 呼和浩特 | 乌鲁木齐 | 沈阳| 西安 | 成都 | 长春 | 天津 | 青岛</p>
            <p class="ewm"><img src="images/ewm.png" alt=""/></p>
        </div>
    </div>
</div>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
    $(function(){
        var isAct = 0;
        $(".nav-content-ul-main li").each(function(i){
            $(".nav-content-ul-main li").eq(i).mouseover(function(){
                common(this)
            }).mouseout(function(){
                var m =$(".nav-content-ul-main li").eq(isAct)
                m.siblings().removeClass('active').removeClass('animated').removeClass("fadeIn");
                m.addClass('active animated fadeIn');
            })
            $(".nav-content-ul-main li").eq(i).click(function(){
                common(this)
                isAct=i;
                switIndex(i);
            })
        })

        function common(obj){
            $(obj).siblings().removeClass('active').removeClass('animated').removeClass("fadeIn");
            $(obj).addClass('active animated fadeIn');
        }
        function switIndex(i){
            switch (i){
                case 0:$("html,body").animate({scrollTop:0},1000);
                    break;
                case 1:$("html,body").animate({scrollTop:1543},1000);
                    break;
                case 2:$("html,body").animate({scrollTop:2325},1000);
                    break;
                case 3:$("html,body").animate({scrollTop:3233},1000);
                    break;
                case 4:$("html,body").animate({scrollTop:4016},1000);
                    break;
                case 5:$("html,body").animate({scrollTop:5056},1000);
                    break;
            }
        }
    })
    $(window).scroll(function ()
    {
        var st = $(this).scrollTop();
        console.info(st);
        if(st>=221){
            $(".nav-content").addClass('start');
        }else{
            $(".nav-content").removeClass('start');
        }
        switStr(st)
    });
    function switStr(i){
        if(i<1543){
            commonAct(0);
        }else if(i>=1543 && i<2325){
            commonAct(1);
        }else if(i>=2325 && i<3233){
            commonAct(2);
        }else if(i>=3233 && i<4016){
            commonAct(3);
        }else if(i>=4016 && i<5056){
            commonAct(4);
        }else if(i>=5056  ){
            commonAct(5);
        }
    }
    function commonAct(i){
        var obj =$(".nav-content-ul-main li").eq(i)
        $(obj).siblings().removeClass('active').removeClass('animated').removeClass("fadeIn");
        $(obj).addClass('active animated fadeIn');
    }
</script>
<script>
    (function(){
        var c=document.createElement("script"),s=document.getElementsByTagName("script")[0];
        c.src="//kefu.qycn.com/vclient/state.php?webid=123779";
        s.parentNode.insertBefore(c,s);
    })();
</script>
</body>
</html>
