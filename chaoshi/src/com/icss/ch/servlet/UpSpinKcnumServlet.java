package com.icss.ch.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.SpinformationDao;
import com.icss.ch.dao.UsersDao;
import com.icss.ch.vo.Spinformation;

@WebServlet("/UpSpinKcnumServlet")
public class UpSpinKcnumServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//获取请求参数
		String spip = request.getParameter("spip");
		//调用dao
		SpinformationDao dao =  new SpinformationDao();
		//转型
		
		String code = request.getParameter("code");
		//跳转
		if(code.equals("maichu"))
		{
			dao.UpdateSpinKcnum(Integer.parseInt(spip));
			request.setAttribute("msg", "嘻嘻，买出去了啊！");
			request.getRequestDispatcher("SelectSpinKcnusServlet").forward(request, response);
		}
		
		if(code.equals("jinhuo"))
		{
			dao.UpdateSpinAddKcnum(Integer.parseInt(spip));
			request.setAttribute("msg", "嘻嘻，已进货！");
			request.getRequestDispatcher("SelectSpinKcnusServlet").forward(request, response);
		}	
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request, response);
	}

}
