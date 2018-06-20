package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.service.MembersService;
import com.icss.ch.service.UsersService;
import com.icss.ch.vo.Members;

@WebServlet("/AddMembersServlet")
public class AddMembersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获取请求参数
				String memberid = request.getParameter("memberid");
				String cardnum = request.getParameter("cardnum");		
				String summoney = request.getParameter("summoney");
				String registrationdate = request.getParameter("registrationdate");
				MembersService service =  new MembersService();
				Members mem = new Members(Integer.parseInt(memberid),cardnum,summoney,registrationdate);					
				int flag = service.AddMembers(mem);				
				if(flag == 1)
				{
					request.setAttribute("msg", "嘻嘻，加好了啊~");
					request.getRequestDispatcher("SelectMembersServlet").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "不对啊，重新试试吧");
					request.getRequestDispatcher("members.jsp").forward(request, response);
				}
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
