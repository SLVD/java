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
         
            <div class="page-content">
                <div class="content-nav">
                    消息中心 > 留言板
                   <font color="red"> ${requestScope.msg } </font>
                
                <form action="AddMessagesServlet" method="post">
                    <fieldset>
                        <legend>留言板</legend>
                        <table class="formtable" style="width:50%">
                           
                            <tr>                          
                                <td>
                                    <input type="text" name = "messageboard" id="accountname" maxlength="200"/>
                                    <input type="submit" class="clickbutton" value="添加"/>
                                </td>
                            </tr>
                           
  
                        </table>
                        
                    <table class="listtable">
                    <caption>所有留言消息：</caption>       
                     <c:if test="${requestScope.list ne null }">
                     	<tr class="listheader">
                        <th>留言</th>
                        <th>操作</th>

                    </tr>    
                    </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "messages">
                 	  <tr>
                 	  <td>${messages.messageboard }</td>               	               
                      <td>                
                            <input type="button" class="clickbutton" value="删除" onclick="window.location.href='DelMessagesServlet?messageip=${messages.messageip}';"/>                       
                      </td>																					
                </tr>               
                 </c:forEach>
      
                </table>
                
                
                    </fieldset>
                </form>
            </div>
        </div>
        
      
       
    </body>
</html>