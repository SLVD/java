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
       
       
   		 
            <div class="addtitle">
                	欢迎来到407-3组-超市管理系统
            </div>
   
 
       
       
       <div style="position:absolute; left:350px; top:170px">
        
            <div class="page-content">
                <div class="content-nav">
                    
                   <font color="red"> ${requestScope.msg } </font>
                
                <form action="AddUsersServlet" method="post">
                
                    <fieldset  style = " width:520px ; padding-left:200px  ">
                        <legend>用户信息</legend>
                        <table class="formtable" style="width:50%">
                            <tr>
                                <td>用户编号：</td>
                                <td>
                                    <input type="text"  name =  "userid" id="employeename" maxlength="20"/>
                                </td>
                            </tr>
                            <tr>
                                <td>用户名称：</td>
                                <td>
                                    <input type="text" name = "username" id="accountname" maxlength="20"/>
                                </td>
                            </tr>
                         
                            <tr>
                                <td>密码：</td>
                                <td>
                                    <input type="password"  name = "userpassword" id="password" maxlength="20" placeholder="请输入6位以上的密码"/>
                                </td>
                                
                                
                            </tr>
                            
                            
                            <tr>
                                <td>联系方式：</td>
                                <td>
                                   <input type="text"  name = "userphone" id="phone" maxlength="20"/>
                                </td>
                            </tr>
                 
                            <tr>
                                <td colspan="6" class="command">
                                    <input type="submit" class="clickbutton" value="注册"/>
                                    <input type="reset" class="clickbutton" value="重置"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
            </div>
        </div>
        
        </div>
        
        
       
    </body>
</html>