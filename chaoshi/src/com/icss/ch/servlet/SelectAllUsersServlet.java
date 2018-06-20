package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.UsersDao;
import com.icss.ch.vo.Users;


@WebServlet("/SelectAllUsersServlet")
public class SelectAllUsersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//È¥µ÷ÓÃdao
				UsersDao dao = new UsersDao();
				List<Users> list = dao.selectAllUser();
				request.setAttribute("list", list);
				String code = request.getParameter("code");
				if(code.equals("yg"))
				{
					request.getRequestDispatcher("selectusers.jsp").forward(request, response);
					
				}
				if(code.equals("zhuce"))
				{
					request.getRequestDispatcher("addusers.jsp").forward(request, response);
				}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
