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

		//��ȡ�������
		String userip = request.getParameter("userip");
		//����dao
		UsersDao dao =  new UsersDao();
		//ת��
		dao.DeleteUser(Integer.parseInt(userip));
		String code = request.getParameter("code");
		//��ת
		if(code.equals("zx"))
		{
			request.setAttribute("msg", "�����������ɹ��ˣ�");
			request.getRequestDispatcher("SelectAllUsersServlet?code=yg").forward(request, response);
		}
		
		if(code.equals("del"))
		{
			request.setAttribute("msg", "�����������ɹ��ˣ�");
			request.getRequestDispatcher("RegisterShenpiServlet").forward(request, response);
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.doGet(request, response);
	}

}
