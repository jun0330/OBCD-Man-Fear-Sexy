package com.etc.test;

import com.etc.entity.Admin;
import com.etc.service.AdminService;
import com.etc.service.impl.AdminServiceImpl;

public class TestAdminReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService as = new AdminServiceImpl();
		Admin a = new Admin(1, "ss", "123", "ds");
		boolean flag=as.AdminReg(a);
		if(flag) {
			System.out.println("ע��ɹ�");
		}else {
			System.out.println("ע��ʧ��");
		}

	}

}
