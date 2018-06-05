package com.etc.test;

import java.util.List;

import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;
import com.etc.util.DBUtil;

public class TestUserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us = new UserServiceImpl();
	
		User u=us.userLogin("bb", "123");
		
			if(u!=null) {
				System.out.println("µÇÂ½³É¹¦");
			}else {
				System.out.println("µÇÂ½Ê§°Ü");
			}
			
//		List<User> list = (List<User>) DBUtil.select("select * from tab_user where userAccount=? and userPwd=?",
//				User.class, "s", "123");
//		for(User user:list) {
//			System.out.println(user);
//		}
		
		
		}

	}


