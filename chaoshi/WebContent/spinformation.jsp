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
                    商品管理 > 商品信息
                   <font color="red"> ${requestScope.msg } </font>
                
                <form action="AddSpinformationServlet" method="post">
                    <fieldset>
                        <legend>商品信息</legend>
                        <table class="formtable" style="width:50%">
                            <tr>
                                <td>商品编号：</td>
                                <td>
                                    <input type="text"  name =  "spid" id="employeename" maxlength="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td>商品名称：</td>
                                <td>
                                    <input type="text" name = "spname" id="accountname" maxlength="20"/>
                                </td>
                            </tr>
                         
                            <tr>
                                <td>商品价格：</td>
                                <td>
                                    <input type="text"  name = "spprice" id="password" maxlength="20"/>
                                </td>
                                
                                
                            </tr>
                            
                            
                            <tr>
                                <td>库存数量：</td>  
                                <td>
                                   <input type="text"  name = "kcnum" id="phone" maxlength="20"/>
                                </td>
                            </tr>
                            
                            <tr>
                            <td>厂商编号：</td> 
                            <td>
                               <input type="text"  name = "manufacyurerid" id="phone" maxlength="20"/>
                            </td>
                        </tr>
             
                 
                            <tr>
                                <td colspan="6" class="command">
                                    <input type="submit" class="clickbutton" value="添加"/>
                                    <input type="reset" class="clickbutton" value="重置"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                    
                    
                <table class="listtable">
                    <caption>所有商品信息:</caption>
                 
                 <c:if test="${requestScope.list ne null }">
                 	<tr class="listheader">
                      <th>商品编号</th>
                      <th>商品名称</th>
                      <th>商品价格</th>
                      <th>库存数量</th>
                      <th>厂商编号</th>
                      <th>操作</th>
                    </tr>         
                 </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "spin">
                 	  <tr>
                      <td>${spin.spid }</td> 
                      <td>${spin.spname }</td>
                      <td>${spin.spprice }</td>
                      <td>${spin.kcnum }</td>
                      <td>${spin.manufacyurerid }</td>
                      <td>
                          <a class="clickbutton" href="DelSpinformationServlet?spip=${spin.spip }">不卖了</a>
                      </td>
                </tr>
                 	
                 
                 </c:forEach>

                </table>
                    
                    
                </form>
            </div>
            
        </div>
   
       
    </body>
</html>