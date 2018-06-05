package com.etc.service.impl;

import java.util.List;

import com.etc.dao.NavDao;
import com.etc.dao.NavDaoImpl;
import com.etc.entity.Nav;
import com.etc.service.NavService;

public class NavServiceImpl implements NavService{
	NavDao nd=new NavDaoImpl();
	@Override
	public List<Nav> getNav() {	
		return nd.queryNav();
	}

}
