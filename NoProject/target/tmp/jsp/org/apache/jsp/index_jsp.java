/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.8.v20160314
 * Generated at: 2017-03-24 19:22:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("    <title>优朗英语</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- 引入 Bootstrap -->\n");
      out.write("    <link href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"wm-container\">\n");
      out.write("    <div id=\"wm-header\">\n");
      out.write("        <div class=\"header-content\">\n");
      out.write("            <!--  <ul class=\"header-ul clearfx\">\n");
      out.write("                  <li><img src=\"\" /> </li>\n");
      out.write("                  <li>优朗国际英语</li>\n");
      out.write("                  <li>自主招生</li>\n");
      out.write("              </ul>-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"nav-content\">\n");
      out.write("            <div class=\"nav-content-ul clearfx\">\n");
      out.write("                <ul class=\"nav-content-ul-main clearfx\">\n");
      out.write("                    <li class=\"li-index active\" ><p class=\"nav-tx\" >首页</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                    <li><p class=\"nav-tx\">课程介绍</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                    <li><p class=\"nav-tx\">常见问题</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                    <li><p class=\"nav-tx\">备考策略</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                    <li><p class=\"nav-tx\">课程优势</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                    <li class=\"li-last\"><p class=\"nav-tx\">辅导效果</p><p class=\"bg-hover\"></p></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"wm-main\">\n");
      out.write("        <div id=\"module1\"></div>\n");
      out.write("        <div id=\"module2\">\n");
      out.write("            <div class=\"module2-jz\">\n");
      out.write("                <p class=\"wenhao1 animated tada infinite\"><img class=\"lazy\" data-original=\"images/wenhao.png\" src=\"images/wenhao.png\"/></p>\n");
      out.write("                <p class=\"wenhao2 animated tada infinite\"><img class=\"lazy\" data-original=\"images/wenhao.png\" src=\"images/wenhao.png\"/></p>\n");
      out.write("                <p class=\"wenhao3 animated tada infinite\"><img class=\"lazy\" data-original=\"images/wenhao.png\" src=\"images/wenhao.png\"/></p>\n");
      out.write("                <p class=\"wenhao4 animated tada infinite\"><img class=\"lazy\" data-original=\"images/wenhao.png\" src=\"images/wenhao.png\"/></p>\n");
      out.write("                <a class=\"module2-btn1\"  target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx1.png\" src=\"images/zx1.png\"> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"module3\"></div>\n");
      out.write("        <div id=\"module4\">\n");
      out.write("            <div class=\"module4-jz\">\n");
      out.write("                <p class=\"module4-how animated pulse infinite\" ><img class=\"lazy\" data-original=\"images/how.png\" src=\"images/how.png\" style=\"width: 90%; \"/></p>\n");
      out.write("                <a class=\"module4-btn1\" target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx1.png\" src=\"images/zx1.png\"> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"module5\">\n");
      out.write("            <div class=\"module5-jz\">\n");
      out.write("                <a class=\"module5-btn1\" target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx2.png\" src=\"images/zx2.png\"> </a>\n");
      out.write("                <a class=\"module5-btn2\" target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx3.png\" src=\"images/zx3.png\"> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"module6\">\n");
      out.write("            <div class=\"module6-jz\">\n");
      out.write("                <a class=\"module6-btn1\" target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx4.png\" src=\"images/zx4.png\"> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"module7\"></div>\n");
      out.write("        <div id=\"module8\">\n");
      out.write("            <div class=\"module8-jz\">\n");
      out.write("                <a class=\"module8-btn1\" target=\"_blank\" href=\"http://kefu.qycn.com/vclient/chat/?websiteid=123779\"><img class=\"lazy\" data-original=\"images/zx1.png\" src=\"images/zx1.png\"> </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"wm-foot\">\n");
      out.write("        <div class=\"foot-main\">\n");
      out.write("            <p>优朗国际英语专业从事自主招生面试培训、三位一体面试培训的培训机构  备案号：浙ICP备16047794号-1</p>\n");
      out.write("            <p>总部：中国.浙江省.杭州市.拱墅区.湖墅南路260号8层 自主招生全国热线4008008273 关于优朗  站长统计</p>\n");
      out.write("            <p>杭州 | 上海 | 北京 | 广州 | 深圳 | 南京 | 南昌 | 长沙 | 武汉 | 合肥 | 济南 | 郑州 | 哈尔滨</p>\n");
      out.write("            <p>南宁 | 福州 | 太原 | 海口 | 呼和浩特 | 乌鲁木齐 | 沈阳| 西安 | 成都 | 长春 | 天津 | 青岛</p>\n");
      out.write("            <p class=\"ewm\"><img src=\"images/ewm.png\" alt=\"\"/></p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function(){\n");
      out.write("        var isAct = 0;\n");
      out.write("        $(\".nav-content-ul-main li\").each(function(i){\n");
      out.write("            $(\".nav-content-ul-main li\").eq(i).mouseover(function(){\n");
      out.write("                common(this)\n");
      out.write("            }).mouseout(function(){\n");
      out.write("                var m =$(\".nav-content-ul-main li\").eq(isAct)\n");
      out.write("                m.siblings().removeClass('active').removeClass('animated').removeClass(\"fadeIn\");\n");
      out.write("                m.addClass('active animated fadeIn');\n");
      out.write("            })\n");
      out.write("            $(\".nav-content-ul-main li\").eq(i).click(function(){\n");
      out.write("                common(this)\n");
      out.write("                isAct=i;\n");
      out.write("                switIndex(i);\n");
      out.write("            })\n");
      out.write("        })\n");
      out.write("\n");
      out.write("        function common(obj){\n");
      out.write("            $(obj).siblings().removeClass('active').removeClass('animated').removeClass(\"fadeIn\");\n");
      out.write("            $(obj).addClass('active animated fadeIn');\n");
      out.write("        }\n");
      out.write("        function switIndex(i){\n");
      out.write("            switch (i){\n");
      out.write("                case 0:$(\"html,body\").animate({scrollTop:0},1000);\n");
      out.write("                    break;\n");
      out.write("                case 1:$(\"html,body\").animate({scrollTop:1543},1000);\n");
      out.write("                    break;\n");
      out.write("                case 2:$(\"html,body\").animate({scrollTop:2325},1000);\n");
      out.write("                    break;\n");
      out.write("                case 3:$(\"html,body\").animate({scrollTop:3233},1000);\n");
      out.write("                    break;\n");
      out.write("                case 4:$(\"html,body\").animate({scrollTop:4016},1000);\n");
      out.write("                    break;\n");
      out.write("                case 5:$(\"html,body\").animate({scrollTop:5056},1000);\n");
      out.write("                    break;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    })\n");
      out.write("    $(window).scroll(function ()\n");
      out.write("    {\n");
      out.write("        var st = $(this).scrollTop();\n");
      out.write("        console.info(st);\n");
      out.write("        if(st>=221){\n");
      out.write("            $(\".nav-content\").addClass('start');\n");
      out.write("        }else{\n");
      out.write("            $(\".nav-content\").removeClass('start');\n");
      out.write("        }\n");
      out.write("        switStr(st)\n");
      out.write("    });\n");
      out.write("    function switStr(i){\n");
      out.write("        if(i<1543){\n");
      out.write("            commonAct(0);\n");
      out.write("        }else if(i>=1543 && i<2325){\n");
      out.write("            commonAct(1);\n");
      out.write("        }else if(i>=2325 && i<3233){\n");
      out.write("            commonAct(2);\n");
      out.write("        }else if(i>=3233 && i<4016){\n");
      out.write("            commonAct(3);\n");
      out.write("        }else if(i>=4016 && i<5056){\n");
      out.write("            commonAct(4);\n");
      out.write("        }else if(i>=5056  ){\n");
      out.write("            commonAct(5);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    function commonAct(i){\n");
      out.write("        var obj =$(\".nav-content-ul-main li\").eq(i)\n");
      out.write("        $(obj).siblings().removeClass('active').removeClass('animated').removeClass(\"fadeIn\");\n");
      out.write("        $(obj).addClass('active animated fadeIn');\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    (function(){\n");
      out.write("        var c=document.createElement(\"script\"),s=document.getElementsByTagName(\"script\")[0];\n");
      out.write("        c.src=\"//kefu.qycn.com/vclient/state.php?webid=123779\";\n");
      out.write("        s.parentNode.insertBefore(c,s);\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}