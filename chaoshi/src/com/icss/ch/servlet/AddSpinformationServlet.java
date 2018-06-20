package com.icss.ch.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icss.ch.service.MembersService;
import com.icss.ch.service.SpinformationService;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Spinformation;


@WebServlet("/AddSpinformationServlet")
public class AddSpinformationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//获取请求参数
				String spid = request.getParameter("spid");
				String spname = request.getParameter("spname");		
				String spprice = request.getParameter("spprice");
				String kcnum = request.getParameter("kcnum");
				String manufacyurerid = request.getParameter("manufacyurerid");
				SpinformationService service =  new SpinformationService();
				Spinformation spin = new Spinformation(Integer.parseInt(spid),spname,spprice,Integer.parseInt(kcnum),manufacyurerid);				
				int flag = service.AddSpinformation(spin);				
				if(flag == 1)
				{
					request.setAttribute("msg", "嘻嘻，加好了啊~");
					request.getRequestDispatcher("SelectAllSpinformationServlet").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "不对啊，重新试试吧");
					request.getRequestDispatcher("spinformation.jsp").forward(request, response);
				}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
