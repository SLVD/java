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
        <style type="text/css">
            
        </style>
    </head>
    <body>
        
            
        <div class="content-nav">
                   人员管理 > 会员管理
                <font color="red"> ${requestScope.msg } </font>
                <form action="AddMembersServlet" method="post">
                    <fieldset>
                        <legend>添加会员</legend> 
                        
                        <table class="formtable" style="width:50%">
                            <tr>
                                <td>会员编号：</td>
                                <td>
                                    <input type="text"  name =  "memberid" id="employeename" maxlength="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td>会员卡号：</td>
                                <td>
                                    <input type="text" name = "cardnum" id="accountname" maxlength="20"/>
                                </td>
                            </tr>
                         
                            <tr>
                                <td>累积消费金额：</td>
                                <td>
                                    <input type="text"  name = "summoney" id="password" maxlength="20" />
                                </td>
                                
                                
                            </tr>
                            
                            
                            <tr>
                                <td>注册日期：</td>
                                <td>
                                   <input type="text"  name = "registrationdate" id="phone" maxlength="20" placeholder="例如2017-4-20"/>
                                </td>
                            </tr>
                 
                            <tr>
                                <td colspan="6" class="command">
                                    <input type="submit" class="clickbutton"  value="添加"/>
                                    <input type="reset" class="clickbutton" value="重置"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                    
                  
                 
              
                <table class="listtable">
                    <caption>所有会员:</caption>
                 
                 <c:if test="${requestScope.list ne null }">
                 	<tr class="listheader">
                      <th>会员编号</th>
                      <th>会员卡号</th>
                      <th>累积消费金额</th>
                      <th>注册日期</th>
                      <th>操作</th>
                    </tr>         
                 </c:if>
                 
                 <c:forEach items="${requestScope.list }" var = "members">
                 	  <tr>
                      <td>${members.memberid }</td> 
                      <td>${members.cardnum }</td>
                      <td>${members.summoney }</td>
                      <td>${members.registrationdate }</td>
                      <td>
                          <a class="clickbutton" href="DelMembersServlet?memberid=${members.memberid }">删除</a>
                      </td>
                </tr>
                 	
                 
                 </c:forEach>

                </table>
             </form>  
            </div>  
                     
    </body>
</html>