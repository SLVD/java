package com.icss.ch.service;

import com.icss.ch.dao.MembersDao;
import com.icss.ch.dao.MessagesDao;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Messages;

public class MessagesService {
	
	

	MessagesDao dao = new MessagesDao();

	//�����Ե�ҵ���߼�
			public int AddMessages(Messages mes )
			{
				Messages dbmes = dao.selectByMessagesip(mes.getMessageip());
				
				if( dbmes == null)
				{
					dao.insertMessages(mes);
					return 1;
				}
				else
				{
					return 0;
				}
			}

}
