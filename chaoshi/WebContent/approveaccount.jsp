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
       
            
            <div class="header-title">
               
                    人员管理 > 注册审批
                </div>
                <form action="RegisterShenpiServlet" method="post">
                <table class="listtable">
                    <caption>所有待审批注册信息：</caption>
                     <font color="red"> ${requestScope.msg } </font>
                     <c:if test="${requestScope.list ne null }">
                     	<tr class="listheader">
                        <th>用户编号</th>
                        <th>用户姓名</th>
                        <th>联系电话</th>	
                        <th>操作</th>
                    </tr>    
                    </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "approveaccount">
                 	  <tr>
                 	  <td>${approveaccount.username }</td>               	  
                      <td>${approveaccount.userpassword }</td> 
                      <td>${approveaccount.userphone }</td>     
                      <td>   
                            <input type="button" class="clickbutton" value="通过" onclick="window.location.href='UpUsersatausServlet?userip=${approveaccount.userip }';"/>
                            <input type="button" class="clickbutton" value="删除" onclick="window.location.href='DelUserServlet?code=del&&userip=${approveaccount.userip }';"/>                       
                      </td>																					
                </tr>               
                 </c:forEach>
      
                </table>
                 </form>
            </div>
      
      
    </body>
</html>