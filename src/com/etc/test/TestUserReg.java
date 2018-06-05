package com.etc.test;

import com.etc.entity.User;
import com.etc.service.impl.UserServiceImpl;
import com.etc.service01.UserService;

public class TestUserReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us=new UserServiceImpl();
		User u=new User(1,"账户","123456","名称","男","123456","123","厦门",null);
		boolean flag=us.UserReg(u);
		
		if(flag) {
			System.out.println("注册成功");
		}else {
			System.out.println("注册失败");
		}

	}



}
