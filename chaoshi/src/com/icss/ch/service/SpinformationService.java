package com.icss.ch.service;

import com.icss.ch.dao.SpinformationDao;
import com.icss.ch.vo.Spinformation;

public class SpinformationService {
	

	SpinformationDao dao = new SpinformationDao();

	//�ӻ�Ա��ҵ���߼�
			public int AddSpinformation(Spinformation spin)
			{
				Spinformation dbspin = dao.selectBySpip(spin.getSpip());
				
				if( dbspin == null)
				{
					dao.insertSpinformation(spin);
					return 1;
				}
				else
				{
					return 0;
				}
			}


}
