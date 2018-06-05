package com.etc.test;

import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;

public class TestUserReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us = new UserServiceImpl();
		User u = new User(3, "s", "123", "ds", "ds", "das", "dsa", "dsa");
		boolean flag=us.UserReg(u);
		if(flag) {
			System.out.println("×¢²á³É¹¦");
		}else {
			System.out.println("×¢²áÊ§°Ü");
		}

	}

}
