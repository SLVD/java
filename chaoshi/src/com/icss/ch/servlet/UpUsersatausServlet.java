package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.UsersDao;

@WebServlet("/UpUsersatausServlet")
public class UpUsersatausServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//获取请求参数
				String userip = request.getParameter("userip");
				//调用dao
				UsersDao dao =  new UsersDao();
				//转型
				dao.UpdateUserStatus(Integer.parseInt(userip));
				//跳转
				request.setAttribute("msg", "嘻嘻，审核成功了啊！");
				request.getRequestDispatcher("RegisterShenpiServlet").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
