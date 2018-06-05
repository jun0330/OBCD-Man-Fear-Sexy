package com.etc.test;

import java.util.List;

import com.etc.entity.Express;
import com.etc.service.ExpressService;
import com.etc.service.impl.ExpressServiceImpl;

public class TestExpressAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpressService es = new ExpressServiceImpl();
		
		/*测试添加功能
		 * 
		 * Express e = new Express(1, "Dwade");
		boolean flag = es.addExpress(e);

		if(flag) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败");
		}*/
		
		/*
		 * 查询测试
		 * List<Express> list = es.queryAllExpress();
		for (Express express : list) {
			System.out.println(express);
		}*/
		
		/*
		 * 修改语句测试
		 * Express e = new Express("dd", 1);
		boolean flga = es.updateExpress(e);
		if(flga) {
			System.out.println("修改成功!");
		}else {
			System.out.println("修改失败");
		}*/
		
		
		boolean flag = es.delExpressById(1);
		if(flag) {
			System.out.println("删除成功~");
		}else {
			System.out.println("删除失败~");
		}
	}

}
