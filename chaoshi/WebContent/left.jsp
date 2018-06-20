<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>407-3组-超市管理系统</title>
<link rel="stylesheet" type="text/css" href="styles/common02.css"/>
</head>
<body>
            <div class="page-sidebar">
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">消息中心</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="SelectNoticesServlet" target="main">公告栏</a></li>
                        <li class="sidebar-menuitem active"><a href="SelectMessagesServlet" target="main">留言板</a></li>       
                    </ul>
                </div>
              
                          
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">商品管理</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="SelectAllSpinformationServlet" target="main">商品操作</a></li>
                        <li class="sidebar-menuitem"><a href="SelectSpinKcnusServlet" target="main">商品销售</a></li>          
                       
                    </ul>
                </div>
                
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">人员管理</div>
                    <ul class="sidebar-menu">
                        <li class="sidebar-menuitem"><a href="SelectMembersServlet"  target="main">会员管理</a></li>
                        <li class="sidebar-menuitem"><a href="RegisterShenpiServlet" target="main">注册审批</a></li>
                        <li class="sidebar-menuitem"><a href="SelectAllUsersServlet?code=yg" target="main">搜索员工</a></li>
                    </ul>
                </div>    
            </div>
</body>
</html>
