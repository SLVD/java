package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.service.MessagesService;
import com.icss.ch.service.NoticesService;
import com.icss.ch.vo.Messages;
import com.icss.ch.vo.Notices;

@WebServlet("/AddMessagesServlet")
public class AddMessagesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��ȡ�������
				String messageboard = request.getParameter("messageboard");
				MessagesService service =  new MessagesService();
				Messages mes = new Messages(messageboard);				
				int flag = service.AddMessages(mes);				
				if(flag == 1)
				{
					request.setAttribute("msg", "�������Ӻ��˰�~");
					request.getRequestDispatcher("SelectMessagesServlet").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "���԰����������԰�");
					request.getRequestDispatcher("messages.jsp").forward(request, response);
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
