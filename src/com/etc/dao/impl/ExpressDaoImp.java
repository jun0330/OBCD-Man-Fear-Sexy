package com.etc.dao.impl;

import java.util.List;

import com.etc.dao.ExpressDao;
import com.etc.entity.Express;
import com.etc.util.DBUtil;

public class ExpressDaoImp implements ExpressDao {

	//���ӿ�ݵ�dapʵ����
	@Override
	public boolean addExpress(Express express) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_express values(?,?)",express.getEID(),express.getENAME())>0;
	}

	//ɾ����ݵ�daoʵ����
	@Override
	public boolean delExpress(int eid) {
		// TODO Auto-generated method stub
		return DBUtil.execute("delete from tab_express where EID = ?", eid)>0;
	}

	//�޸Ŀ��dao��ʵ����
	@Override
	public boolean updateExpress(Express express) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update tab_express set ENAME = ? where EID=? ", express.getENAME(),express.getEID())>0;
	}

	//��ѯ���dao��ʵ����
	@Override
	public List<Express> queryAllExpress() {
		// TODO Auto-generated method stub
		return (List<Express>) DBUtil.select("select * from tab_express", Express.class);
	}

}
