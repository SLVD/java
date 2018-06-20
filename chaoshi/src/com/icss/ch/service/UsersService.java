package com.icss.ch.service;

import com.icss.ch.dao.UsersDao;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Users;

public class UsersService {
	

	UsersDao dao = new UsersDao();	
	int flag = 0;
	//判断业务逻辑的
	//用户名和密码和状态值正确的人才能登陆
	public int login(String username,String password){
		
		Users dbuse = dao.selectBynamepass(username, password);
		System.out.println(dbuse+"***************");
		if(dbuse != null){
			//判断状态值
			if(dbuse.getUserstatus().equals("1")){
				flag = 1;//可以登录
			}
			if(dbuse.getUserstatus().equals("2")){
				flag = 2;//审核失败，重新注册
			}
			if(dbuse.getUserstatus().equals("3")){
				flag = 3;//正在审核，请耐心等待
			}
			
		}
		return flag;
	}

	
	
	//注册员工的业务逻辑
		public int AddUsers(Users use)
		{
			Users dbuse = dao.selectByname(use.getUsername());
			
			if( dbuse == null)
			{
				dao.insertUsers(use);
				return 1;
			}
			else
			{
				return 0;
			}
		}
		
		

		
		

}
