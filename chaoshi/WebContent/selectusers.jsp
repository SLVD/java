<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head>
        <title>407-3组-超市管理系统</title>
        <link rel="stylesheet" href="styles/common03.css"/>
        
    </head>
    <body>
        
            
        <div class="content-nav">
                    人员管理> 搜索员工
                <font color="red"> ${requestScope.msg } </font>
                <form action="SelectAllUsersServlet" method="post">

                <table class="listtable">
                
                 <c:if test="${requestScope.list ne null }">
                 	    <tr class="listheader">    	
	                        <th>用户编号</th>
	                        <th>用户名称</th>
	                        <th>联系电话</th>
	                        <th>操作</th>
                        </tr>
                 </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "searchusers">
                 	  <tr>
	                      <td>${searchusers.userid }</td> 
	                      <td>${searchusers.username }</td>
	                      <td>${searchusers.userphone }</td>
	                      
	                       <td> 
	                          <a class="clickbutton" href="DelUserServlet?code=zx&&userip=${searchusers.userip }">注销</a>
	                      </td>
                      </tr>               
                 </c:forEach>
           
                </table>
                </form>
            </div>             
    </body>
</html>