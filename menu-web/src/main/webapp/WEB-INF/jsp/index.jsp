<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/13
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>后台模板</title>
  <link rel="stylesheet" href="../assets/css/amazeui.css" />
  <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="../assets/css/core.css" />
  <link rel="stylesheet" href="../assets/css/menu.css" />
  <link rel="stylesheet" href="../assets/css/index.css" />
  <link rel="stylesheet" href="../assets/css/admin.css" />
  <link rel="stylesheet" href="../assets/css/page/typography.css" />
</head>
<body>
<!-- Begin page -->
<header class="am-topbar am-topbar-fixed-top">
  <div class="am-topbar-left am-hide-sm-only">

    <a href="index.html" class="logo">AdminName<i class="zmdi zmdi-layers"></i></a>
    </div>

  <div class="contain">
    <ul class="am-nav am-navbar-nav am-navbar-left">

      <li><h4 class="page-title">排版</h4></li>
    </ul>

    <ul class="am-nav am-navbar-nav am-navbar-right">
      <li class="inform"><i class="fa fa-bell-o" aria-hidden="true"></i></li>
      <li class="hidden-xs am-hide-sm-only">
        <form role="search" class="app-search">
          <input type="text" placeholder="Search..." class="form-control">
          <a href=""><img src="../assets/img/search.png"></a>
        </form>
      </li>
    </ul>
  </div>
</header>

<div class="admin">
  <div class="am-g">

    <div class="admin-sidebar am-offcanvas am-u-md-1 am-padding-0" id="admin-offcanvas">
      <div class="am-offcanvas-bar admin-offcanvas-bar">
        <!-- User -->
        <div class="user-box am-hide-sm-only">
          <div class="user-img">
            <img src="../assets/img/avatar-1.jpg" alt="user-img" title="Mat Helme" class="img-circle img-thumbnail img-responsive">
            <div class="user-status offline"><i class="fa fa-dot-circle-o" aria-hidden="true"></i></div>
          </div>
          <h5><a href="#">${sessionScope.u.userName}</a> </h5>
          <ul class="list-inline">
            <li>
              <a href="#">
                <i class="fa fa-cog" aria-hidden="true"></i>
              </a>
            </li>
            <li>
              <a href="#" class="text-custom">
                <i class="fa fa-cog" aria-hidden="true"></i>
              </a>
            </li>
          </ul>
        </div>

        <ul class="am-list admin-sidebar-list">
          <li><a href="typography.html"><span class="am-icon-home"></span> 排版</a></li>
          <li class="admin-parent">
            <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}">
              <span class="am-icon-file"></span> 页面模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
            <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
              <c:forEach items="${sessionScope.u.moduleList}" var="ss">
              <li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span>${ss.moduleName}<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
              </c:forEach>
            </ul>
          </li>
          <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
        </ul>
      </div>
    </div>

    <div class="content-page am-u-md-10  am-u-sm-12">
      <!-- Start content -->
      <div class="content">
        <div class="am-g">
          <!-- Row start -->
          <div class="am-u-sm-12">
            <div class="card-box">
              <ul class="am-nav am-fr">
                <li class="am-dropdown" data-am-dropdown>
                  <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                    <span class="am-icon-caret-down"></span>
                  </a>
                  <ul class="am-dropdown-content">
                    <li>1231234</li>
                    <li>1231234</li>
                    <li>1231234</li>
                    <li>1231234</li>
                  </ul>
                </li>
              </ul>

              <h4 class="header-title m-t-0 m-b-30">标题</h4>
              <h1>这是标题1</h1>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这题1这是标题1这是标题1这是标题1这是标题1这题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>

              <h2>这是标题2</h2>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>

              <h3>这是标题3</h3>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题是标题1这是标题1这是标题是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>

              <h4>这是标题4</h4>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标是标题1这是标题1这是标题是标题1这是标题1这是标题题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>

              <h5>这是标题5</h5>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标是标题1这是标题1这是标题是标题1这是标题1这是标题题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>

              <h6>这是标题6</h6>
              <p class="text-muted">
                这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题是标题1这是标题1这是标题是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1这是标题1
              </p>
              <div class="clearfix"></div>
            </div>
          </div>
          <!-- Row end -->
        </div>
      </div>
    </div>

  </div>
</div>

<!-- navbar -->
<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>

<script type="text/javascript" src="../assets/js/jquery-2.1.0.js" ></script>
<script type="text/javascript" src="../assets/js/amazeui.min.js"></script>
<script type="text/javascript" src="../assets/js/app.js" ></script>
<script type="text/javascript" src="../assets/js/blockUI.js" ></script>
</body>

</html>
