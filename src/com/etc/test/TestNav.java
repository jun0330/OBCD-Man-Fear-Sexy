package com.etc.test;

import java.util.List;

import com.etc.entity.Nav;
import com.etc.service.NavService;
import com.etc.service.impl.NavServiceImpl;

public class TestNav {
	public static void main(String[] args) {
		NavService ns=new NavServiceImpl();
		List<Nav> ll=ns.getNav();
		
		for (Nav nav : ll) {
			System.out.println(nav);
		}
	}
}
