package com.etc.test;

import com.etc.entity.User;
import com.etc.service.impl.UserServiceImpl;
import com.etc.service01.UserService;

public class TestUserReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService us=new UserServiceImpl();
		User u=new User(1,"�˻�","123456","����","��","123456","123","����",null);
		boolean flag=us.UserReg(u);
		
		if(flag) {
			System.out.println("ע��ɹ�");
		}else {
			System.out.println("ע��ʧ��");
		}

	}



}
