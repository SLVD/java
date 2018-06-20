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
                    商品管理 > 商品销售
                   <font color="red"> ${requestScope.msg } </font>
                
                <form action="SelectSpinKcnusServlet" method="post">
                  
                <table class="listtable">
                    <caption>所有会员:</caption>
                 
                 <c:if test="${requestScope.list ne null }">
                 	<tr class="listheader">
                      <th>商品编号</th>
                      <th>商品名称</th>
                      <th>商品价格</th>
                      <th>库存数量</th>
                      <th>操作</th>
                    </tr>         
                 </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "spin">
                 	  <tr>
                      <td>${spin.spid }</td> 
                      <td>${spin.spname }</td>
                      <td>${spin.spprice }</td>
                      <td>${spin.kcnum }</td>
                      <td>
                          <a class="clickbutton" href="UpSpinKcnumServlet?code=jinhuo&&spip=${spin.spip }">进货</a>
                          <a class="clickbutton" href="UpSpinKcnumServlet?code=maichu&&spip=${spin.spip }">卖出</a>
                      </td>
                </tr>
                 	
                 
                 </c:forEach>

                </table>
                    
                    
                </form>
            </div>
        </div>
        
    
       
    </body>
</html>