package com.etc.dao.impl;

import com.etc.dao.UserDao;
import com.etc.entity.User;
import com.etc.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into tab_user values(?,?,?,?,?,?,?,?,?)", user.getUSERID(),
				user.getUSERACCOUNT(),user.getUSERPWD(),user.getUSERNICKNAME(),user.getUSERSEX(),user.getUSERIDCARD(),
				user.getUSEREMALL(),user.getUSERADDRESS(),user.getUSERDATE())>0;
	}

}
