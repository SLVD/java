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
		//获取请求参数
		String spip = request.getParameter("spip");
		//调用dao
		SpinformationDao dao =  new SpinformationDao();
		//转型
		dao.DeleteSpinformation(Integer.parseInt(spip));	
		request.setAttribute("msg", "嘻嘻，操作成功了！");
		request.getRequestDispatcher("SelectAllSpinformationServlet").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
