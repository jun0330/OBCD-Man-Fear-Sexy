package com.etc.test;

import java.util.List;

import com.etc.entity.Admin;
import com.etc.service.impl.AdminServiceImpl;
import com.etc.service01.AdminService;
import com.etc.util.DBUtil;

public class TestAdminLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService as = new AdminServiceImpl();
	
		Admin a=as.adminLogin("qq", "123");
		
			if(a!=null) {
				System.out.println("µÇÂ½³É¹¦");
			}else {
				System.out.println("µÇÂ½Ê§°Ü");
			}
			

		
		
		}

	}


