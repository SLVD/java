<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>407-3组-超市管理系统</title>
<link rel="stylesheet" href="styles/common03.css" />

        
<script src="jquery/jquery-1.7.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
	function check() {
		var flag=false;
		var newpwd = $("#new").val().trim();
		var newspwd = $("#confirm").val().trim();
		if (newpwd != newspwd){
			$("#loginWarnDivId").html("密码不一致");
		}else{
			$("#loginWarnDivId").html("密码一致");
			flag = true;
		}
		return flag;
	}
</script>
</head>
<body>
	
		
		<div class="page-content">
			<div class="content-nav">修改密码</div>
			<form action="ChangePwdServlet" onsubmit="return check();">
				<fieldset>
					<legend>修改密码信息</legend>
					<div id="loginWarnDivId" style="color:red;display:table-cell;vertical-align:middle;width:120px">

					</div>
					<div>
					<font color="red">
						${requestScope.msg}
					</font>
					</div>
					<table class="formtable" style="width: 50%">
						<tr>
							<td>原密码:</td>
							<td><input id="origin" type="password" name="pwd"/></td>
						</tr>
						<tr>
							<td>新密码:</td>
							<td><input id="new" type="password"  name="newpwd"/></td>
						</tr>
						<tr>
							<td>确认新密码：</td>
							<td><input id="confirm" type="password" name="renewpwd"
							onblur="check();"/></td>


						</tr>

						<tr>
							<td colspan="2" class="command"><input type="submit"
								value="确认修改" class="clickbutton" /> <input type="button"
								value="返回" class="clickbutton" onclick="window.history.back();" />
							</td>
						</tr>

					</table>
				</fieldset>
			</form>
					
		</div>
	</div>
	

</body>
</html>