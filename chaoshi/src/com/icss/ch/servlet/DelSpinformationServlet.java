package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.dao.SpinformationDao;

@WebServlet("/DelSpinformationServlet")
public class DelSpinformationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�������
		String spip = request.getParameter("spip");
		//����dao
		SpinformationDao dao =  new SpinformationDao();
		//ת��
		dao.DeleteSpinformation(Integer.parseInt(spip));	
		request.setAttribute("msg", "�����������ɹ��ˣ�");
		request.getRequestDispatcher("SelectAllSpinformationServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
