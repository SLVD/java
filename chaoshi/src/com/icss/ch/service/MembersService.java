package com.icss.ch.service;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.vo.Members;

public class MembersService {
	
	MembersDao dao = new MembersDao();

	//�ӻ�Ա��ҵ���߼�
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
