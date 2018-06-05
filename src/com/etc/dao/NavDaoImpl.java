package com.etc.dao;

import java.util.List;

import com.etc.entity.Nav;
import com.etc.util.DBUtil;

public class NavDaoImpl implements NavDao {

	@Override
	public List<Nav> queryNav() {
		return (List<Nav>)DBUtil.select("select * from tab_nav order by navindex",Nav.class);
	}

}
