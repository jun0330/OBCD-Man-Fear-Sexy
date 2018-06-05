package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.dao.impl.UserDaoImpl;
import com.etc.entity.User;
import com.etc.service01.UserService;

public class UserServiceImpl implements UserService {
	UserDao ud=new UserDaoImpl();

	@Override
	public boolean UserReg(User user) {
		// TODO Auto-generated method stub
		return ud.addUser(user);
	}

}
