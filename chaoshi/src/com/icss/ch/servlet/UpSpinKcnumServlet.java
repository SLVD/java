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
		//��ȡ�������
		String spip = request.getParameter("spip");
		//����dao
		SpinformationDao dao =  new SpinformationDao();
		//ת��
		
		String code = request.getParameter("code");
		//��ת
		if(code.equals("maichu"))
		{
			dao.UpdateSpinKcnum(Integer.parseInt(spip));
			request.setAttribute("msg", "���������ȥ�˰���");
			request.getRequestDispatcher("SelectSpinKcnusServlet").forward(request, response);
		}
		
		if(code.equals("jinhuo"))
		{
			dao.UpdateSpinAddKcnum(Integer.parseInt(spip));
			request.setAttribute("msg", "�������ѽ�����");
			request.getRequestDispatcher("SelectSpinKcnusServlet").forward(request, response);
		}	
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request, response);
	}

}
