package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MessagesDao;
import com.icss.ch.dao.NoticesDao;
import com.icss.ch.vo.Messages;
import com.icss.ch.vo.Notices;

@WebServlet("/SelectMessagesServlet")
public class SelectMessagesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//È¥µ÷ÓÃdao²ã
		MessagesDao dao = new MessagesDao();
		List<Messages> list = dao.selectAllMessages();
		request.setAttribute("list", list);		
		request.getRequestDispatcher("messages.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
