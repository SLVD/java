package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.service.UsersService;
import com.icss.ch.vo.Users;

@WebServlet("/AddUsersServlet")
public class AddUsersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
				String userid = request.getParameter("userid");
				String username = request.getParameter("username");
				String userpassword = request.getParameter("userpassword");		
				String userstatus = request.getParameter("userstatus");
				String userphone = request.getParameter("userphone");
				
				UsersService service =  new UsersService();
				Users use = new Users(Integer.parseInt(userid),username,userpassword,"2",userphone);
				int flag = service.AddUsers(use);
				
				if(flag == 1)
				{
					request.setAttribute("msg", "嘻嘻，加好了啊~");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "不对啊，重新试试吧");
					request.getRequestDispatcher("addusers.jsp").forward(request, response);
				}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
