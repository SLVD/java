package com.icss.ch.service;

import com.icss.ch.dao.UsersDao;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Users;

public class UsersService {
	

	UsersDao dao = new UsersDao();	
	int flag = 0;
	//�ж�ҵ���߼���
	//�û����������״ֵ̬��ȷ���˲��ܵ�½
	public int login(String username,String password){
		
		Users dbuse = dao.selectBynamepass(username, password);
		System.out.println(dbuse+"***************");
		if(dbuse != null){
			//�ж�״ֵ̬
			if(dbuse.getUserstatus().equals("1")){
				flag = 1;//���Ե�¼
			}
			if(dbuse.getUserstatus().equals("2")){
				flag = 2;//���ʧ�ܣ�����ע��
			}
			if(dbuse.getUserstatus().equals("3")){
				flag = 3;//������ˣ������ĵȴ�
			}
			
		}
		return flag;
	}

	
	
	//ע��Ա����ҵ���߼�
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
