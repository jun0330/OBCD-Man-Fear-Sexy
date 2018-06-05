package com.etc.test;

import java.util.List;

import com.etc.entity.Admin;
import com.etc.service.impl.AdminServiceImpl;
import com.etc.service01.AdminService;
import com.etc.util.DBUtil;

public class TestUpdateAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService as = new AdminServiceImpl();
		
		Admin admin=new Admin("ee","321",1);
	
		boolean flag=as.updateGetAdmin(admin);
		
			if(flag) {
				System.out.println("修改成功");
			}else {
				System.out.println("修改失败");
			}
			

		
		
		}

	}


