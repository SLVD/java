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
		
		//获取请求参数
				String memberid = request.getParameter("memberid");
				//调用dao
				MembersDao dao =  new MembersDao();
				//转型
				dao.DeleteMembers(Integer.parseInt(memberid));
	
				request.setAttribute("msg", "嘻嘻，操作成功了！");
				request.getRequestDispatcher("SelectMembersServlet").forward(request, response);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
