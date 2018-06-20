package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.service.NoticesService;
import com.icss.ch.service.SpinformationService;
import com.icss.ch.vo.Notices;
import com.icss.ch.vo.Spinformation;

@WebServlet("/AddNoticesServlet")
public class AddNoticesServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//获取请求参数
		String noticeboard = request.getParameter("noticeboard");
		NoticesService service =  new NoticesService();
		Notices not = new Notices(noticeboard);				
		int flag = service.AddNotices(not);				
		if(flag == 1)
		{
			request.setAttribute("msg", "嘻嘻，加好了啊~");
			request.getRequestDispatcher("SelectNoticesServlet").forward(request, response);
		}
		else
		{
			request.setAttribute("msg", "不对啊，重新试试吧");
			request.getRequestDispatcher("notices.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.doGet(request, response);
	}

}
