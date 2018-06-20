package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MessagesDao;
import com.icss.ch.dao.NoticesDao;

@WebServlet("/DelMessagesServlet")
public class DelMessagesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//��ȡ�������
				String messageip = request.getParameter("messageip");
				//����dao
				MessagesDao dao =  new MessagesDao();
				//ת��
				dao.DeleteMessages(Integer.parseInt(messageip));	
				request.setAttribute("msg", "�����������ɹ��ˣ�");
				request.getRequestDispatcher("SelectMessagesServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
