package com.etc.service;

import java.util.List;

import com.etc.entity.Express;

public interface ExpressService {
	
	//��ӿ��service
	public boolean addExpress(Express express);
	
	//ɾ����ݵ�service
	public boolean delExpressById(int eid);

	//�޸Ŀ�����Ƶ�service
	public boolean updateExpress(Express express);
	
	//��ѯ��ݵ�service
	public List<Express> queryAllExpress();
}
