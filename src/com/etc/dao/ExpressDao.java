package com.etc.dao;

import java.util.List;

import com.etc.entity.Express;

public interface ExpressDao {
	//����
	public boolean addExpress(Express express);
	
	//ɾ��
	public boolean delExpress(int eid);
	
	//�޸�
	public boolean updateExpress(Express express);
	
	//��ѯ
	public List<Express> queryAllExpress();

}
