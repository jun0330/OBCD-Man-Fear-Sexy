package com.etc.dao;

import com.etc.entity.Admin;

public interface AdminDao {
	
	public boolean addAdmin(Admin admin);
	
	// �����˻����������ѯ����Ա��Ϣ
	public Admin queryAdminByAccountAndPwd(String adminAccount, String adminPwd);
	
	public boolean updateAdmin(Admin admin);

}
