package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.NoticesDao;
import com.icss.ch.dao.SpinformationDao;

@WebServlet("/DelNoticesServlet")
public class DelNoticesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//��ȡ�������
				String noticeip = request.getParameter("noticeip");
				//����dao
				NoticesDao dao =  new NoticesDao();
				//ת��
				dao.DeleteNotices(Integer.parseInt(noticeip));	
				request.setAttribute("msg", "�����������ɹ��ˣ�");
				request.getRequestDispatcher("SelectNoticesServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
