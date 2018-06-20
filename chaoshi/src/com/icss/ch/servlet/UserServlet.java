package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.icss.ch.service.UsersService;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求参数
		String name = request.getParameter("username");
		String password = request.getParameter("pwd");
		
		UsersService service = new UsersService();
		int flag = service.login(name, password);
		//跳转页面
		if(flag ==1){
			//把登陆成功的人存在session
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			request.getRequestDispatcher("index.jsp")
			.forward(request,response);
		}
		if(flag ==2){
			//提示信息
			request.setAttribute("msg", "正在审核，请耐心等待");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
		if(flag ==3){
			request.setAttribute("msg", "审核失败，请重新注册");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
		if(flag ==0){
			request.setAttribute("msg", "此用户不存在");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
