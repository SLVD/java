package com.icss.ch.service;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.vo.Members;

public class MembersService {
	
	MembersDao dao = new MembersDao();

	//加会员的业务逻辑
			public int AddMembers(Members mem)
			{
				Members dbmem = dao.selectByMemberid(mem.getMemberid());
				
				if( dbmem == null)
				{
					dao.insertMembers(mem);
					return 1;
				}
				else
				{
					return 0;
				}
			}

}
