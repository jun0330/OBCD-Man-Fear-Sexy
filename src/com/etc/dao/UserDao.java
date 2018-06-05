package com.etc.dao;

import com.etc.entity.User;


public interface UserDao {
	
	public boolean addUser(User user);
	
	// �����˻����������ѯ�û���Ϣ
	public User queryUserByAccountAndPwd(String userAccount, String userPwd);
	
	public boolean updateUser(User user);

}
