package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.vo.Members;

@WebServlet("/SelectMembersServlet")
public class SelectMembersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//ȥ����dao��
		MembersDao dao = new MembersDao();
		List<Members> list = dao.selectAllMembers();
		request.setAttribute("list", list);
		request.getRequestDispatcher("members.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request, response);
	}

}
