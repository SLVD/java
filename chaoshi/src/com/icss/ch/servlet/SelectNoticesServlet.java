package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.NoticesDao;
import com.icss.ch.dao.SpinformationDao;
import com.icss.ch.vo.Notices;
import com.icss.ch.vo.Spinformation;

@WebServlet("/SelectNoticesServlet")
public class SelectNoticesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//È¥µ÷ÓÃdao²ã
				NoticesDao dao = new NoticesDao();
				List<Notices> list = dao.selectAllNotices();
				request.setAttribute("list", list);		
				request.getRequestDispatcher("notices.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
