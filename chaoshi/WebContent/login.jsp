<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
        <title>407-3组-超市管理系统</title>
        <link rel="stylesheet" href="styles/common.css"/>
    </head>
    
    
    <body>


   		 <div class="page-header">
           
            <div class="header-title">
                	欢迎来到407-3组-超市管理系统
            </div>
   
     	</div>

    <div class="page-login">

         <img src="images/login.jpg" alt="CoolMeeting"/>
             
         <div style="position:absolute; left:800px; top:270px">
                
             <div class="page-content">
             <div class="content-nav">
                            
                
                <form action="UserServlet" method="post">
                
                
                    <fieldset style = " padding:30px ;  
   									    width:260px;
    								 ">
   										
                        <legend><div class="login">用户登录</div></legend>
                        <font color = "red">${requestScope.msg }</font>
                        
                        <table class="formtable" style="width:100%">
                       
                           
                            <tr>                               
                                <td>
                                    <input id="accountname" name="username" type="text" placeholder="工号/学号"/>
                                </td>
                            </tr>
                            
                            <tr>                                
                                <td>
                                    <input id="new" name="pwd" type="password" placeholder="密码"/>	
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="command">
                                    <input type="submit" value="登录" class="clickbutton" />
                                    <input type="reset" value="重置" class="clickbutton" onclick=""/>
                                    <input type="button" value="注册" class="clickbutton" onclick="window.location.href='SelectAllUsersServlet?code=zhuce';"/>
                                </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
            </div>
        </div>
　　　
　　    </div>
   </div>             

 <div class="page-footer">
            <hr/>
            更多问题，欢迎来到
            <img src="images/footer.png" alt="CoolMeeting"/>
        </div>
        
    </body>
</html>