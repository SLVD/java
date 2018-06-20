package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.dao.UsersDao;

@WebServlet("/DelMembersServlet")
public class DelMembersServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��ȡ�������
				String memberid = request.getParameter("memberid");
				//����dao
				MembersDao dao =  new MembersDao();
				//ת��
				dao.DeleteMembers(Integer.parseInt(memberid));
	
				request.setAttribute("msg", "�����������ɹ��ˣ�");
				request.getRequestDispatcher("SelectMembersServlet").forward(request, response);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
