package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.UsersDao;

@WebServlet("/DelUserServlet")
public class DelUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		//获取请求参数
		String userip = request.getParameter("userip");
		//调用dao
		UsersDao dao =  new UsersDao();
		//转型
		dao.DeleteUser(Integer.parseInt(userip));
		String code = request.getParameter("code");
		//跳转
		if(code.equals("zx"))
		{
			request.setAttribute("msg", "嘻嘻，操作成功了！");
			request.getRequestDispatcher("SelectAllUsersServlet?code=yg").forward(request, response);
		}
		
		if(code.equals("del"))
		{
			request.setAttribute("msg", "嘻嘻，操作成功了！");
			request.getRequestDispatcher("RegisterShenpiServlet").forward(request, response);
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.doGet(request, response);
	}

}
