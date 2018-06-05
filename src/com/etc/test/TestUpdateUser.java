package com.etc.test;

import java.util.List;

import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.service.impl.UserServiceImpl;
import com.etc.util.DBUtil;

public class TestUpdateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us = new UserServiceImpl();
		
		User user=new User("321","bb","nv","21","48","quanzhou",2);
	
		boolean flag=us.updateGetUser(user);
		
			if(flag) {
				System.out.println("修改成功");
			}else {
				System.out.println("修改失败");
			}
			

		
		
		}

	}


