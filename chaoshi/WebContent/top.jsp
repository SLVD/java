<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>407-3组-超市管理系统</title>
 <link rel="stylesheet" href="styles/common.css"/>
</head>

<body>
  <div class="page-header">
            
            <div class="header-title">
                超市管理系统
            </div>
            <div class="header-quicklink">
                欢迎您，<strong>
                
                <%-- <%String name = (String)session.getAttribute("name"); %>
                <%=name %> --%>
                ${sessionScope.name}
                </strong>
                <a href="#"></a>
            </div>
        </div>
</body>
</html>
