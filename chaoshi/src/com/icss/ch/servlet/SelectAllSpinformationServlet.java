package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.SpinformationDao;
import com.icss.ch.vo.Spinformation;


@WebServlet("/SelectAllSpinformationServlet")
public class SelectAllSpinformationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//È¥µ÷ÓÃdao²ã
		SpinformationDao dao = new SpinformationDao();
		List<Spinformation> list = dao.selectAllSpinformation();
		request.setAttribute("list", list);		
		request.getRequestDispatcher("spinformation.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
