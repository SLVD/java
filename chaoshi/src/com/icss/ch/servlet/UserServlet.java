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
		//��ȡ�������
		String name = request.getParameter("username");
		String password = request.getParameter("pwd");
		
		UsersService service = new UsersService();
		int flag = service.login(name, password);
		//��תҳ��
		if(flag ==1){
			//�ѵ�½�ɹ����˴���session
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			request.getRequestDispatcher("index.jsp")
			.forward(request,response);
		}
		if(flag ==2){
			//��ʾ��Ϣ
			request.setAttribute("msg", "������ˣ������ĵȴ�");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
		if(flag ==3){
			request.setAttribute("msg", "���ʧ�ܣ�������ע��");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
		if(flag ==0){
			request.setAttribute("msg", "���û�������");
			request.getRequestDispatcher("login.jsp")
			.forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
