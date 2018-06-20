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
	
		//��ȡ�������
				String userip = request.getParameter("userip");
				//����dao
				UsersDao dao =  new UsersDao();
				//ת��
				dao.UpdateUserStatus(Integer.parseInt(userip));
				//��ת
				request.setAttribute("msg", "��������˳ɹ��˰���");
				request.getRequestDispatcher("RegisterShenpiServlet").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
