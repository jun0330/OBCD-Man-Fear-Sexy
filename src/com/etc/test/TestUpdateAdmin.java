package com.etc.test;

import java.util.List;

import com.etc.entity.Admin;
import com.etc.service.AdminService;
import com.etc.service.impl.AdminServiceImpl;
import com.etc.util.DBUtil;

public class TestUpdateAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService as = new AdminServiceImpl();
		
		Admin admin=new Admin("ee","321",1);
	
		boolean flag=as.updateGetAdmin(admin);
		
			if(flag) {
				System.out.println("�޸ĳɹ�");
			}else {
				System.out.println("�޸�ʧ��");
			}
			

		
		
		}

	}


