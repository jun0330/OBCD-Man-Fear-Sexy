package com.etc.service01;

import com.etc.entity.User;


public interface UserService {
	
	public boolean UserReg(User user);
	
	public User userLogin(String userAccount, String userPwd);
	
	public boolean updateGetUser(User user);

}
