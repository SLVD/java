package com.icss.ch.service;


import com.icss.ch.dao.NoticesDao;
import com.icss.ch.vo.Notices;

public class NoticesService {
	
	NoticesDao dao = new NoticesDao();

	//加会员的业务逻辑
			public int AddNotices(Notices not)
			{
				Notices dbnot = dao.selectByNoticeip(not.getNoticeip());
				
				if( dbnot == null)
				{
					dao.insertNotices(not);
					return 1;
				}
				else
				{
					return 0;
				}
			}
	

}
