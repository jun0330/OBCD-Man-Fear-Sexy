package com.etc.test;

import java.util.List;

import com.etc.entity.Express;
import com.etc.service.ExpressService;
import com.etc.service.impl.ExpressServiceImpl;

public class TestExpressAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressService es = new ExpressServiceImpl();
		
		/*������ӹ���
		 * 
		 * Express e = new Express(1, "Dwade");
		boolean flag = es.addExpress(e);

		if(flag) {
			System.out.println("��ӳɹ�!");
		}else {
			System.out.println("���ʧ��");
		}*/
		
		/*
		 * ��ѯ����
		 * List<Express> list = es.queryAllExpress();
		for (Express express : list) {
			System.out.println(express);
		}*/
		
		/*
		 * �޸�������
		 * Express e = new Express("dd", 1);
		boolean flga = es.updateExpress(e);
		if(flga) {
			System.out.println("�޸ĳɹ�!");
		}else {
			System.out.println("�޸�ʧ��");
		}*/
		
		
		boolean flag = es.delExpressById(1);
		if(flag) {
			System.out.println("ɾ���ɹ�~");
		}else {
			System.out.println("ɾ��ʧ��~");
		}
	}

}
